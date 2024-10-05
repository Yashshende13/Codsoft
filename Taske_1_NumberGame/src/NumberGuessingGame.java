import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int score = 0; // Track user score
        int roundsWon = 0;

        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            int attempts = 0;
            int maxAttempts = 10; // Set maximum number of attempts
            boolean guessedCorrectly = false;
            
            System.out.println("\nGuess the number between 1 and 100! You have " + maxAttempts + " attempts.");
            
            // Repeat until the user guesses correctly or runs out of attempts
            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    roundsWon++;
                    score += (maxAttempts - attempts + 1); // Higher score for fewer attempts
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you're out of attempts. The correct number was " + randomNumber + ".");
            }

            // Ask if the user wants to play another round
            System.out.print("\nDo you want to play another round? (yes/no): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        // Game over, display final score
        System.out.println("\nGame over! Your final score is " + score + " with " + roundsWon + " round(s) won.");
        scanner.close();
    }
}
