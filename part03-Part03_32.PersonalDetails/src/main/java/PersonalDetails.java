
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      ArrayList<String> names = new ArrayList<String>();
      ArrayList <Integer> DOB = new ArrayList<Integer>();
      
      while(true){
          String input = scanner.nextLine();
          if(input.equals("")){// if empty break
              break;
          }
          String[] splitInput = input.split(",");
          //split input to arrays, and add to ArrayList
          
          names.add(splitInput[0]);
          DOB.add(Integer.valueOf(splitInput[1]));
      }
      
      String longest = names.get(0);
      for(String name : names){
          //if value from arraylist is bigger than longest
          if(name.length() > longest.length()){
              longest = name;
          }
      }
        System.out.println("Longest name: " + longest);
        
        int sum = 0;
        for(int year : DOB){
            sum+= year;
        }
        System.out.println("Average of the birth years: " + 1.0 * sum / DOB.size());
    }
}
