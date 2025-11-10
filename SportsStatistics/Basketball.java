package SportsStatistics;

import java.util.Date;

/**
 * The Basketball class represents basketball game statistics.
 */
public class Basketball extends SportStatistics {
    private int totalPointsGroup1;
    private int totalPointsGroup2;

    /**
     * Constructs a Basketball object with the given group players, coach name, and game date.
     *
     * @param group1Players an array of player names in group 1
     * @param group2Players an array of player names in group 2
     * @param coachName     the name of the coach
     * @param gameDate      the date of the game
     */
    public Basketball(String[] group1Players, String[] group2Players, String coachName, Date gameDate) {
        super(group1Players, group2Players, coachName, gameDate);
        this.totalPointsGroup1 = 0;
        this.totalPointsGroup2 = 0;
    }

    /**
     * Records the points scored by a group in the game.
     *
     * @param group  the group number (1 or 2)
     * @param points the points scored by the group
     * @throws IllegalArgumentException if the group number is not 1 or 2
     */
    public void recordThrows(int group, int points) {
        if (group == 1) {
            totalPointsGroup1 += points;
        } else if (group == 2) {
            totalPointsGroup2 += points;
        } else {
            throw new IllegalArgumentException("Invalid value. Please enter '1' for group 1 or '2' for group 2.");
        }
    }

    /**
     * Gets the winner group based on total points scored.
     *
     * @return the winner group ("Group 1" or "Group 2")
     */
    public String getWinnerGroup() {
        return totalPointsGroup1 > totalPointsGroup2 ? "Group 1" : "Group 2";
    }

    /**
     * Returns a string representation of the basketball game statistics.
     *
     * @return a string containing the game statistics
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nTotal Points for Group 1: " + this.totalPointsGroup1 +
                "\nTotal Points for Group 2: " + this.totalPointsGroup2;
    }
}
