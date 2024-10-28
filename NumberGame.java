import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain;

        do {
            int generatedNumber = rand.nextInt(101) ;  // Generate a number between 1 and 100
            int maxAttempts = 5;  // Limit the number of attempts
            boolean guessedCorrectly = false;

            System.out.println("Guess any random number between 1 and 100!");

            for (int numOfattempts = 1; numOfattempts < maxAttempts+1 ; numOfattempts++) {
                System.out.print( numOfattempts + " attempt " + " - Enter your guessed number: ");
                int userGuessedNum = sc.nextInt();

                if (userGuessedNum == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    break;  // Exit the loop if guessed correctly
                } else if (userGuessedNum > generatedNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry!You are unable to guess the correct number. The correct number was: " + generatedNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");

        } while (playAgain);

        sc.close();
        System.out.println("Thanks for playing...Hope you liked it!");
    }
}
