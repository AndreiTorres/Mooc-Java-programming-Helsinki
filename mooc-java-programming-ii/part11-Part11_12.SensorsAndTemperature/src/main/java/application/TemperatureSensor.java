/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Jesus Torres
 */
public class TemperatureSensor implements Sensor {
    private boolean isOn;
    
    public TemperatureSensor() {
        this.isOn = false;
    }
    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        this.isOn = true;
    }

    @Override
    public void setOff() {
        this.isOn = false;
    }

    @Override
    public int read() {
        
        if (!isOn) {
            throw new IllegalStateException("State Exception");
        }
        
        return ThreadLocalRandom.current().nextInt(-30, 30 + 1);
    }
    
}
