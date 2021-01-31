
public class Statistics {
    private int count;
    private int sum;
    
    
    
    
    public Statistics() {
        count = 0;
        sum = 0;
    }
    
    public void addNumber(int number) {
        count = count + 1;
        sum += number;
        
    }
    
    public int getCount() {
        return count;
    }
    
    public int sum() {
        return sum;
    }
    
    public double average() {
        double average;
        if (count > 0) {
            average = (double) sum / count;
        } else {
            average = 0;
        }
        
        return average;
        
    }
    
}