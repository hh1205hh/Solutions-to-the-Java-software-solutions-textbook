package SportsStatistics;

/** 
 * The AncestorDate class represents a date with day, month, and year attributes.
 * Note, I know that there is a java class library that does this assignment, and this class was made 
 * at the moment when I was needed and didn't know the Date class.
 */
public class AncestorDate {
    private int day;
    private int month;
    private int year;

    /**
     * Constructs a new AncestorDate object with the given day, month, and year.
     *
     * @param day   the day of the date
     * @param month the month of the date
     * @param year  the year of the date
     */
    public AncestorDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Gets the formatted date string in the format "day/month/year".
     *
     * @return the formatted date string
     */
    public String getDate() {
        return day + "/" + month + "/" + year;
    }
}
