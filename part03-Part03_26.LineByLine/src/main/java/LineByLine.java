
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String sentence = scanner.nextLine();

            String[] splitArray = sentence.split(" ");

            for (String e : splitArray) {
                System.out.println(e);
            }
            if (sentence.equals("")) {
                break;
            }
        }

    }
}
