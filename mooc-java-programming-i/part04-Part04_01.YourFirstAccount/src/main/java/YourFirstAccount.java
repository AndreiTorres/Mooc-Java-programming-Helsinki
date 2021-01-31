
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account andreiAccount = new Account("Andrei's account", 100.00);
        
        andreiAccount.deposit(20.0);
        System.out.println(andreiAccount);
    }
}
