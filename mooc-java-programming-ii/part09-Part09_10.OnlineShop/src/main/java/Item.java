/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Torres
 */
public class Item {
    private String product;
    private int quantity;
    private int unitPrice;
    
    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    }
    
    public int price() {
        return quantity * unitPrice;
    }
    
    public void increaseQuantity() {
        this.quantity = this.quantity + 1;
    }
    
    public String toString() {
        return this.product + ": " + this.quantity;
    }
    
}
