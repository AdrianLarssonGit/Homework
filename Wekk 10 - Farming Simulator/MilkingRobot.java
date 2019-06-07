/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author adrian
 */
public class MilkingRobot {
    
    private BulkTank tank;
    
    public MilkingRobot(){
        
    }
    
    
    public void setBulkTank(BulkTank tank){
        this.tank = tank;
    }
    
    
    public BulkTank getBulkTank(){
        return this.tank;
    }
    
   
    
    public void milk(Milkable milkable){
        try {
            double milkInTransfer = milkable.milk();
        tank.addToTank(milkInTransfer);
        } catch (Exception e) {
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
            
        
        
            //System.out.println("The MilkingRobot hasn't been installed");
        
        
    }
    
    
}
