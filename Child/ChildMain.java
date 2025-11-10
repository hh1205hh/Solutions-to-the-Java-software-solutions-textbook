package Child;

public class ChildMain {
    public static void main(String[] args) {
        Child child = new Child(15.5);
    
        System.out.println("Current age: " + child.getAge());
    
        child.setAge(18);
    
        System.out.println("After reset: " + child.getAge());

    }
}
