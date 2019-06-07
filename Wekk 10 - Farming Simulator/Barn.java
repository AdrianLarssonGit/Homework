/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author adrian
 */
public class Barn {
    
    private BulkTank tank;
    private MilkingRobot milkingRobot;
    
    public Barn(BulkTank tank){
        this.tank = tank;
    }
    
    public BulkTank getBulkTank(){
        return this.tank;
    }
    
   public void installMilkingRobot(MilkingRobot milkingRobot) {
       this.milkingRobot = milkingRobot;
       this.milkingRobot.setBulkTank(this.tank);
        } 
       
    public void takeCareOf(Cow cow){
        try {
             milkingRobot.milk(cow);
            
        } catch (Exception e) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
       
    }   
       
    public void takeCareOf(Collection<Cow> cows){
        try {
            for(Cow c : cows){
            milkingRobot.milk(c);
        }
            
        } catch (Exception e) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
        
    }
    
    @Override
    public String toString(){
        return this.tank.toString();
    }
       
       
 
    
    
}
