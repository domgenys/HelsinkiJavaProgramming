
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> booklist = new ArrayList<>();

        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            booklist.add(new Book(title, pages, publicationYear));
        }
        System.out.println("What information will be printed? ");
        String input = scanner.nextLine();
        if (input.contains("everything")) {
            for (Book element : booklist) {
                System.out.println(element.toString());
            }
        }
            if (input.contains("name")) {
                for (Book element : booklist) {
                    System.out.println(element.getTitle());
                }
            }
        }
    }

