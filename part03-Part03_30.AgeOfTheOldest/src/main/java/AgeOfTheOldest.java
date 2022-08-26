

import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
         ArrayList<String> userName = new ArrayList<String>();
         ArrayList<Integer> userAge = new ArrayList<Integer>();
         
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            
            String[] parts = input.split(",");
            //puting parts in ArrayList 
            userName.add(parts[0]);
            userAge.add(Integer.valueOf(parts[1]));
            
            
        }
        int oldest = userAge.get(0);
        for (int i = 0; i < userAge.size(); i++){
            int number = userAge.get(i);
            if(number > oldest){
                oldest=number;
            }
        }

        System.out.println("Age of the oldest: " + oldest);
    }
}
