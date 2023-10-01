import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // Create a Scanner object for user input and a Random object for generating
        // random numbers
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Define the range for the random number
        int minRange = 1;
        int maxRange = 100;

        // Generate a random number within the specified range
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;

        // Initialize variables to keep track of game progress
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        // Welcome message and instructions
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a number between " + minRange + " and " + maxRange + ". Try to guess it!");

        // Main game loop
        while (!hasGuessedCorrectly) {
            // Prompt the player to enter their guess
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++; // Increment the attempts count

            // Check if the guess is outside the valid range
            if (guess < minRange || guess > maxRange) {
                System.out.println("Please enter a number between " + minRange + " and " + maxRange + ".");
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                // The player guessed the correct number
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly in "
                        + attempts + " attempts.");
                hasGuessedCorrectly = true; // Set the flag to exit the loop
            }
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}
