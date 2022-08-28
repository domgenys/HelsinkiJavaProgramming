
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name:");
            String firstInput = scanner.nextLine();
            if (firstInput.isEmpty()) {
                break;
            }

            System.out.println("Duration:");

            int secondInput = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(firstInput, secondInput));

        }
        System.out.println("Program's maximum duration? ");
        int durationPrompt = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram shows : programs) {
            if (shows.getDuration() <= durationPrompt) {
                System.out.println(shows.getName() + " " + shows.getDuration() + " minutes");
            }
        }

    }

}
