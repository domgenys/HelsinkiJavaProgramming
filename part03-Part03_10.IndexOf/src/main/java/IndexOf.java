
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        // loop until eneters -1
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);// add to arraylist
        }

        System.out.println("Search for? "); // prompt for what number to search from arraylist
        int searchFor = Integer.valueOf(scanner.nextLine());
        
        
        for(int i = 0; i <list.size(); i++){
            if (searchFor == list.get(i)){
                System.out.println(searchFor + " is at index " +i);
            }
        }

        // implement here finding the indices of a number
    }
}
