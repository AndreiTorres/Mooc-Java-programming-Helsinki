
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longest = 0;
        String name = "";
        int sum = 0;
        int count = 0;
        
        while (true) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }
            String[] line = string.split(",");
            sum = sum + Integer.valueOf(line[1]);
            count++;
            int number = line[0].length();
            if (number > longest) {
                longest = number;
                name = line[0];
            }
            
        }
         
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (double) sum / count);


    }
}
