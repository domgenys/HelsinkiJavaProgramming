
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        // ask for input until enters -1
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);// add to list
        }
        int greatest = list.get(0);
        //loop through the arraylist
        for(int i = 0; i<list.size(); i++){
        int number = list.get(i);
        if(greatest < number){//if first array's number is less than number from specific index
            greatest = number; 
            
        }
    }
        System.out.println("The greatest number: " + greatest);
       
    }
}
