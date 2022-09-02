
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Genys.D
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDict;

    public TextUI(Scanner scanner, SimpleDictionary simpleDict) {
        this.scanner = scanner;
        this.simpleDict = simpleDict;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            doTask(input);

        }
        System.out.println("Bye bye!");

    }
    public void doTask(String task){
        if(task.equals("add")){
            add();
        }else if(task.equals("search")){
            search();
        }else{
            System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.println("Word: ");
        String word = scanner.nextLine();
        System.out.println("Translation: ");
        String translation = this.scanner.nextLine();
        this.simpleDict.add(word, translation);

    }

    public void search() {

        System.out.println("To be tranlsated: ");
        String toBetranslated = scanner.nextLine();
        if (this.simpleDict.translate(toBetranslated) == null) {
            System.out.println("Word " + toBetranslated + " was not found");
        } else {
            System.out.println("Translation: " + simpleDict.translate(toBetranslated));
        }

        
    }

}
