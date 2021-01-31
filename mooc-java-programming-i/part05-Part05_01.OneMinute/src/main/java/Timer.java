/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jesus Torres
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand hundredthsSeconds;
    
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundredthsSeconds = new ClockHand(100);
    }
    
    public void advance() {
        this.hundredthsSeconds.advance();
        
        if (this.hundredthsSeconds.value() == 0) {
            this.seconds.advance(); 
        }
    }
    
    public String toString() {
        return "" + this.seconds + ":" + this.hundredthsSeconds;
    }
}
