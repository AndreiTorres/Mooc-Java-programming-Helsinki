
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "";
        
        while (true) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }
            String[] line = string.split(",");
            int number = Integer.valueOf(line[1]);
            if (number > oldest) {
                oldest = number;
                name = line[0];
            }    
        }
         
        System.out.println("Name of the oldest: " + name);


    }
}
