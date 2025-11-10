package Course;

/**
 * The CourseMain class contains the main method to demonstrate the functionality of the Course, Student, and Address classes.
 */
public class CourseMain{
    public static void main(String[] args) {
        Course course = new Course("Machine learning");
        // Assigning the school's address
        Address addressSchool = new Address("Lemon Street", "Tel Aviv", "12345", 54321L);

        // Declaring addresses of students in the course
        Address addressHaim = new Address("Rivka Emno Street", "Ahismach", "54321", 1234L);
        Address addressJohn = new Address("First Street 123", "The Village", "67890", 567L);
        Address addressSasha = new Address("Oak Street 456", "The Village", "98765", 890L);
        
        // Also their names
        Student Haim = new Student("Haim", "Levhar", addressHaim, addressSchool, 95);
        Student John = new Student("John", "Doe", addressJohn, addressSchool, 85);
        Student Sasha = new Student("Sasha", "Ivanhoe", addressSasha, addressSchool, 60);
        
        // Adding them into the course
        course.addStudent(Haim);
        course.addStudent(John);
        course.addStudent(Sasha);

        // Display information about the students
        course.roll();
        System.out.println("Average test score of all students in the course: " + course.average());
    }
}