import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Random random = new Random();

    String userChoice;
    int score = 3;

    String[] options = { "rock", "paper", "scissors" };

    String computerChoice;

    String playAgain = "yes";

    System.out.println("----------Rock Paper Scissors--------------");
    do {

      System.out.printf("\nEnter your choice (rock , paper ,scissors): ");
      userChoice = input.nextLine().toLowerCase();
      if (!userChoice.equals("rock") && !userChoice.equals("scissors") && !userChoice.equals("paper")) {
        System.out.println("Invalid Input");
        continue;
      }

      computerChoice = options[random.nextInt(options.length)];

      System.out.println("User Choice: " + userChoice);
      System.out.println("Computer Choice: " + computerChoice);

      if (computerChoice.equals(userChoice)) {
        System.out.println("Tie");

      } else if (computerChoice.equals("rock") && userChoice.equals("scissors") ||
          computerChoice.equals("paper") && userChoice.equals("rock") ||
          computerChoice.equals("scissors") && userChoice.equals("paper")) {
        System.out.println("You Lose Bozo");
        score--;
        System.out.println("-1");
        System.out.println("LifeLines remaining: " + score);
      } else {
        System.out.println("You Won...");
        score++;
        System.out.println("LifeLine Added +1");
        System.out.println("Lifelines remaining: " + score);
      }

      if (score <= 0) {
        System.out.println("🚫 GAME OVER 🚫");
        break;
      } else {
        System.out.println("Would you like to Play again???");
        System.out.printf("\nYes/No: ");
        playAgain = input.nextLine();
      }

    } while (playAgain.equals("yes"));

    System.out.println("-------------Thanks For PLaying -------------");
    System.out.println("End Score: " + score);
    input.close();
  }
}
