import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int randomNumber = random.nextInt(100) + 1;  // Random number between 1 and 100
        int attempts = 0;
        int guess = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have generated a number between 1 and 100.");
        System.out.println("Can you guess what it is?");

        // Loop until the user guesses the correct number
        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number.");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
