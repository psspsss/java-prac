import java.util.Scanner;

public class ShoppingCart {
  public static void main(String[] args) {

    String item;
    int quantity;
    double price;
    double total;

    Scanner input = new Scanner(System.in);

    System.out.println("===Shoppin Cart===");

    System.out.println("What are you buying?? ");
    item = input.nextLine();
    System.out.println("What is the price of single item? ");
    price = input.nextDouble();
    System.out.println("What is the total quantity of item? ");
    quantity = input.nextInt();

    total = price * quantity;
    System.out.printf("You bought %d item/s of %s\n", quantity, item);
    System.out.printf("The Total is: $%.2f", total);
    input.close();
  }

}
