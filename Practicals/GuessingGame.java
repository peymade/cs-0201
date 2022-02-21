import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

  private static final int HIGH = 100;

  private static final int LOW = 0;

  // Set number of guesses to 0 to start the program
  int guesses = 0;

  public static void main(String[] args) {

    Random rand = new Random();

    final int secretNum = rand.nextInt(HIGH - LOW) + LOW;
    System.out.println("Welcome to the Guessing Game!");
    System.out.println("I have selected a number between " + LOW + " and " + HIGH + ".");

    int guess = LOW - 1;

    Scanner scanner = new Scanner(System.in);

    while (guess != secretNum) {
      System.out.println("What is your guess?");

      if (!scanner.hasNextInt()) {
        String whatYouSaid = scanner.nextLine().trim();
        System.out.println("Please enter a valid number. Not " + whatYouSaid);
        continue;
      }

      guess = scanner.nextInt();
      // if 10 below their guess is less than the number and their guess is higher
      // than the number OR if 10 above their guess is greater than the number and
      // their guess is lower
      if ((guess - 10 < secretNum && guess > secretNum) || (guess + 10 > secretNum && guess < secretNum)) {
        System.out.println("Super close. The correct number is within 10 numbers.");
      }
      if (guess > secretNum) {
        System.out.println("That guess is out of range.");
        System.out.println("Your guess of " + guess + "is too high.");
      } else if (guess < secretNum) {
        System.out.println("That guess is out of range.");
        System.out.println("Your guess of " + guess + " is too low.");
      }
    }

    System.out.println("Yay.");
    System.out.println("Thanks.");

    scanner.close();
  }

}
