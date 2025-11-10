package Tasks;

/**
 * The Complexity interface represents the complexity of tasks.
 * It provides methods to set and get the complexity of tasks.
 */
public interface Complexity {
    /**
     * Sets the complexity of a task at the specified index.
     * @param complexity the complexity value to set
     * @param index the index of the task
     */
    void setComplexity(int complexity, int index);

    /**
     * Gets the complexity of the task at the specified index.
     * @param index the index of the task
     * @return the complexity value of the task at the specified index
     */
    int getComplexity(int index);
}
