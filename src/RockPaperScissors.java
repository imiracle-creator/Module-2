// Isaiah Miracle 3/23/2025 Module 2 RockPaperScissors
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate computer's choice (1 - Rock, 2 - Paper, 3 - Scissors)
        int computerChoice = random.nextInt(3) + 1;

        // Prompt user for input
        System.out.println("Enter your choice: (1) Rock, (2) Paper, (3) Scissors");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number between 1 and 3.");
        } else {
            int userChoice = scanner.nextInt();

            // Validate user input
            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            } else {
                // Display choices
                System.out.println("Computer chose: " + choiceToString(computerChoice));
                System.out.println("You chose: " + choiceToString(userChoice));

                // Determine winner
                if (userChoice == computerChoice) {
                    System.out.println("It's a tie!");
                } else if ((userChoice == 1 && computerChoice == 3) ||
                        (userChoice == 2 && computerChoice == 1) ||
                        (userChoice == 3 && computerChoice == 2)) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer wins!");
                }
            }
        }

        scanner.close();
    }

    // Method to convert choice number to string representation
    public static String choiceToString(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Unknown";
        }
    }
}

