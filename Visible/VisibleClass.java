/*
// Create an interface that includes two methods: makeVisible and makeInvisible. 
// Both methods should take no parameters and should return a Boolean result.
// Describe how a class called VisibleClass might implement this interface.
*/

package Visible;

/**
 * The VisibleClass class implements the Visible interface and represents an object that can be visible or invisible.
 */
public class VisibleClass implements Visible {
    private boolean visible;

    /**
     * Constructs a new VisibleClass object and initializes it as visible.
     */
    public VisibleClass() {
        this.visible = true;
    }

    /**
     * Makes the object visible.
     * 
     * @return true if the object is successfully made visible, false otherwise.
     */
    @Override
    public boolean makeVisible() {
        this.visible = true;
        return visible;
    }

    /**
     * Makes the object invisible.
     * 
     * @return true if the object is successfully made invisible, false otherwise.
     */
    @Override
    public boolean makeInvisible() {
        this.visible = false;
        return visible;
    }
}

