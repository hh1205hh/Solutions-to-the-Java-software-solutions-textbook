package TypesReadingMaterial;

/**
 * The Textbooks class represents a textbook, which is a type of paper material.
 * It inherits properties from the Paper class.
 */
public class Textbooks extends Paper {
    
    /**
     * Constructs a Textbooks object with the specified attributes.
     * @param numPages The number of pages in the textbook.
     * @param primaryCharactersNames The names of primary characters in the textbook.
     * @param title The title of the textbook.
     * @param authorName The name of the author of the textbook.
     * @param publisherName The name of the publisher of the textbook.
     * @param publicationYear The publication year of the textbook.
     */
    public Textbooks(int numPages, String[] primaryCharactersNames, String title, 
                     String authorName, String publisherName, Long publicationYear) {
        super(numPages, primaryCharactersNames, title, authorName, publisherName, publicationYear);
    }

    /**
     * Returns a string representation of the Textbooks object.
     * @return A string containing information about the textbook.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
