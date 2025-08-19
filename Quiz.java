import java.util.Scanner;

public class Quiz {

  public static void main(String[] args) {

    String[] questions = { "What is the capital of Australia?",
        "Which data structure uses FIFO (First In, First Out)?",
        "Who painted the Mona Lisa?",
        "Which is the largest planet in our solar system?",
        "In programming, what does HTML stand for?" };

    String[][] options = {
        { " 1) Sydney ", " 2) Melbourne ", " 3) Canberra ", " 4) Perth " },
        { " 1) Stack ", " 2) Queue ", " 3) Tree ", " 4) Graph " },
        { " 1) Vincent van Gogh ", " 2) Leonardo da Vinci ", " 3) Pablo Picasso ", " 4) Michelangelo " },
        { " 1) Earth ", " 2) Jupiter ", " 3) Saturn ", " 4) Neptune " },
        { " 1) Hyper Trainer Markup Language ", " 2) HyperText Markup Language ", " 3) Hyper Tool Multi Language ",
            " 4) Home Tool Markup Language " }

    };

    int[] answers = { 3, 2, 2, 2, 2 };

    int choice;
    int score = 0;

    Scanner input = new Scanner(System.in);

    System.out.println("---------Welcome to Quiz Banks---------");

    System.out.println("\n  Answer all 5 and win a Donut    \n");

    System.out.println();

    for (int i = 0; i < questions.length; i++) {
      System.out.println("Question " + (i + 1));
      System.out.println(questions[i]);
      for (String option : options[i]) {
        System.out.println(option);
      }
      System.out.printf("Enter choice: ");
      choice = input.nextInt();
      System.out.println();
      input.nextLine();

      if (choice > 4 || choice <= 0) {
        System.out.println("Invalid Input\n");
      } else {
        if (choice == answers[i]) {
          System.out.println("CORRECT\n");
          score++;
        } else {
          System.out.println("Incorrect\n");
        }
      }
    }

    System.out.println("Total: " + score);
    if (score == 5) {
      System.out.println("-------------Congrats You Won a ------------");
      System.out.println("                                            ");
      System.out.println("""
                            ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡄⠀⣿⢿⡆⢸⣿⣆⢸⡇⠲⢿⣿⠛⠃⠀⠀⢠⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
          ⠀⠀⠀⠀⠀⠀⠀⠀⣴⣄⠀⣶⣤⣸⣧⢠⡿⠾⣿⢸⡇⠻⣿⡇⠀⢸⡇⠀⠀⠀⢠⣿⠿⣿⠄⠀⠀⢻⡿⣦⡀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
          ⠀⠀⢰⣄⠀⠀⠀⠀⠀⠙⢷⣿⠙⠿⠿⠘⠃⠀⠻⠘⢁⣀⣀⣀⣀⣈⣁⣀⡀⠀⠿⠁⠀⠿⠀⠀⠀⣿⠁⣸⣷⢸⡇⢰⣦⢀⣴⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
          ⠀⠀⠀⠻⣷⡄⠀⠀⠀⠀⠀⣉⣠⣤⣴⣶⣾⣿⢿⡿⠿⠟⠛⣻⠟⠛⠛⠻⣿⡿⠿⢿⣷⣶⣦⣤⣄⣛⠛⠛⠁⠸⠃⠀⣿⣾⠇⣴⢦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
          ⠀⠀⠀⠀⠈⠛⢀⣠⣶⣾⡿⠟⠛⠉⢩⣅⠀⠀⠻⢀⡀⠀⠛⠉⢀⠀⠀⠘⠋⣀⠀⠀⣀⡈⠉⠙⡛⠻⠿⣷⣶⣤⣀⠀⠙⠃⠀⣿⣬⣿⢠⣶⢶⣄⠀⠀⠀⠀⠀⠀⠀
          ⠀⠀⠀⠀⣠⣾⠿⠛⠉⠀⠀⠀⢀⣶⠀⠙⠇⠀⠀⠘⠇⠀⢀⡄⠘⠻⠦⠀⠀⠹⠆⠀⠉⠛⠂⠀⣿⡀⢘⡳⠿⠙⠻⢿⣶⣤⣀⠈⠉⢱⡿⣷⣾⠟⡀⠀⠀⠀⠀⠀⠀
          ⠀⠀⣠⣾⠟⠁⢷⡄⠀⢴⣤⠀⠺⠇⠀⠀⠀⠀⣤⣀⠀⠾⠛⠀⢀⡀⠀⣤⡀⠀⢴⠾⠁⠀⣤⣰⠈⢠⡾⠁⠀⣤⠄⢀⡭⠛⠿⣷⣦⣈⠀⠸⢧⣾⠟⠻⣷⠀⠀⠀⠀
          ⠀⣰⡿⠁⠀⣠⣤⠶⠀⠀⠀⠀⣴⡧⠀⠐⢷⡄⠀⢠⡄⠀⠀⠀⣿⠅⠀⠈⠙⠁⠀⣤⠆⠀⠃⠈⠁⢰⡄⠀⠀⠋⠀⠘⠁⢠⣀⠈⠙⢿⣷⣄⠘⣿⣄⡀⣀⣴⣶⡄⠀
          ⢰⣿⢁⣀⠀⠁⠀⠀⠺⣆⠀⠸⠟⠀⠀⠀⡀⠀⠰⠏⠀⠀⢀⣤⣤⣄⠈⠛⢃⣀⣀⠀⠀⣤⠤⠀⠀⣶⡀⠀⡘⠛⠓⠀⢰⡎⢉⣃⡀⢀⡙⣿⣧⡀⠩⣿⡟⣷⠘⢿⠄
          ⣾⡇⠈⢛⣀⡀⠲⢦⣀⠉⠀⢀⣄⠀⠀⠾⠁⠀⠀⣠⣶⣤⣿⠏⠉⠻⠿⡿⠟⠛⣿⣧⣀⣀⠀⢠⣶⠉⠁⣾⠃⢠⡄⠀⠙⠁⠈⠉⠉⠈⠛⠈⢿⣷⠀⠹⣷⡈⠀⠀⠀
          ⣿⡇⠀⠈⠉⠁⠀⠀⠀⠀⣤⠀⠙⠓⠀⠀⢀⡀⠘⢋⣀⣉⣥⣶⠿⠿⠿⠿⢿⣶⣌⠛⠛⠿⠇⠀⠙⢁⣤⣀⠀⠈⠻⠀⢼⣇⢠⡾⠃⣼⠟⠀⠈⣿⣇⠀⠈⠀⠀⠀⠀
          ⣿⣿⡄⠀⣿⠀⢸⡇⠀⠀⠟⠀⣠⡀⢰⡗⠘⠛⠆⠈⠙⠿⣿⣦⣤⣄⣀⣀⣀⣉⣿⣷⣾⠟⢀⡶⠀⠀⢉⠙⠣⣦⠀⠀⠀⠁⠛⠁⠘⠋⠀⢻⠆⢹⣿⠀⠀⠀⠀⠀⠀
          ⢻⣟⢿⣆⠉⣤⣤⡅⠀⠀⠀⣼⠋⠀⠘⠁⠰⢦⡄⠀⢀⡀⣤⠍⠉⠛⠛⠛⠛⠛⠉⠉⣀⡀⠈⠀⠀⠀⠿⠀⠀⠈⠁⡾⠛⠀⠠⣦⠀⢠⣄⢀⣄⡘⣿⡇⠀⠀⠀⠀⠀
          ⠘⢿⣎⠻⣷⣬⡀⠀⠀⠺⢦⣄⠀⠀⠀⢰⣄⠀⠀⢀⡿⠃⠻⠀⠘⠋⠀⠈⢿⠀⠀⢀⠻⣧⠀⠺⠦⣀⣤⠀⢶⡄⠀⣠⡤⠀⠀⠀⠀⠀⠉⠀⣉⢸⣿⠇⠀⠀⠀⠀⠀
          ⠀⠈⢿⣧⡀⠙⠻⠿⠿⢿⣶⡄⠀⣿⠀⠀⠉⡁⠀⢊⠁⠀⣠⡶⠃⠀⢿⡆⠀⠀⠾⢋⣤⠎⢷⣄⠀⠘⠃⡀⠀⠀⡘⠋⣤⡀⠚⠓⠂⠘⠛⠀⢉⣾⡟⠀⠀⠀⠀⠀⠀
          ⠀⠀⠀⠙⢿⣦⣀⠀⠀⠀⠹⣿⣄⠘⠀⠘⠛⠁⠀⢻⡆⠀⣭⡄⢠⣤⠈⠛⠀⢠⣤⠄⢡⣤⠄⠉⠀⢰⣿⠁⠰⠟⢁⣀⠈⠉⠀⣾⠃⠀⢾⣄⣾⡿⠁⠀⠀⠀⠀⠀⠀
          ⠀⠀⠀⠀⠀⠙⠿⣷⣤⣀⠀⠈⠻⣷⣶⣶⡿⢿⣦⠀⠁⠀⠸⡧⠀⣀⣀⡀⢺⣄⠀⠀⠀⢠⡴⠿⠦⠀⠸⠦⣀⣀⣸⡇⠀⢀⣤⣭⣤⣴⣴⣿⠟⠀⠀⠀⠀⠀⠀⠀⠀
          ⠀⠀⠀⠀⠀⠀⠀⠈⠙⠻⣷⣦⣄⡀⠀⠀⠀⠀⢻⣷⣄⡛⢀⣴⡿⠟⠛⢿⣷⣀⣴⡿⢿⣾⣧⣤⣤⣤⣶⡿⠟⠛⠛⠿⠿⠿⠛⢉⣽⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀
          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠿⢷⣶⣤⣀⡀⠈⠛⠛⠛⠋⠀⠀⠀⠀⠙⠛⠋⠀⠀⠈⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⢀⣠⣶⡿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⣶⣶⣤⣄⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣤⣶⡿⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠙⠛⠛⠛⠻⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠿⠛⠛⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ """);
      System.out.println("--------------------------------------------");
    }

    input.close();
  }

}
