/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author Jesus Torres
 */
public class VehicleRegistry {
    private HashMap <LicensePlate, String> owners;
    
    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        
        for (LicensePlate license : owners.keySet()) {
            if (license.equals(licensePlate)) {
                return false;
            }
        }
        
        owners.put(licensePlate, owner);
        
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        
        if(!(owners.containsKey(licensePlate))) {
            return null;
        }
        
        return owners.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate) {
        
        if(!(owners.containsKey(licensePlate))) {
            return false;
        }
        
        owners.remove(licensePlate, owners.get(licensePlate));
        
        return true;
    }
    
    public void printLicensePlates() {
        
        for (LicensePlate licensePlate : owners.keySet()) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners() {
        
        ArrayList <String> ownersAlreadyPrinted = new ArrayList<>();
        
        for (String owner : owners.values()) {
            if (!(ownersAlreadyPrinted.contains(owner))) {
                ownersAlreadyPrinted.add(owner);
                System.out.println(owner);
            }
        }
    } 
    
}
