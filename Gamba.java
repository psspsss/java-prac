import java.util.Scanner;
import java.util.Random;

public class Gamba {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double balance = 100;
    String spinAgain;
    double bet_amount;
    double payout;

    String[] row;

    System.out.println("Welcome to Gamba Slot Machine");

    while (balance > 0) {
      System.out.println("Ur Balance = $" + balance);
      System.out.println("Enter bet amount:  ");
      bet_amount = input.nextDouble();
      input.nextLine();

      if (bet_amount > balance) {

        System.out.println("Not enought Balance Brokie...");
        continue;

      } else if (bet_amount <= 0) {
        System.out.println("Invalid bet amount...");
        continue;
      } else {
        balance -= bet_amount;
      }

      System.out.println("Spinnin...");
      row = spinRow();
      printRow(row);
      payout = getPayout(row, bet_amount);

      if (payout > 0) {
        System.out.println("You WON $" + payout);
        balance += payout;
      }

      else {
        System.out.println("Better luck next time....");
      }

      System.out.println("Wanna try again? (Y/N)");
      spinAgain = input.nextLine().toUpperCase();

      if (!spinAgain.equals("Y")) {
        break;
      }

    }

    System.out.println("Thank You for Playing");
    System.out.println("Balance = " + balance);
    input.close();

  }

  static String[] spinRow() {
    Random rand = new Random();

    String[] symbols = { "🥶", "😈", "🍒", "💛", "🩷" };

    String[] row = new String[3];

    for (int i = 0; i < 3; i++) {
      row[i] = symbols[rand.nextInt(symbols.length)];
    }

    return row;

  }

  static void printRow(String[] row) {

    System.out.println("===========================");
    System.out.println(" " + String.join(" | ", row));
    System.out.println("===========================");

  }

  static double getPayout(String[] row, double bet_amount) {
    if (row[0].equals(row[1]) && row[1].equals(row[2])) {
      return switch (row[0]) {

        case "🥶" -> bet_amount * 3;
        case "😈" -> bet_amount * 5;
        case "🍒" -> bet_amount * 7;
        case "💛" -> bet_amount * 10;
        case "🩷" -> bet_amount * 100;
        default -> 0;
      };
    }

    else if (row[0].equals(row[1])) {
      return switch (row[1]) {

        case "🥶" -> bet_amount * 1;
        case "😈" -> bet_amount * 1.5;
        case "🍒" -> bet_amount * 3.5;
        case "💛" -> bet_amount * 5;
        case "🩷" -> bet_amount * 50;
        default -> 0;
      };
    }

    else if (row[1].equals(row[2])) {
      return switch (row[2]) {

        case "🥶" -> bet_amount * 1;
        case "😈" -> bet_amount * 1.5;
        case "🍒" -> bet_amount * 3.5;
        case "💛" -> bet_amount * 5;
        case "🩷" -> bet_amount * 50;
        default -> 0;
      };
    }
    return 0;
  }

}
