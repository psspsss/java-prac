import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

  public static void main(String[] args) {

    int times;
    int total = 0;
    int dieNum = 0;
    int target;

    Scanner input = new Scanner(System.in);
    Random random = new Random();

    System.out.println("Welcome to Dice Roller 🎲");

    System.out.println("Enter TARGET dice number: ");
    target = input.nextInt();
    System.out.println("Enter num of times you would like to roll: ");
    times = input.nextInt();

    if (times <= 0) {
      System.out.println("Invalid input");

    } else {
      for (int i = 1; i <= times; i++) {

        System.out.println("Rollin...");
        dieNum = random.nextInt(1, 7);
        System.out.println("You Rolled: " + dieNum);
        printAscii(dieNum);
        total += dieNum;
      }
    }
    System.out.println("Your total comes out to be: ");
    System.out.println(total);

    if (target == total) {
      System.out.println("---------CONGRATULATIONS---------");
      System.out.println();
      System.out.println("             You Won             ");
      System.out.println("            $1 Million           ");
      System.out.println();
      System.out.println("---------------------------------");
    } else {
      System.out.println("Sorry You Lost, Better luck next time...");
      System.out.println();
    }

    System.out.println("-------Thank You for Playing--------");

    input.close();
  }

  static void printAscii(int dieNum) {

    String dice1 = """

          --------------
         |              |
         |              |
         |              |
         |             |
         |              |
         |              |
         |              |
          --------------
        """;

    String dice2 = """

          --------------
         |              |
         |              |
         |              |
         |            |
         |              |
         |              |
         |              |
          --------------
        """;
    String dice3 = """

          --------------
         |              |
         |             |
         |              |
         |             |
         |              |
         |             |
         |              |
          --------------
        """;
    String dice4 = """

          --------------
         |              |
         |            |
         |              |
         |              |
         |              |
         |            |
         |              |
          --------------
        """;
    String dice5 = """

          --------------
         |              |
         |            |
         |              |
         |             |
         |              |
         |            |
         |              |
          --------------
        """;
    String dice6 = """

          --------------
         |              |
         |            |
         |              |
         |            |
         |              |
         |            |
         |              |
          --------------
        """;

    switch (dieNum) {

      case 1 -> System.out.println(dice1);
      case 2 -> System.out.println(dice2);
      case 3 -> System.out.println(dice3);
      case 4 -> System.out.println(dice4);
      case 5 -> System.out.println(dice5);
      case 6 -> System.out.println(dice6);
      default -> System.out.println("Invalid Roll");
    }

  }

}
