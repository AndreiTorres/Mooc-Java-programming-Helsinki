public class Item {
    
    private String identifier;
    private String name;
    
    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public Item(String identifier) {
        this.identifier = identifier;
        this.name = "";
    }
    
    public String getIdentifier() {
        return identifier;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean equals(Item compared) {
        
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Item)) {
            return false;
        }
        
        Item compareItem = (Item) compared;
        
        if (this.identifier.equals(compareItem.identifier)) {
            return true;
        }
        
        return false;
    }
    
    public String toString(){
        return this.identifier + ": " + this.name;
    }
}