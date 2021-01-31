

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String nameBook = scanner.nextLine();
            
            if (nameBook.isEmpty()) {
                break;
            }
            
            System.out.print("Input the age recomendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            books.add(new Book(nameBook, age));
        }
        
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);
        
        System.out.println();
        System.out.println(books.size() + " books in total.");
        System.out.println();
        System.out.println("Books:");
        books.stream()
                .forEach(book -> System.out.println(book));
        
        
        
    }

}
