package Tasks;

import java.util.ArrayList;

/**
 * The PriorityMain class demonstrates the usage of PriorityTask objects.
 */
public class PriorityMain {
    public static void main(String[] args) {
        // Create a PriorityTask object
        PriorityTask priorityTask = new PriorityTask();

        // Create a list of tasks
        ArrayList<String> priorityList = new ArrayList<>();
        priorityList.add("Understanding the problem");
        priorityList.add("Establishing the requirements");
        priorityList.add("Creating a design");
        priorityList.add("Implementing the design");
        priorityList.add("Testing the program");

        // Set priorities and complexities for tasks
        priorityTask.setPriority(priorityList);
        priorityTask.setComplexity(8, 0);
        priorityTask.setComplexity(6, 1);
        priorityTask.setComplexity(8, 2);
        priorityTask.setComplexity(9, 3);
        priorityTask.setComplexity(5, 4);

        // Display the priorities and complexities of tasks
        System.out.println("The priority of tasks of software design: ");
        for (int i = 0; i < priorityList.size(); i++) {
            System.out.println(i + ": " + priorityList.get(i) + " (Complexity: " + priorityTask.getComplexity(i) + ")");
        }
    }
}
