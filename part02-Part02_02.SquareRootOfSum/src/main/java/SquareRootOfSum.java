
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstValue = Integer.valueOf(scanner.nextLine());
        int secondValue = Integer.valueOf(scanner.nextLine());
        
        int sumOfBoth = firstValue + secondValue;
        System.out.println(Math.sqrt(sumOfBoth));
        

    }
}
