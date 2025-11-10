package Course;

/**
 * Represents a student with a first name, last name, home address, school address, and average score.
 */
class Student {
    private String firstName;
    private String lastName;
    private Address homeAddress;
    private Address schoolAddress;
    private double average;

    /**
     * Constructs a Student object with the specified details.
     * @param firstName The first name of the student.
     * @param lastName The last name of the student.
     * @param homeAddress The home address of the student.
     * @param schoolAddress The school address of the student.
     * @param average The average score of the student.
     */
    public Student(String firstName, String lastName, Address homeAddress, Address schoolAddress, double average) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
        this.average = average;
    }

    /**
     * Gets the average score of the student.
     * @return The average score of the student.
     */
    public double getAverageStudent() {
        return this.average;
    }

    /**
     * Gets the first name of the student.
     * @return The first name of the student.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the student.
     * @param newFirstName The new first name of the student.
     */
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    /**
     * Gets the last name of the student.
     * @return The last name of the student.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the student.
     * @param newLastName The new last name of the student.
     */
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    /**
     * Gets the home address of the student.
     * @return The home address of the student.
     */
    public Address getHomeAddress() {
        return homeAddress;
    }

    /**
     * Sets the home address of the student.
     * @param newHomeAddress The new home address of the student.
     */
    public void setHomeAddress(Address newHomeAddress) {
        this.homeAddress = newHomeAddress;
    }

    /**
     * Gets the school address of the student.
     * @return The school address of the student.
     */
    public Address getSchoolAddress() {
        return schoolAddress;
    }

    /**
     * Sets the school address of the student.
     * @param newSchoolAddress The new school address of the student.
     */
    public void setSchoolAddress(Address newSchoolAddress) {
        this.schoolAddress = newSchoolAddress;
    }

    /**
     * Gets the average score of the student.
     * @return The average score of the student.
     */
    public double getAverage() {
        return average;
    }

    /**
     * Sets the average score of the student.
     * @param average The new average score of the student.
     */
    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return  "Name of the student: " + this.firstName + " " + lastName + "\n" +
                "Home address: " + this.homeAddress + "\n" +
                "School address: " + this.schoolAddress + "\n" +
                "Average score: " + this.average;
    }
}
