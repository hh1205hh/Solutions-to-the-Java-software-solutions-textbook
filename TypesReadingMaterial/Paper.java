/*
Design and implement a set of classes that define various types of reading material:
books, novels, magazines, technical journals, textbooks, and so on. Include data values that 
describe various attributes to the material, such as the number of pages and the names of the
primary characters. Include methods that are named appropriately for each class and that print
an appropriate message. Create a main driver class to instantiate and exercise several of the classes.
*/

package TypesReadingMaterial;

import java.util.Arrays;

/**
 * The Paper class represents a generic type of paper material.
 */
public class Paper {
    protected int numPages;
    protected String[] primaryCharactersNames;
    protected String title;
    protected String authorName;
    protected String publisherName;
    protected Long publicationYear;

    /**
     * Constructs a Paper object with the specified attributes.
     * @param numPages The number of pages in the paper material.
     * @param primaryCharactersNames The names of primary characters in the paper material.
     * @param title The title of the paper material.
     * @param authorName The name of the author of the paper material.
     * @param publisherName The name of the publisher of the paper material.
     * @param publicationYear The publication year of the paper material.
     */
    public Paper(int numPages, String[] primaryCharactersNames, String title, 
                String authorName, String publisherName, Long publicationYear) {
        this.numPages = numPages;
        this.primaryCharactersNames = primaryCharactersNames;
        this.title = title;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.publicationYear = publicationYear;
   }

    /**
     * Gets the number of pages in the paper material.
     * @return The number of pages.
     */
    public int getNumPages() {
        return numPages;
    }

    /**
     * Sets the number of pages in the paper material.
     * @param newNumPages The new number of pages.
     */
    public void setNumPages(int newNumPages) {
        this.numPages = newNumPages;
    }

    /**
     * Gets the names of primary characters in the paper material.
     * @return An array containing the names of primary characters.
     */
    public String[] getPrimaryCharactersNames() {
        return primaryCharactersNames;
    }

    /**
     * Sets the names of primary characters in the paper material.
     * @param newPrimaryCharactersNames The new array of primary characters names.
     */
    public void setPrimaryCharactersNames(String[] newPrimaryCharactersNames) {
        this.primaryCharactersNames = newPrimaryCharactersNames;
    }

    /**
     * Gets the title of the paper material.
     * @return The title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the paper material.
     * @param newTitle The new title.
     */
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    /**
     * Gets the name of the author of the paper material.
     * @return The author's name.
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * Sets the name of the author of the paper material.
     * @param newAuthorName The new author's name.
     */
    public void setAuthorName(String newAuthorName) {
        this.authorName = newAuthorName;
    }

    /**
     * Gets the name of the publisher of the paper material.
     * @return The publisher's name.
     */
    public String getPublisherName() {
        return publisherName;
    }

    /**
     * Sets the name of the publisher of the paper material.
     * @param newPublisherName The new publisher's name.
     */
    public void setPublisherName(String newPublisherName) {
        this.publisherName = newPublisherName;
    }

    /**
     * Gets the publication year of the paper material.
     * @return The publication year.
     */
    public Long getPublicationYear() {
        return publicationYear;
    }

    /**
     * Sets the publication year of the paper material.
     * @param newPublicationYear The new publication year.
     */
    public void setPublicationYear(Long newPublicationYear) {
        this.publicationYear = newPublicationYear;
    } 

    /**
     * Returns a string representation of the Paper object.
     * @return A string containing information about the paper material.
     */
    @Override
    public String toString() {
        return "Num of pages: " + numPages + System.lineSeparator() + 
                "Primary characters names: " + Arrays.toString(primaryCharactersNames) + System.lineSeparator() + 
                "Title: " + title + System.lineSeparator() + 
                "Author name: " + authorName + System.lineSeparator() + 
                "Publisher name: " + publisherName + System.lineSeparator() + 
                "Publication year: " + publicationYear;
    }
}
