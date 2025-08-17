import java.util.Scanner;

public class BankingProgram {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double balance = 0;
    int choice;
    double deposit;
    double withdraw;
    boolean isRunning = true;

    while (isRunning) {
      System.out.println("==========Welcome to Bank Central===========");

      System.out.println("Enter number of ur choice:");
      System.out.println();
      System.out.println("(1) Check Balance");
      System.out.println("(2) Deposit");
      System.out.println("(3) Withdraw");
      System.out.println("(4) Exit");

      choice = input.nextInt();

      switch (choice) {

        case 1 -> showBalance(balance);

        case 2 -> {
          System.out.println("(DEPOSIT) Enter Amount: ");
          deposit = input.nextDouble();
          if (deposit <= 0) {
            System.out.println("Invalid Amount");
          } else {
            deposit(balance, deposit);
          }
        }

        case 3 -> {
          System.out.println("(WITHDRAW) Enter Amount: ");
          withdraw = input.nextDouble();

          if (withdraw > balance) {
            System.out.println("Insufficient Funds you brokeass..,");
          } else if (withdraw <= 0) {
            System.out.println("Invalid Amount");
          } else {
            withdraw(balance, withdraw);
          }
        }

        case 4 -> isRunning = false;

        default -> System.out.println("Invalid Choice");
      }
      ;
      System.out.println("======Thank you for banking with us=======");
    }
    input.close();

  }

  static void showBalance(double balance) {
    System.out.printf("Your Balance is $ %f \n", balance);
  }

  static void deposit(double balance, double deposit) {

    balance += deposit;

    System.out.printf("Deposit of $ %f complete. ", deposit);
    System.out.printf("New Balance = $ %f \n", balance);
  }

  static void withdraw(double balance, double withdraw) {

    balance -= withdraw;
    System.out.printf("Withdrawl of $ %f complete. ", withdraw);
    System.out.printf("New Balance = $ %f \n", balance);
  }
}
