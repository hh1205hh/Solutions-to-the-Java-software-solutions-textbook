package BreakAble;

/**
 * The BreakAble interface represents objects that can break, be fixed, and checked for their broken state.
 */
public interface BreakAble {
    /**
     * Breaks the object.
     */
    public void breakObject();

    /**
     * Fixes the object.
     */
    public void fixObject();

    /**
     * Checks if the object is broken.
     * @return true if the object is broken, false otherwise.
     */
    public boolean isBroken();
}
