
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double value = Double.valueOf(scan.nextLine());

        double taxFee = 0;

        if (value >= 5000 && value < 25000) {
            taxFee = 100 + ((value - 5000) * 0.08);
        } else if (value >= 25000 && value < 55000) {
            taxFee = 1700 + ((value - 25000) * 0.1);
        } else if (value >= 55000 && value < 200_000) {
            taxFee = 4700 + ((value - 55000) * 0.12);
        } else if (value >= 200_000 & value < 1_000_000) {
            taxFee = 22100 + ((value - 200_000) * 0.15);
        } else if (value >= 1_000_000) {
            taxFee = 142100 + ((value - 1_000_000) * 0.17);
        } else {
            System.out.println("No tax!");
        }

        if (value < 5000) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + taxFee);
        }

    }
}
