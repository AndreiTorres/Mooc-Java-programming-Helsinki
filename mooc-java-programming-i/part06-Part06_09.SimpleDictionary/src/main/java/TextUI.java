/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Jesus Torres
 */
public class TextUI {
    private SimpleDictionary dictionary;
    private Scanner scanner;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("end")) {
                break;
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String toBeTranslated = scanner.nextLine();
                String wordTranslated = dictionary.translate(toBeTranslated);
                if (wordTranslated == null) {
                    System.out.println("Word " + toBeTranslated + " was not found");
                } else {
                    System.out.println(wordTranslated);
                }
                
            } else {
                System.out.println("Unknown command");
            }
                       
        }
        
        System.out.println("Bye bye!");
    }
}
