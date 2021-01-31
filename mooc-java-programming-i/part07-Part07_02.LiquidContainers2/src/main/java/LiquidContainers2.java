
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {
            System.out.print("> ");
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String parts[] = input.split(" ");
            String command = parts[0];
            int number = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                first.add(number);
            } else if (command.equals("move") && number >= 0 && first.contains() > 0) {
                int suma = second.contains();
                suma = suma + number;
                if (suma > 100) {
                    first.remove(number);
                    second.add(100);
                } else {
                    if (number > first.contains()) {
                    second.add(first.contains());
                    first.remove(first.contains());      
                    } else {
                    first.remove(number);
                    second.add(number);
                    }
                }
            } else if (command.equals("remove") && number >= 0) {
                if (number > second.contains()) {
                    second.remove(second.contains());
                } else {
                    second.remove(number);
                }
            }
        }
    }
}
