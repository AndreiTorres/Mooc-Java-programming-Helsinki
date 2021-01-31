/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jesus Torres
 */
public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> averages;
    
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.averages = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    
    @Override
    public boolean isOn() {
        boolean isOn = false;
        
        for (Sensor sensor: sensors) {
            if (sensor.isOn()) {
                isOn = true;
            } else {
                isOn = false;
            }
        }
        return isOn;
    }

    @Override
    public void setOn() {
        
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        
        
        if (this.sensors.isEmpty() || !isOn()) {
            throw new IllegalStateException("Illegal State Exception");
        } else {
            int suma = 0;
            for (Sensor sensor : sensors) {
                suma += sensor.read();
            }
            int average = suma / sensors.size();
            averages.add(average);
            
            return average;
        }
       
    }
    
    public List<Integer> readings() {
        return averages;
    }
    
}
