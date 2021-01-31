
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        
        while (true) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }
            String[] line = string.split(",");
            int number = Integer.valueOf(line[1]);
            if (number > oldest) {
                oldest = number;
            }    
        }
         
        System.out.println("Age of the oldest: " + oldest);


    }
}
