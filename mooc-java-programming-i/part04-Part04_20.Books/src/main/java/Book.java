/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Torres
 */
public class Book {
    private String title;
    private int numOfPages;
    private int publicationYear;
    
    public Book(String title, int numOfPages, int publicationYear){
        this.title = title;
        this.numOfPages = numOfPages;
        this.publicationYear = publicationYear;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String toString() {
        return title + ", " + numOfPages + " pages, " + publicationYear;
    }
            
            
}
