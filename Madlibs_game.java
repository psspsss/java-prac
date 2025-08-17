import java.util.Scanner;

public class Madlibs_game {

  public static void main(String[] args) {

    String adjective1;
    String adjective2;
    String adjective3;

    String verb1;
    String verb2;
    String verb3;

    String noun1;
    String noun2;
    String noun3;

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Madlibs: ");

    System.out.println("Enter the Following: ");

    System.out.println("Adjective 1(Description): ");
    adjective1 = input.nextLine();
    System.out.println("Adjective 2(Description): ");
    adjective2 = input.nextLine();
    System.out.println("Adjective 3(Description): ");
    adjective3 = input.nextLine();
    System.out.println("Verb 1(Act): ");
    verb1 = input.nextLine();
    System.out.println("Verb 2(Act): ");
    verb2 = input.nextLine();
    System.out.println("Verb 3(Act): ");
    verb3 = input.nextLine();
    System.out.println("Noun 1(Name/Place/Thing): ");
    noun1 = input.nextLine();
    System.out.println("Noun 2(Name/Place/Thing): ");
    noun2 = input.nextLine();
    System.out.println("Noun 3(Name/Place/Thing): ");
    noun3 = input.nextLine();
    input.close();

    System.out.println("The Final Story: ");

    System.out.printf("One day, a %s %s decided to %s down the street.", adjective1, noun1, verb1);

    System.out.printf("Suddenly, a %s %s appeared and tried to %s it.", adjective2, noun2, verb2);

    System.out.printf("Things got even weirder when a %s %s showed up and began to %s with them.", adjective3, noun3,
        verb3);

    System.out.println("In the end, everyone was confused but also slightly impressed.");

  }

}
