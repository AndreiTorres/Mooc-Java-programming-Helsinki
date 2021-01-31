
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
       

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int number = Integer.valueOf(parts[1]);
            
            if (command.equals("add") && number > 0) {
                int total = firstContainer;
                total += number;
                if (total > 100) {
                    firstContainer = 100;
                } else {
                    firstContainer += number;
                }
            }
            
            if (command.equals("move") && number > 0 && firstContainer > 0) {
                int secondTotal = secondContainer;
                secondTotal += number;
                
                if (secondTotal > 100) {
                    firstContainer -= number;
                    secondContainer = 100;
                } else {
                    if (number > firstContainer) {
                        secondContainer = secondContainer + firstContainer;
                        firstContainer = 0;  
                    } else {
                        firstContainer -= number;
                        secondContainer += number;
                    }
                }     
            }
            
            if (command.equals("remove") && number > 0) {
                if (number > secondContainer) {
                    secondContainer = 0;
                } else {
                    secondContainer -= number;
                }
            }
            
            

        }
    }

}
