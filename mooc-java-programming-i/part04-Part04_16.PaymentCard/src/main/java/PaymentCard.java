/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Torres
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance) {
        balance = openingBalance;
    }
    
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
    
    public void eatAffordably() {
        if (balance < 2.60) {
            balance = balance;
        } else {
            balance = this.balance - 2.60;
        }
        
    }
    
    public void eatHeartily() {
        if (balance < 4.60) {
            balance = balance;
        } else {
            balance = balance - 4.60;
        }
    
    }
    
    public void addMoney(double amount) {
        
        if (amount < 0) {
            balance = balance;
        } else {
            balance = balance + amount;
        }
        
        if (balance > 150) {
            balance = 150;
        } else {
            balance = balance;
        }
    }
}
