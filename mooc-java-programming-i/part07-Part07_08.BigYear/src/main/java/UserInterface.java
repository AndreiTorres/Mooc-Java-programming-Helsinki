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
public class UserInterface {
    private ListOfBirds birds;
    private Scanner scanner;
    
    public UserInterface(Scanner scanner, ListOfBirds birds) {
        this.scanner = scanner;
        this.birds = birds;
    }
    
    public void start() {
        System.out.println("Add - adds a bird");
        System.out.println("Observation - adds an observation");
        System.out.println("All - prints all birds");
        System.out.println("One - prints one bird");
        System.out.println("Quit - ends the program");
        
        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();
            
            if (command.equals("Quit")) {
                break;
            }
            
            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String nameLatin = scanner.nextLine();
                birds.addBirds(new Bird(name, nameLatin));
            }
            
            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String birdname = scanner.nextLine();
                birds.addObservations(birdname);
            }
            
            if (command.equals("All")) {
                birds.printAllBirds();
            }
            
            if (command.equals("One")) {
                System.out.print("Bird? ");
                String birdname = scanner.nextLine();
                birds.printOneBird(birdname);
            }
            
        }
    }
}
