import java.util.Scanner;

public class WeightConverter {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Weight Conversion");

    int choice;
    double weightInput;
    double Outputweight;

    // Enter choice

    System.out.println("Enter conversion format: ");
    System.out.println("1: from kgs to lbs \n2: from lbs to kgs");
    choice = input.nextInt();
    input.nextLine();

    if (choice == 1) {

      System.out.println("Enter weight in kgs: ");
      weightInput = input.nextDouble();
      Outputweight = weightInput * 2.20462;
      System.out.println("Weight in lbs = " + Outputweight + "lbs");
    }

    else if (choice == 2) {

      System.out.println("Enter weight in lbs: ");
      weightInput = input.nextDouble();
      Outputweight = weightInput * 0.453592;
      System.out.println("Weight in kgs= " + Outputweight + "kgs");
    }

    else {
      System.out.println("Invalid Input");
    }
    // WeightConverter
    //
    input.close();
  }
  // output
}
