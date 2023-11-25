
import java.util.Scanner;

public class Randomgame {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Welcome to the Random Number Guessing Game!");
            int randomNumber = (int) (Math.random() * 100) + 1;
            int userGuess;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;
            while (!hasGuessedCorrectly) {
                System.out.print("Enter your guess (between 1 and 100): ");

                while (!s.hasNextInt()) {
                    System.out.println("Please enter a valid integer.");
                    s.next();
                }

                userGuess = s.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    hasGuessedCorrectly = true;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again. The number is between " + (userGuess + 1) + " and 100.");
                } else {
                    System.out.println("Too high! Try again. The number is between 1 and " + (userGuess - 1) + ".");
                }
            }
            System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");

        }
    }
}
