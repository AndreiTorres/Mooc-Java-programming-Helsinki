
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String longest() {
        int longest = 0;
        String longer = "";
        if (elements.size() >= 1) {
             for (String element : elements) {
                if (element.length() > longest) {
                longest = element.length();
                longer = element;
                }
            }
        } else {
            return null;
        }
        
        
        
        return longer;
    }

}
