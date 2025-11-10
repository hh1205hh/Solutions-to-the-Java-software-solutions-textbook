public class SolveTowers {
    private int totalDisks;
    private int count = 1;

    public SolveTowers(int disks) {
        totalDisks = disks;
    }

    public void solve() {
        moveTower(totalDisks, 1 ,3 ,2);
    }

    public void moveTower(int numDisks, int start, int end, int temp) {
        if (numDisks == 1) 
            moveOneDisk(start, end);
        else {
            moveTower(numDisks - 1, start, temp, end);
            moveOneDisk(start, end);
            moveTower(numDisks - 1, temp, end, start); 
        }
    }

    private void moveOneDisk(int start, int end) {
        System.out.println("Move one disk from " + start + " to " + end + "\n" + count);
        count++;
    }

    /* 
     * Create a chart showing the number of moves required to solve the towers of Hanoi puzzle 
     * using the following number of disks:
     * 2, 3, 4, 5, 6 , 7, 8, 9, 10, 15, 20 and 25
     */
    public static void main(String[] args) {
        int[] disks = {2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20, 25};

        System.out.println("Number of disks | Number of moves");
        System.out.println("--------------- | ---------------");

        for (int disksNum : disks) {
            double numSteps = Math.pow(2, disksNum) - 1;
            System.out.printf("%15d | %15.0f\n", disksNum, numSteps);
        }
    }
}



