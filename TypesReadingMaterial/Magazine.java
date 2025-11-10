package TypesReadingMaterial;

/**
 * The Magazine class represents a magazine, which is a type of paper material.
 * It inherits properties from the Paper class.
 */
public class Magazine extends Paper {
    
    /**
     * Constructs a Magazine object with the specified attributes.
     * @param numPages The number of pages in the magazine.
     * @param primaryCharactersNames The names of primary characters in the magazine.
     * @param title The title of the magazine.
     * @param authorName The name of the author of the magazine.
     * @param publisherName The name of the publisher of the magazine.
     * @param publicationYear The publication year of the magazine.
     */
    public Magazine(int numPages, String[] primaryCharactersNames, String title, 
                    String authorName, String publisherName, Long publicationYear) {
        super(numPages, primaryCharactersNames, title, authorName, publisherName, publicationYear);
    }

    /**
     * Returns a string representation of the Magazine object.
     * @return A string containing information about the magazine.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
