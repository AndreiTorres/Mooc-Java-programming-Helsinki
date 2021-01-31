
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList <String> numbers = new ArrayList<>();
        
        while (true) {
            String command = scanner.nextLine();
            
            if (command.equals("end")) {
                break;
            }
            
            numbers.add(command);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String option = scanner.nextLine();
        
        switch(option) {
            case "n":
                double averageOfNegative = numbers.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(number -> number < 0)
                        .average()
                        .getAsDouble();
                        System.out.println("Average of the negative numbers: " + averageOfNegative);
                        break;
            case "p":
                double averageOfPositive = numbers.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(number -> number > 0)
                        .average()
                        .getAsDouble();
                        System.out.println("Average of the positive numbers: " + averageOfPositive);
                        break;
        }
        
        

    }
}
