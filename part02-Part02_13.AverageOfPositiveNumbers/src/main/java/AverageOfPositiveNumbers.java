
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Task is to keep count of positive integers, sum and calculate average
        int positiveCount = 0;
        int sum = 0;
        double average = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input > 0) {
                positiveCount++;
                sum += input;
            } else if (input == 0) {
                break;
            }
        }
        //The task is to calculate the average 
        //print only if user has given numbers and avoid dividing by zero 
        if (sum + positiveCount > 0) {
            average = 1.0 * sum / positiveCount;
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
