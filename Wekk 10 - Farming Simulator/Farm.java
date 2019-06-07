/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author adrian
 */
public class Farm implements Alive{
    
    private LinkedList<Cow> cows;
    private Barn barn;
    private String owner;
    
    public Farm(String owner, Barn barn){
       this.cows = new LinkedList<Cow>(); 
       this.barn = barn;
       this.owner = owner;
    }
    
    public void installMilkingRobot(MilkingRobot robot){
        barn.installMilkingRobot(robot);
    }
    
    public void addCow(Cow cow){
        
        this.cows.add(cow);
    }

    @Override
    public void liveHour() {
        for(Cow c : this.cows){
            c.liveHour();
        }
                
    }
    
    public void manageCows(){
        this.barn.takeCareOf(this.cows);
    }
    
    public String getOwner(){
        return this.owner;
    }
    
    public String getCows(){
        String string = "";
        for(Cow c : cows){
            string += "        "+c.toString()+"\n";
        }
        
        return string;
    }
    
   @Override
   public String toString(){
       if(this.cows.isEmpty()){
           return "Farm owner: " + getOwner() + "\nBarn bulk tank: " + this.barn.getBulkTank().toString() + "\nNo cows.";
       }
       else{
           
           return "Farm owner: " + getOwner() + "\nBarn bulk tank: " 
                   + this.barn.getBulkTank().toString() +
                   "\nAnimals: \n"+ getCows();
                   
       }
       
   }
    
}
