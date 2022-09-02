
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

          JokeManager jManager = new JokeManager();
        Scanner scanner = new Scanner(System.in);
 
        UserInterface ui = new UserInterface(jManager, scanner);
        ui.start();
    }
}
 