/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author adrian
 */
public class Cow implements Milkable, Alive{
    
     private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
     
     private String name = "";
     private double udder;
     private double milkInUdder;
    
    public Cow(){
        int random = new Random().nextInt(NAMES.length);
        this.name = NAMES[random];
        int num = 15 + new Random().nextInt(26);
        this.udder = num; 
    }
    
    public Cow(String name){
        this.name = name; 
        
        int num = 15 + new Random().nextInt(26);
        this.udder = num; 
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCapacity(){
        return this.udder;
    }
    
    public double getAmount(){
      /* double num = 15 + new Random().nextInt(26); 
       return num; */
      return this.milkInUdder;
    }

    @Override
    public double milk() {
       double milk = this.milkInUdder;
       this.milkInUdder = 0.0;
       return milk;
       
    }

    @Override
    public void liveHour() {
        
        double milkThisHour = 0.7 + new Random().nextInt(3);
        if(milkThisHour > 2.0){
            milkThisHour = 2.0;
        }
        
        if(milkThisHour + this.milkInUdder > this.udder){
            this.milkInUdder = this.udder;
        }
        else{
            this.milkInUdder += milkThisHour;
        }
        
    }
    
    @Override
    public String toString(){
       /*  if(this.milkInUdder > 0){
            DecimalFormat format1 = new DecimalFormat("#.#");
        String volume = format1.format(this.milkInUdder);
        return this.name + " " + volume + "/" + this.udder;
        }
        else{ */
            return this.name + " " + Math.ceil(this.milkInUdder)+ "/" + Math.ceil(this.udder);
        }
       
    }
    
    
    

