
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("First name: ");
            String firstInput = scanner.nextLine();
            if(firstInput.isEmpty()){
                break;
            }
            System.out.println("Last name: ");
            String secondInput = scanner.nextLine();
            System.out.println("Identification number: ");
            String thirdInput = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(firstInput, secondInput, thirdInput));
            
          
            }
          for(PersonalInformation  i : infoCollection){
                System.out.println(i.getFirstName()+ " " + i.getLastName());
        }

    }
}
