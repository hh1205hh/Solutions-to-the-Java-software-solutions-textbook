package SportsStatistics;
import java.util.Date;

/**
 * The SportStatsApp class demonstrates the functionality of different sports games.
 * It creates instances of basketball, football, handball, and ice hockey games,
 * records scores, and displays game statistics.
 */
public class SportStatsApp {
    public static void main(String[] args) {
        // Basketball game
        String[] basketballGroup1Players = {"Lebrun James", "Anthony Davis", "Russell Westrock"};
        String[] basketballGroup2Players = {"Kevin Durant", "James Harden", "Kyrie Irving"};
        Basketball basketballGame = new Basketball(basketballGroup1Players, basketballGroup2Players, "Frank Vogel", new Date());
        basketballGame.recordThrows(1, 10);
        basketballGame.recordThrows(2, 27);
        System.out.println("\nBasketball game: ");
        System.out.println(basketballGame);
        System.out.println("The group won at the game: " + basketballGame.getWinnerGroup());

        // Football game
        String[] footballGroup1Players = {"Lionel Messi", "Neymar Jr.", "Kylian Mbappe"};
        String[] footballGroup2Players = {"Cristiano Ronaldo", "Robert Lewandowski", "Mohamed Salah"};
        Football footballGame = new Football(footballGroup1Players, footballGroup2Players, "Thomas Tuchel", new Date());
        footballGame.recordGoals(1, 3); 
        footballGame.recordGoals(2, 2);
        System.out.println("\nFootball Game:");
        System.out.println(footballGame);
        System.out.println("The group won at the game: " + footballGame.getWinnerGroup());


        // Handball game
        String[] handballGroup1Players = {"Mikkel Hansen", "Sander Sagosen", "Nikola Karabatic"};
        String[] handballGroup2Players = {"Domagoj Duvnjak", "Luka Cindric", "Andreas Wolff"};
        Handball handballGame = new Handball(handballGroup1Players, handballGroup2Players, "Filip Jicha", new Date());
        handballGame.recordGoals(1, 25); 
        handballGame.recordGoals(2, 22); 
        System.out.println("\nHandball Game:");
        System.out.println(handballGame);
        System.out.println("The group won at the game: " + handballGame.getWinnerGroup());

        // Ice Hockey game
        String[] iceHockeyGroup1Players = {"Connor McDavid", "Leon Draisaitl", "Nathan MacKinnon"};
        String[] iceHockeyGroup2Players = {"Alex Ovechkin", "Patrick Kane", "Nikita Kucherov"};
        IceHockey iceHockeyGame = new IceHockey(iceHockeyGroup1Players, iceHockeyGroup2Players, "Barry Trotz", new Date());
        iceHockeyGame.recordGoals(1, 4); 
        iceHockeyGame.recordGoals(2, 3); 
        System.out.println("\nIce Hockey Game:");
        System.out.println(iceHockeyGame);
        System.out.println("The group won at the game: " + iceHockeyGame.getWinnerGroup());

    }
}
