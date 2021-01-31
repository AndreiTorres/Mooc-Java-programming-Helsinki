
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List <String> numbers = new ArrayList<>();
        
        while (true) {
            String command = scanner.nextLine();
            
            if (command.equals("end")) {
                break;
            }
            
            numbers.add(command);
        }
        
        double average = numbers.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .average()
            .getAsDouble();
        
        System.out.println("average of numbers: " + average);
    }   
}
