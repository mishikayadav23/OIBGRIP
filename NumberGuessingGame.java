import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        System.out.println("Let's play a game. ");
        System.out.println("I'll pick a number between 1 and 100 and you try to guess it.");
        System.out.println("You have 7 guesses.");
        Scanner input = new Scanner(System.in);

        boolean playAgain;
        do {
            playGame();
            System.out.println("Would you like to play again? true/false");
            playAgain = input.nextBoolean();
        } while (playAgain);
        System.out.println("Thanks for playing.");

    }

    static void playGame() {
        int computersNumber;
        int usersGuess;
        int guessCount;
        computersNumber = (int) (100 * Math.random()) + 1;
        guessCount = 0;
        System.out.println();
        System.out.println("What is your first guess?");
        Scanner input1 = new Scanner(System.in);
        while (true) {
            usersGuess = input1.nextInt();
            guessCount++;
            if (usersGuess == computersNumber) {
                System.out.println("Yay! you got it in " + guessCount
                        + " guesses. The number was " + computersNumber);
                break;
            }
            if (guessCount == 7) {
                System.out.println("Oops! you didn't get the number in 7 guesses.");
                System.out.println("Better luck next time!");
                System.out.println("My number was " + computersNumber);
                break;
            }
            if (usersGuess < computersNumber)
                System.out.println("That's too low.  Try again:");

            else if (usersGuess > computersNumber)
                System.out.println("That's too high.  Try again:");

            System.out.println();

        }

    }
}
