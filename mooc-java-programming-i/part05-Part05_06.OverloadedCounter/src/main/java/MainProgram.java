
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter(5);
        
        counter.increase();
        counter.increase(5);
        counter.increase(-2);
        System.out.println(counter.value());
        
        counter.decrease();
        counter.decrease(3);
        System.out.println(counter.value());
        
        
    }
}
