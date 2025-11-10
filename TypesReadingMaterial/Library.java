package TypesReadingMaterial;

/**
 * The Library class demonstrates the usage of different types of reading materials.
 */
public class Library {
    public static void main(String[] args) {
        // Creating instances of different types of reading materials
        Book book = new Book(400, new String[]{"Alice", "Bob"}, "Effective Java", "Joshua Bloch", "Addison-Wesley Professional", 2017L);
        Magazine magazine = new Magazine(100, new String[]{"John", "Emily"}, "Java Magazine", "Various", "Oracle", 2024L);
        Novels novel = new Novels(350, new String[]{"Jane", "Michael"}, "Head First Java", "Kathy Sierra, Bert Bates", "O'Reilly Media", 2005L);
        TechnicalJournals journal = new TechnicalJournals(200, new String[]{"David", "Sarah"}, "JavaWorld", "Various", "IDG Communications", 2023L);
        Textbooks textbook = new Textbooks(800, new String[]{"Peter", "Linda"}, "Java: The Complete Reference", "Herbert Schildt", "McGraw-Hill Education", 2018L);

        // Displaying information about each reading material
        System.out.println("Book:");
        System.out.println(book);
        System.out.println();

        System.out.println("Magazine:");
        System.out.println(magazine);
        System.out.println();

        System.out.println("Novel:");
        System.out.println(novel);
        System.out.println();

        System.out.println("Technical Journal:");
        System.out.println(journal);
        System.out.println();

        System.out.println("Textbook:");
        System.out.println(textbook);
    }
}
