
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());
        
        int tax = 0;
        double gifttax = 0;
        
        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift < 25000) {
            tax = 100;
            gifttax = ((double) tax + (gift - 5000) * 0.08);
            System.out.println("Tax: " + gifttax);
        } else if (gift < 55000) {
            tax = 1700;
            gifttax = ((double) tax + (gift - 25000) * 0.10);
            System.out.println("Tax: " + gifttax);
        } else if (gift < 200000) {
            tax = 4700;
            gifttax = ((double) tax + (gift - 55000) * 0.12);
            System.out.println("Tax: " + gifttax);
        } else if (gift < 1000000) {
            tax = 22100;
            gifttax = ((double) tax + (gift - 200000) * 0.15);
            System.out.println("Tax: " + gifttax);
        } else {
            tax = 142100;
            gifttax = ((double) tax + (gift - 1000000) * 0.17);
            System.out.println("Tax: " + gifttax);
        }
    }
}
