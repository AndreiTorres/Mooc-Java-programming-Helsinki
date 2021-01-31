
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        int thisArea = this.squares;
        int comparedArea = compared.squares;
        
        if (thisArea > comparedArea) {
            return true;
        }
        
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int price = this.squares * this.princePerSquare;
        int comparedPrice = compared.squares * compared.princePerSquare;
        int difference = price - comparedPrice;
        
        if (difference < 0) {
            difference = (-1) * difference;
        }
        
        return difference;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int price = this.squares * this.princePerSquare;
        int comparedPrice = compared.squares * compared.princePerSquare;
        
        if (price > comparedPrice) {
            return true;
        }
        
        return false;
    }

}
