package SportsStatistics;

import java.util.Date;

/**
 * The IceHockey class represents statistics for an ice hockey game.
 */
public class IceHockey extends SportStatistics {
    private int group1Goals;
    private int group2Goals;

    /**
     * Constructs an IceHockey object with the given group players, coach name, and game date.
     *
     * @param group1Players an array of player names in group 1
     * @param group2Players an array of player names in group 2
     * @param coachName     the name of the coach
     * @param gameDate      the date of the game
     */
    public IceHockey(String[] group1Players, String[] group2Players, String coachName, Date gameDate) {
        super(group1Players, group2Players, coachName, gameDate);
        this.group1Goals = 0;
        this.group2Goals = 0;
    }

    /**
     * Records the goals scored by a group in the game.
     *
     * @param group the group number (1 or 2)
     * @param goals the goals scored by the group
     * @throws IllegalArgumentException if the group number is not 1 or 2
     */
    public void recordGoals(int group, int goals) {
        if (group == 1) {
            group1Goals += goals;
        } else if (group == 2) {
            group2Goals += goals;
        } else {
            throw new IllegalArgumentException("Invalid value. Please enter '1' for group 1 or '2' for group 2.");
        }
    }

    /**
     * Gets the winner group based on total goals scored.
     *
     * @return the winner group ("Group 1" or "Group 2")
     */
    public String getWinnerGroup() {
        return group1Goals > group2Goals ? "Group 1" : "Group 2";
    }

    /**
     * Returns a string representation of the ice hockey game statistics.
     *
     * @return a string containing the game statistics
     */
    @Override
    public String toString() {
        return super.toString() +
               "\nTotal goals for Group 1: " + this.group1Goals +
               "\nTotal goals for Group 2: " + this.group2Goals;
    }
}
