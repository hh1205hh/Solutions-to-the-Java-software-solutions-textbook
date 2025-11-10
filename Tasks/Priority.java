package Tasks;

import java.util.ArrayList;

/**
 * The Priority interface represents the priority of tasks.
 * It provides methods to set and get the priority of tasks.
 */
public interface Priority {
    /**
     * Sets the priority of tasks.
     * @param tasks the list of tasks to set priorities for
     */
    void setPriority(ArrayList<String> tasks);

    /**
     * Gets the priority of tasks.
     * @return the list of tasks with their priorities
     */
    ArrayList<String> getPriority();
}
