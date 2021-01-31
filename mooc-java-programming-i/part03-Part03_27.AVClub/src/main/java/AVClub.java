
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }
            String[] line = string.split(" ");
            for (int i = 0; i < line.length; i++) {
                if (line[i].contains("av")) {
                    System.out.println(line[i]);
                }
            }
        }
    }
}
