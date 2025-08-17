import java.util.Scanner;
import java.util.Random;

public class NumGuess {
  public static void main(String[] args) {

    Random random = new Random();
    Scanner input = new Scanner(System.in);

    int numGuess = random.nextInt(0, 100);
    int guess = 0;
    int count = 0;
    int min;
    int max;

    System.out.println("Number Guessing Game");
    System.out.println("Select a minimum range: ");
    min = input.nextInt();
    System.out.println("Select a maximum range: ");
    max = input.nextInt();
    while (guess != numGuess) {

      System.out.printf("Guess a num between %d - %d: \n", min, max);
      guess = input.nextInt();

      if (guess < numGuess) {
        System.out.println("Enter a HIGHER num");
        count++;
      } else if (guess > numGuess) {
        System.out.println("Enter a LOWER num");
        count++;
      } else {
        System.out.println("the number was: " + numGuess);
        System.out.println("Attempts: " + count);
      }
    }
    input.close();

  }
}
