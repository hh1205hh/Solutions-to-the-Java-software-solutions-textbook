/*
Write a Java interface called Priority that includes two methods:
setPriority and getPriority. The interface should define a way to establish 
numeric priority among a set of objects.
Design and implement a class called PriorityTask that represents a task 
(such as on a to-do list) that implements the Priority interface.
Create a driver class to exercise some PriorityTask objects.
Modify the PriorityTask class so that it also implements the 
Complexity interface.
Modify the driver class to show these new features of PriorityTask object.
*/
package Tasks;

import java.util.ArrayList;

/**
 * The PriorityTask class represents a task with priority and complexity.
 * It implements both the Priority and Complexity interfaces.
 */
public class PriorityTask implements Priority, Complexity {
    private ArrayList<String> tasks;
    private ArrayList<Integer> complexities;

    /**
     * Constructs a PriorityTask object with empty lists for tasks and complexities.
     */
    public PriorityTask() {
        tasks = new ArrayList<>();
        complexities = new ArrayList<>();
    }

    /**
     * Sets the complexity of a task at the specified index.
     * @param complexity the complexity value to set
     * @param index the index of the task to set complexity for
     */
    @Override
    public void setComplexity(int complexity, int index) {
        complexities.set(index, complexity);
    }

    /**
     * Gets the complexity of a task at the specified index.
     * @param index the index of the task to get complexity for
     * @return the complexity value of the task at the specified index
     */
    @Override
    public int getComplexity(int index) {
        return complexities.get(index);
    }

    /**
     * Sets the priority of tasks.
     * @param tasks the list of tasks to set priorities for
     */
    @Override
    public void setPriority(ArrayList<String> tasks) {
        this.tasks = tasks;
        // Initialize complexities list with default value (0) for each task
        complexities.clear();
        for (int i = 0; i < tasks.size(); i++) {
            complexities.add(0);
        }
    }

    /**
     * Gets the priority of tasks.
     * @return the list of tasks with their priorities
     */
    @Override
    public ArrayList<String> getPriority() {
        return tasks;
    }
}
