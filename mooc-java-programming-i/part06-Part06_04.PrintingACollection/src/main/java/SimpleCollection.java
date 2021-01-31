
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;
    private int letters;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
        this.letters = 0;
    }

    public void add(String element) {
        this.elements.add(element);
        this.letters++;
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        
        String printOut = "";
        String letter = "";
        if (elements.isEmpty()) {
            printOut = "The collection " + this.name + " is empty.";
        } else if (elements.size() == 1) {
            printOut = "The collection " + this.name + " has " + this.letters + " element:" + "\n" + elements.get(0);
        } else {
            for (String element : elements) {
            letter = letter + element + "\n";
        }
        
            printOut = "The collection " + this.name + " has " + this.letters + " elements:" + "\n" + letter;
        }
        
        
        return printOut;
        
    }
    
}
