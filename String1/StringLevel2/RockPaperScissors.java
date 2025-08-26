package StringLevel2;

import java.util.*;

public class RockPaperScissors {

    // Method to get computer choice
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[(int) (Math.random() * 3)];
    }

    // Method to determine winner
    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }
        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate statistics
    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (userWins * 100.0 / totalGames)) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", (compWins * 100.0 / totalGames)) + "%";
        return stats;
    }

    // Method to display stats
    public static void displayStats(String[][] stats) {
        System.out.println("\nPlayer\tWins\tWin %");
        System.out.println("--------------------------");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, compWins = 0, draws = 0;

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= games; i++) {
            System.out.print("Game " + i + " - Enter Rock, Paper, or Scissors: ");
            String userChoice = sc.nextLine();
            String compChoice = getComputerChoice();

            String winner = getWinner(userChoice, compChoice);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;

            System.out.println("User: " + userChoice + " | Computer: " + compChoice + " → Winner: " + winner);
        }

        String[][] stats = calculateStats(userWins, compWins, games);
        displayStats(stats);
        System.out.println("Draws: " + draws);
    }
}
