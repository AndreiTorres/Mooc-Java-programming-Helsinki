
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TripleTacoBox tacos = new TripleTacoBox();
        
        System.out.println(tacos.tacosRemaining());
        tacos.eat();
        tacos.eat();
        System.out.println(tacos.tacosRemaining());
        
        CustomTacoBox customTacos = new CustomTacoBox(5);
        customTacos.eat();
        System.out.println(customTacos.tacosRemaining());
    }
}
