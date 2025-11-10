// This program hasn't created by me, I copied it from a book to display the behidescence of the program in addition to the output.

package MazeSolver;

/**
 * A class representing a maze grid with methods to traverse it.
 */
public class Maze {
    private final int TRIED = 3;
    private final int PATH = 7; 

    private int[][] grid = {
            {1, 1, 1, 0, 1, 1, 0, 0, 0, 1 ,1 ,1, 1},
            {1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1},
            {0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1 ,0, 0},
            {1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1 ,1},
            {1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1},
            {1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    };

    /**
     * Traverse the maze recursively starting from a given position.
     * 
     * @param row The row index to start traversal from.
     * @param column The column index to start traversal from.
     * @return true if the traversal successfully reaches the end of the maze, false otherwise.
     */
    public boolean traverse(int row, int column) {
        boolean done = false;

        if (valid(row, column)) { 
            grid[row][column] = TRIED;

            if (row == grid.length - 1 && column == grid[0].length - 1) {
                done = true;
            } else {
                done = traverse(row + 1, column);
                if (!done) 
                    done = traverse(row, column + 1);
                if (!done)
                    done = traverse(row - 1, column);
                if (!done)
                    done = traverse(row, column - 1);
            }

            if (done)
                grid[row][column] = PATH;
        }
        return done;
    }

    /**
     * Check if a given position is valid and can be traversed.
     * 
     * @param row The row index to check.
     * @param column The column index to check.
     * @return true if the position is within the maze boundaries and corresponds to an open path, false otherwise.
     */
    private boolean valid(int row, int column) {
        boolean result = false;

        if (row >= 0 && row < grid.length &&
            column >= 0 && column < grid[row].length) {
                if (grid[row][column] == 1) 
                    result = true;
            } 
        return result;
    }

    /**
     * Convert the maze grid to a string representation.
     * 
     * @return A string representing the maze grid.
     */
    @Override
    public String toString() {
        String result = "\n";
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                result += grid[row][column] + "";
            }
            result += "\n";
        }
        return result;
    }

    /**
     * Main method to test the maze traversal.
     * 
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Maze test = new Maze();

        System.out.println(test);

        if(test.traverse(0, 0))
            System.out.println("Successful.");
        else
            System.out.println("Didn't work.");

        System.out.println(test);
    }
}
