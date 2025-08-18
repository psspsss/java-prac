import java.util.Scanner;
import java.util.Random;

public class VinnieBanks {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    double balance = rand.nextDouble(0, 100000);
    double deposit;
    double withdraw;
    int choice;
    boolean isRunning = true;

    System.out.println("-------------VinnieBanks-------------");
    System.out.println("|                                   |");

    while (isRunning) {
      System.out.println("Enter your choice: ");
      System.out.println("1) Check balance");
      System.out.println("2) Withdraw");
      System.out.println("3) Deposit");
      System.out.println("4) Exit");

      System.out.printf("\n Choice: ");
      choice = scanner.nextInt();

      switch (choice) {

        case 1 -> {
          System.out.println("Checking Balance...");
          showbalance(balance);
        }
        case 2 -> {
          System.out.println("----Withdraw----");
          System.out.println("Enter withdraw amount: ");
          withdraw = scanner.nextDouble();

          if (withdraw > balance) {
            System.out.println("Insufficient funds brokie...");
          } else if (withdraw <= 0) {
            System.out.println("Invalid amount");
          } else {
            withdraw(withdraw, balance);
          }
        }

        case 3 -> {
          System.out.println("-----Deposit----");
          System.out.println("Enter Deposit amount: ");
          deposit = scanner.nextDouble();

          if (deposit <= 0) {
            System.out.println("Invalid amount");
          } else {
            deposit(deposit, balance);
          }
        }
        case 4 -> {
          System.out.println("-----------Thank You for banking with us -----------");
          System.out.println("                  Visit again");
          isRunning = false;

        }
        default -> System.out.println("Invalid Choice");
      }
      ;

    }
    scanner.close();
  }

  static void showbalance(double balance) {
    System.out.println("----Balance----");
    System.out.printf("\nYour Balance is : $%.3f\n", balance);
    System.out.println();

  }

  static void deposit(double deposit, double balance) {
    balance += deposit;
    System.out.printf("Deposit of $%f complete", deposit);
    System.out.println();
    System.out.println("New Balance: " + balance);
    System.out.println();
  }

  static void withdraw(double withdraw, double balance) {
    balance -= withdraw;
    System.out.printf("\nWithdrawl of $%f complete\n", withdraw);
    System.out.println();
    System.out.println("New Balance: " + balance);
    System.out.println();
  }
}
