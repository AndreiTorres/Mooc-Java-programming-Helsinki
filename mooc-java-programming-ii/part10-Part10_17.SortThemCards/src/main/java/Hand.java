
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Torres
 */
public class Hand implements Comparable<Hand>{
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        cards.add(card);
    }
    
    public void print() {
        cards.stream()
                .forEach(card -> System.out.println(card));
    }
    
    public void sort() {
        Collections.sort(cards);
    }

    @Override
    public int compareTo(Hand o) {
        
        int value = this.cards.stream()
                .map(card -> card.getValue())
                .reduce(0, (value1, value2) -> value1 + value2);
        int oValue = o.cards.stream()
                .map(card -> card.getValue())
                .reduce(0, (value1, value2) -> value1 + value2);
        
        return value - oValue;
    }
    
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
    
    
}
