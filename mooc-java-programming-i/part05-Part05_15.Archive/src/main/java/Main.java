
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Item> items = new ArrayList<>();
        
        while (true) {
            boolean isEqual = false;
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
             if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Item item = new Item(identifier, name);
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).getIdentifier().equals(item.getIdentifier())) {
                    isEqual = true;
                    break;
                }
            }
            if (isEqual) {
                continue;
            }  else {
                items.add(item);
            }
        }
        
        for (Item item : items) {
            System.out.println(item);
        }


    }
}
