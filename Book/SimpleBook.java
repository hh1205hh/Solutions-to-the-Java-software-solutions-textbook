/*
Write a class called Book that contains instance data for the title, author, publisher, and copyright data.
Define the book constructor to accept and initialize this data, include setter and getter methods for all instance data.
Include a toString method that return a nicely formatted, multi-line description of the book.
Create a driver class called BookShelf, whose main method instantiates and updates several Book objects
 */

package Book;

/**
 * The SimpleBook class represents a basic book with instance data for the title,
 * author, publisher, and publication year. It includes constructors, setter and
 * getter methods for all instance data, and a toString method to provide a
 * formatted description of the book.
 */
public class SimpleBook {
    private String title;
    private String authorName;
    private String publisherName;
    private String publicationYear;

    /**
     * Constructs a SimpleBook object with the given title, author name, publisher name,
     * and publication year.
     * @param title The title of the book.
     * @param authorName The name of the book's author.
     * @param publisherName The name of the book's publisher.
     * @param publicationYear The publication year of the book.
     */
    public SimpleBook(String title, String authorName, String publisherName, String publicationYear) {
        this.title = title;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.publicationYear = publicationYear;
    }

    /**
     * Sets the title of the book.
     * @param newTitle The new title of the book.
     */
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    /**
     * Sets the author name of the book.
     * @param newAuthorName The new author name of the book.
     */
    public void setAuthorName(String newAuthorName) {
        this.authorName = newAuthorName;
    }

    /**
     * Sets the publisher name of the book.
     * @param newPublisherName The new publisher name of the book.
     */
    public void setPublisherName(String newPublisherName) {
        this.publisherName = newPublisherName;
    }

    /**
     * Sets the publication year of the book.
     * @param newPublicationYear The new publication year of the book.
     */
    public void setPublicationYear(String newPublicationYear) {
        this.publicationYear = newPublicationYear;
    }

    /**
     * Gets the title of the book.
     * @return The title of the book.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Gets the author name of the book.
     * @return The author name of the book.
     */
    public String getAuthorName() {
        return this.authorName;
    }

    /**
     * Gets the publisher name of the book.
     * @return The publisher name of the book.
     */
    public String getPublisherName() {
        return this.publisherName;
    }

    /**
     * Gets the publication year of the book.
     * @return The publication year of the book.
     */
    public String getPublicationYear() {
        return this.publicationYear;
    }

    /**
     * Returns a formatted description of the book including its title, author name,
     * publisher name, and publication year.
     * @return A formatted description of the book.
     */
    @Override
    public String toString() {
        return "Title: " + this.title + System.lineSeparator() +
               "Author: " + this.authorName + System.lineSeparator() +
               "Publisher: " + this.publisherName + System.lineSeparator() +
               "Publication Year: " + this.publicationYear + System.lineSeparator();
    }
}
