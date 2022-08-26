
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String[] splitArray = input.split(" ");
            for(String e : splitArray){
                if(e.contains("av")){
                    System.out.println(e);
                }
            }
                
        }


    }
}
