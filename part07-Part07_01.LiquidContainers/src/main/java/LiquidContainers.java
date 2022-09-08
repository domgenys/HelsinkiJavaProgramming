
import java.util.Scanner;
//All the functionality must be added to the method main in the class 
//        LiquidContainers (do not create new methods). 
//        The template already contains a loop which exits the program with the command "quit".

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + firstContainer + "/100");

            System.out.println("Second: " + secondContainer + "/100");
       //     System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            // asuming user uses command add 5, splitting String from intinto seperate parts
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount > 0) {
                firstContainer += amount;
                if (firstContainer > 100) {
                    firstContainer = 100;
                }
            }
            if (command.equals("move") && amount > 0) {
                if (amount > firstContainer) {
                    amount = firstContainer;
                }
                firstContainer -= amount;
                secondContainer += amount;
                if (secondContainer > 100) {
                    secondContainer = 100;
                }
            }

            if (command.equals("remove") && amount > 0) {
                secondContainer -= amount;
                if (secondContainer < 0) {
                    secondContainer = 0;
                }
            }

        }

    }
}
