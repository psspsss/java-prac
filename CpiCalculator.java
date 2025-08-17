import java.util.Scanner;

public class CpiCalculator {

  public static void main(String[] args) {

    double principal;
    double amount;
    double interest;
    double year;
    int num;

    Scanner input = new Scanner(System.in);

    System.out.println("------------------");
    System.out.println(" CPI Calculator");
    System.out.println("------------------");

    System.out.println("Enter initial Principal Amount(P): ");

    principal = input.nextDouble();

    System.out.println("Enter Interest Rate(r): ");
    interest = input.nextDouble() / 100;

    System.out.println("Enter Years(t): ");
    year = input.nextDouble();

    System.out.println("Enter frequency in a year(n): ");
    num = input.nextInt();

    amount = principal * Math.pow(1 + interest / num, num * year);

    System.out.printf("CPI Amount: Rs. %.3f", amount);
    input.close();

  }
}
