/*
Write a class called Course that represents a course taken at a school. Represent each student using
the Student class. Use an ArrayList in the course to store the students taking that course. 
The constructor of the Course class should accept only the name of the course.
Provide a method called addStudent that accepts one Student parameter.
Provide a method called average that computes and returns the average of all students' test score average.
Provide a method called roll that prints all students in the course.
Create a driver class with a main method that creates a course, adds several students,
prints a roll, and prints the overall course test average.
*/

package Course;

import java.util.ArrayList;

/**
 * The Course class represents a course with a name and a list of students.
 */
class Course {
    private String nameCourse;
    private ArrayList<Student> students = new ArrayList<>();

    /**
     * Constructs a Course object with the given name.
     * @param nameCourse The name of the course.
     */
    public Course(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    /**
     * Adds a student to the course.
     * @param student The student to add.
     */
    public void addStudent(Student student) {
        this.students.add(student);
    }

    /**
     * Gets the name of the course.
     * @return The name of the course.
     */
    public String getNameCourse() {
        return this.nameCourse;
    }

    /**
     * Sets the name of the course.
     * @param newNameCourse The new name of the course.
     */
    public void setNameCourse(String newNameCourse) {
        this.nameCourse = newNameCourse;
    }

    /**
     * Prints a list of students enrolled in the course.
     */
    public void roll() {
        for (Student student : students) {
            System.out.println("Student: " + student + System.lineSeparator());
        }
    }

    /**
     * Calculates and returns the average of all students' scores in the course.
     * @return The average of all students' scores.
     */
    public double average() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getAverageStudent();
        }
        return sum / students.size();
    }
}
