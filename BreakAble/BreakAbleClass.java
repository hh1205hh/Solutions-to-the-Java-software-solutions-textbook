package BreakAble;

/**
 * Implementation of the BreakAble interface representing objects that can be broken and fixed.
 */
public class BreakAbleClass implements BreakAble {
    private boolean isBroken;
    
    /**
     * Constructs a BreakAbleClass object with initial state not broken.
     */
    public BreakAbleClass() {
        this.isBroken = false;
    }

    /**
     * Breaks the object.
     */
    @Override
    public void breakObject() {
        this.isBroken = true;
    }

    /**
     * Fixes the object.
     */
    @Override
    public void fixObject() {
        this.isBroken = false;
    }

    /**
     * Checks if the object is broken.
     * @return true if the object is broken, false otherwise.
     */
    @Override
    public boolean isBroken() {
        return this.isBroken;
    }
}
