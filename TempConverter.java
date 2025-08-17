import java.util.Scanner;

public class TempConverter {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double temp;
    double outputTemp;
    String choice;

    System.out.println("Enter Temperature: ");

    temp = input.nextDouble();
    input.nextLine();
    System.out.println("Convert to Celsius or Fahrenheit? (C) or (F)");

    choice = input.next().toUpperCase();

    if (choice.equals("C")) {

      outputTemp = (temp - 32) * 5 / 9;
      System.out.printf("Temperature in C: %.2f C ", outputTemp);

    } else if (choice.equals("F")) {
      outputTemp = (5 * temp / 9) + 32;
      System.out.printf("Temperature in F: %.2f F ", outputTemp);
    }

    else {
      System.out.println("Invalid Input ⚠️");
    }

    input.close();
  }
}
