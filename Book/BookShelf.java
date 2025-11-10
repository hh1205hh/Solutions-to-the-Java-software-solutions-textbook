package Book;

import TypesReadingMaterial.Book;

/**
 * The BookShelf class serves as a driver program to demonstrate the functionality
 * of the SimpleBook and Book classes. It creates instances of both types of books
 * and prints their details.
 */
public class BookShelf {
    public static void main(String[] args) {
        // Create an array of SimpleBook objects
        SimpleBook[] simpleBooks = {
            new SimpleBook("The Catcher in the Rye", "J.D. Salinger", "Little, Brown and Company", "1951"),
            new SimpleBook("Pride and Prejudice", "Jane Austen", "T. Egerton, Whitehall", "1813"),
            new SimpleBook("To Kill a Mockingbird", "Harper Lee", "J. B. Lippincott & Co.", "1960")
        };

        // Create an array of Book objects
        Book[] books = {
            new Book(416, new String[]{"Andrew Ng"}, "Machine Learning Yearning", "Andrew Ng", "Andrew Ng", 2018L),
            new Book(736, new String[]{"Trevor Haste", "Robert Tibshirani", "Jerome Friedman"}, "The Elements of Statistical Learning: Data Mining, Inference, and Prediction", "Trevor Hastie, Robert Tibshirani, Jerome Friedman", "Springer", 2009L),
            new Book(694, new String[]{"Ian Goodell", "Joshua Bagnio", "Aaron Corvine"}, "Deep Learning", "Ian Goodell, Yoshua Bengio, Aaron Courville", "MIT Press", 2016L),
            new Book(440, new String[]{"Pedro Domingo"}, "The Master Algorithm: How the Quest for the Ultimate Learning Machine Will Remake Our World", "Pedro Domingos", "Basic Books", 2015L),
            new Book(550, new String[]{"Ethel Aladdin"}, "Introduction to Machine Learning", "Ethel Aladdin", "MIT Press", 2020L),
            new Book(712, new String[]{"Christopher M. Bishop"}, "Pattern Recognition and Machine Learning", "Christopher M. Bishop", "Springer", 2006L),
            new Book(996, new String[]{"Kevin P. Murphy"}, "Machine Learning: A Probabilistic Perspective", "Kevin P. Murphy", "The MIT Press", 2012L),
            new Book(432, new String[]{"Sebastian Rasceta", "Valid Mirabile"}, "Python Machine Learning: Machine Learning and Deep Learning with Python, scikit-learn, and TensorFlow", "Sebastian Raschka, Vahid Mirjalili", "Packt Publishing", 2019L),
            new Book(410, new String[]{"Aurelian Gyron"}, "Hands-On Machine Learning with Sickie-Learn, Keas, and TensorFlow", "Aurélien Géron", "O'Reilly Media", 2019L),
            new Book(402, new String[]{"Rami Keshavamurthy", "Nashua Vira Pandel"}, "Python Machine Learning By Example: Implement machine learning algorithms and techniques using Python 3.7 and TensorFlow 2.1", "Rashmi Keshavamurthy, Anshul Vikram Pandey", "Packt Publishing", 2020L)
        };

        // Print SimpleBooks
        System.out.println("\033[0;36m╔══════════════════════════════════╗");
        System.out.println("║          \033[0;33mSimple Books          \033[0;36m  ║");
        System.out.println("╚══════════════════════════════════╝\033[0m");
        for (SimpleBook book : simpleBooks) {
            System.out.println("\033[0;32m★ " + book + " ★\033[0m");
        }

        // Print Technical Books
        System.out.println("\n\033[0;35m╔════════════════════════════════════════════╗");
        System.out.println("║            \033[0;33mTechnical Books            \033[0;35m║");
        System.out.println("╚════════════════════════════════════════════╝\033[0m");
        for (Book book : books) {
            System.out.println("\033[0;34m▶ " + book + " ◀\033[0m\n");
        }
    }
}
