/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.text.DecimalFormat;

/**
 *
 * @author adrian
 */
public class BulkTank {
    
    private double capacity;
    private double volume;
    
    public BulkTank(){
        this.capacity = 2000.0;
    }
    
    public BulkTank(double capacity){
        this.capacity = capacity;
    }
    
    public double getCapacity(){
       return this.capacity;
    }
    
    //How much is currently stored
    public double getVolume(){
        return this.volume;
    }
    
    //Diff between getCapacity - getVolume
    public double howMuchFreeSpace(){
        return this.capacity - this.volume;
    }
    
    //If more than fit no spill over just set volume = capcaity
    public void addToTank(double amount){
        if(amount + this.volume > this.capacity){
            this.volume = this.capacity;
            
        }
        else{
            this.volume += amount;
        }
        
    }
    
    //takes the required amount from the tank, or as much as there is left
    public double getFromTank(double amount){
        if(amount > this.volume){
            this.volume = 0.0;
            return this.volume;
        }
        else{
            this.volume -= amount;
            return amount;
            
        }
    }
    
    @Override
    public String toString(){
        /*if(this.volume > 0){
            DecimalFormat format1 = new DecimalFormat("#.#");
        String volume = format1.format(this.volume);
        return volume+ "/" + this.capacity;
        }
        else{ */
            return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
        }
        
    }
    
    
    
    

