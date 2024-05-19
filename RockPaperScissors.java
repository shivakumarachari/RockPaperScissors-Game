import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        
        String[] choices = {"rock", "paper", "scissors"};

        Random random = new Random();
        String compChoice = choices[random.nextInt(choices.length)];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (rock, paper, scissors): ");
        String userChoice = scanner.nextLine().toLowerCase();

        if (userChoice.equals(compChoice)) {
            System.out.println("Your game is tied");
        } else if (userChoice.equals("rock") && compChoice.equals("scissors")) {
            System.out.println("You won the match");
        } else if (userChoice.equals("rock") && compChoice.equals("paper")) {
            System.out.println("Computer won the match");
        } else if (userChoice.equals("paper") && compChoice.equals("scissors")) {
            System.out.println("Computer won the match");
        } else if (userChoice.equals("paper") && compChoice.equals("rock")) {
            System.out.println("You won the match");
        } else if (userChoice.equals("scissors") && compChoice.equals("rock")) {
            System.out.println("Computer won the match");
        } else if (userChoice.equals("scissors") && compChoice.equals("paper")) {
            System.out.println("You won the match");
        } else {
            System.out.println("Enter valid input");
        }

        System.out.println("User choice is: " + userChoice);
        System.out.println("Computer choice is: " + compChoice);

        // Close the scanner
        scanner.close();
    }
}
