
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int number = Integer.valueOf(parts[1]);
            
            if (command.equals("add")) {
                firstContainer.add(number);
            }
            
            if (command.equals("move")) {
                if (number > firstContainer.contains()) {
                    secondContainer.add(firstContainer.contains());
                    firstContainer.remove(firstContainer.contains());
                } else {
                    firstContainer.remove(number);
                    secondContainer.add(number);
                }
            }
            
            if (command.equals("remove")) {
                if (number > secondContainer.contains()) {
                    secondContainer.remove(secondContainer.contains());
                } else {
                    secondContainer.remove(number);
                }
            }
            

        }
    }

}
