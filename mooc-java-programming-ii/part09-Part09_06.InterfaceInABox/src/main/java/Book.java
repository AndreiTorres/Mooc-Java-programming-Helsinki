/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Torres
 */
public class Book implements Packable{
    private String nameAuthor;
    private String nameBook;
    private double bookWeight;
    
    public Book(String nameAuthor, String nameBook, double bookWeight) {
        this.nameAuthor = nameAuthor;
        this.nameBook = nameBook;
        this.bookWeight = bookWeight;
    }
    
    public double weight() {
        return this.bookWeight;
    }
    
    public String toString() {
        return this.nameAuthor + ": " + this.nameBook;
    }
    
    
    
}
