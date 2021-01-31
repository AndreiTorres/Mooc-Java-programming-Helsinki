
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        

        while (true) {
            boolean isEqual = false;
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).equals(book)) {
                    isEqual = true;
                    break;
                }
            }
            if (isEqual) {
                System.out.println("The book is already on the list. Let's not add the same book again.");
                continue;
            } else {
                books.add(book);
            }
            /*
            book1
2018
book2
2018
book3
2015
book4
2015
book4
2015
book5
2018
book5
2018
            */

        }
        
        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
