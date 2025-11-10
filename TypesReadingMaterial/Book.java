package TypesReadingMaterial;

/**
 * The Book class represents a book, which is a type of paper material.
 * It inherits properties from the Paper class.
 */
public class Book extends Paper {
    
    /**
     * Constructs a Book object with the specified attributes.
     * @param numPages The number of pages in the book.
     * @param primaryCharactersNames The names of primary characters in the book.
     * @param title The title of the book.
     * @param authorName The name of the author of the book.
     * @param publisherName The name of the publisher of the book.
     * @param publicationYear The publication year of the book.
     */
    public Book(int numPages, String[] primaryCharactersNames, String title, 
                String authorName, String publisherName, Long publicationYear) {
        super(numPages, primaryCharactersNames, title, authorName, publisherName, publicationYear);
    }

    /**
     * Returns a string representation of the Book object.
     * @return A string containing information about the book.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
