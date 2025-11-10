package TypesReadingMaterial;

/**
 * The TechnicalJournals class represents a technical journal, which is a type of paper material.
 * It inherits properties from the Paper class.
 */
public class TechnicalJournals extends Paper {
    
    /**
     * Constructs a TechnicalJournals object with the specified attributes.
     * @param numPages The number of pages in the technical journal.
     * @param primaryCharactersNames The names of primary characters in the technical journal.
     * @param title The title of the technical journal.
     * @param authorName The name of the author of the technical journal.
     * @param publisherName The name of the publisher of the technical journal.
     * @param publicationYear The publication year of the technical journal.
     */
    public TechnicalJournals(int numPages, String[] primaryCharactersNames, String title, 
                             String authorName, String publisherName, Long publicationYear) {
        super(numPages, primaryCharactersNames, title, authorName, publisherName, publicationYear);
    }

    /**
     * Returns a string representation of the TechnicalJournals object.
     * @return A string containing information about the technical journal.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
