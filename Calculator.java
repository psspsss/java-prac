import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double firstNum;
    double secondNum;
    double output = 0;

    char operation;
    boolean validOperation = true;

    System.out.println("Calculator");
    System.out.println("Enter a 1st Num: ");
    firstNum = input.nextDouble();

    System.out.println("Enter 2nd Num: ");
    secondNum = input.nextDouble();
    input.nextLine();

    System.out.println("Enter Operation: (+,-,*,/,^) :");
    operation = input.next().charAt(0);

    switch (operation) {

      case '+' -> output = firstNum + secondNum;
      case '-' -> output = firstNum - secondNum;
      case '*' -> output = firstNum * secondNum;
      case '/' -> {
        if (secondNum == 0) {
          System.out.println("Can't divide by 0 fool");
          validOperation = false;
        }

        else {
          output = firstNum / secondNum;
        }

      }
      case '^' -> output = Math.pow(firstNum, secondNum);
      default -> {
        System.out.println("Invalid Operation");
        validOperation = false;
      }

    }

    ;

    if (validOperation) {
      System.out.println(output);
    }

    input.close();
  }

}
