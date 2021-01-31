
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            
            if (number < 0) {
                break;
            }
            
            numbers.add(number);
        }
        
        numbers.stream()
                .filter((Integer value) -> {
                    if (value >= 1 && value <= 5) {
                        return true;
                    }
                    
                    return false;
                })
                .forEach(value -> System.out.println(value));
    }
}
