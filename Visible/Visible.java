package Visible;

/**
 * The Visible interface represents the visibility state of an object.
 */
public interface Visible {
    /**
     * Make the object visible.
     * 
     * @return true if the object is successfully made visible, false otherwise.
     */
    boolean makeVisible();

    /**
     * Make the object invisible.
     * 
     * @return true if the object is successfully made invisible, false otherwise.
     */
    boolean makeInvisible();
}
