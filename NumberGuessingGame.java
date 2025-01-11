import java.util.Scanner;
import java.util.Random;

 class NumberGuessingGame  {

    public static void main(String[] args) {
        Scanner shub = new Scanner(System.in);
        Random random = new Random();

        int roundsPlayed = 0;
        int roundsWon = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            roundsPlayed++;
            int numberToGuess = random.nextInt(100) + 1;
            int maxAttempts = 5;
            boolean isGuessedCorrectly = false;

            System.out.println("\nRound " + roundsPlayed + ":");
            System.out.println("I have generated a number between 1 to 100. Can you guess it?");
            System.out.println("You have " + maxAttempts + " attempts.");

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.print("Attempt " + attempt + ": Enter your guess: ");
                int userGuess = shub.nextInt();

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    isGuessedCorrectly = true;
                    roundsWon++;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!isGuessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + numberToGuess + ".");
            }

            System.out.print("\nDo you want to play another round? (yes/no): ");
        } while (shub.next().equalsIgnoreCase("yes"));

       
        System.out.println("\nGame Over!");
        System.out.println("Rounds Played: " + roundsPlayed);
        System.out.println("Rounds Won: " + roundsWon);
        
    }
}
