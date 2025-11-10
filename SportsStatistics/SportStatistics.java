/*
Design and implement a set of classes that keep s track of various sport statistics.
Have each low-level class represent a specific sport. Tailor the services of the classes to the
sport in question, and move common attributes to the higher-level classes as appropriate.
Create a main deriver class to instantiate and exercise several of the classes.
 */

package SportsStatistics;

import java.util.Date;

/**
 * The SportStatistics class represents statistics for a sports game.
 * This is an abstract class that provides common functionality for specific sports.
 */
public abstract class SportStatistics {
    protected String[] group1Players;
    protected String[] group2Players;
    protected String coachName;
    protected Date gameDate;
    private int totalPointsGroup1;
    private int totalPointsGroup2;

    /**
     * Constructs a SportStatistics object with the given group players, coach name, and game date.
     *
     * @param group1Players an array of player names in group 1
     * @param group2Players an array of player names in group 2
     * @param coachName     the name of the coach
     * @param gameDate      the date of the game
     */
    public SportStatistics(String[] group1Players, String[] group2Players, String coachName, Date gameDate) {
        this.group1Players = group1Players;
        this.group2Players = group2Players;
        this.coachName = coachName;
        this.gameDate = gameDate;
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
    public void recordPoints(int group, int points) {
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
     * Gets the total points scored by group 1.
     *
     * @return the total points scored by group 1
     */
    public int getTotalPointsGroup1() {
        return this.totalPointsGroup1;
    }

    /**
     * Gets the total points scored by group 2.
     *
     * @return the total points scored by group 2
     */
    public int getTotalPointsGroup2() {
        return this.totalPointsGroup2;
    }

    /**
     * Gets the player names in group 1.
     *
     * @return an array of player names in group 1
     */
    public String[] getGroup1Players() {
        return group1Players;
    }

    /**
     * Sets the player names in group 1.
     *
     * @param newGroup1Players the new array of player names in group 1
     */
    public void setGroup1Players(String[] newGroup1Players) {
        if (newGroup1Players != null) {
            this.group1Players = newGroup1Players;
        }
    }

    /**
     * Gets the player names in group 2.
     *
     * @return an array of player names in group 2
     */
    public String[] getGroup2Players() {
        return group2Players;
    }

    /**
     * Sets the player names in group 2.
     *
     * @param newGroup2Players the new array of player names in group 2
     */
    public void setGroup2Players(String[] newGroup2Players) {
        if (newGroup2Players != null) {
            this.group2Players = newGroup2Players;
        }
    }

    /**
     * Gets the coach's name.
     *
     * @return the coach's name
     */
    public String getCoachName() {
        return coachName;
    }

    /**
     * Sets the coach's name.
     *
     * @param newCoachName the new coach's name
     */
    public void setCoachName(String newCoachName) {
        if (newCoachName != null) {
            this.coachName = newCoachName;
        }
    }

    /**
     * Gets the game date.
     *
     * @return the game date
     */
    public Long getGameDate() {
        return gameDate.getTime();
    }

    /**
     * Sets the game date.
     *
     * @param newGameDate the new game date
     */
    public void setGameDate(Date newGameDate) {
        if (newGameDate != null) {
            this.gameDate = newGameDate;
        }
    }

    /**
     * Returns a string representation of the sports statistics.
     *
     * @return a string containing the game statistics
     */
    @Override
    public String toString() {
        return "Group 1 players: " + String.join(", ", group1Players) +
                "\nGroup 2 players: " + String.join(", ", group2Players) +
                "\nCoach name: " + coachName +
                "\nDate of the game: " + gameDate;
    }
}
