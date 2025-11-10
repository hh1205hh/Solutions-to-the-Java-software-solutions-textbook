package TypesReadingMaterial;

/**
 * The Novels class represents a novel, which is a type of paper material.
 * It inherits properties from the Paper class.
 */
public class Novels extends Paper {
    
    /**
     * Constructs a Novels object with the specified attributes.
     * @param numPages The number of pages in the novel.
     * @param primaryCharactersNames The names of primary characters in the novel.
     * @param title The title of the novel.
     * @param authorName The name of the author of the novel.
     * @param publisherName The name of the publisher of the novel.
     * @param publicationYear The publication year of the novel.
     */
    public Novels(int numPages, String[] primaryCharactersNames, String title, 
                  String authorName, String publisherName, Long publicationYear) {
        super(numPages, primaryCharactersNames, title, authorName, publisherName, publicationYear);
    }

    /**
     * Returns a string representation of the Novels object.
     * @return A string containing information about the novel.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
