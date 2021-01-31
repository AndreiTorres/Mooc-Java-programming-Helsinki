/**
 * @author Jesus Torres
 */
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        
        while (true) {
            System.out.print("> ");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String parts[] = input.split(" ");
            String command = parts[0];
            int number = Integer.valueOf(parts[1]);
            if (command.equals("add") && number >= 0) {
                int suma = first;
                suma = suma + number;
                if (suma > 100) {
                    first = 100;
                } else {
                    first = first + number;
                }
            } else if (command.equals("move") && number >= 0 && first > 0) {
                int suma = second;
                suma = suma + number;
                if (suma > 100) {
                    first = first - number;
                    second = 100;
                } else {
                    if (number > first) {
                    second = second + first;
                    first = 0;      
                    } else {
                    first = first - number;
                    second = second + number;
                    }
                }
            } else if (command.equals("remove") && number >= 0) {
                if (number > second) {
                    second = 0;
                } else {
                    second = second - number;
                }
            }
        }
    }
}
