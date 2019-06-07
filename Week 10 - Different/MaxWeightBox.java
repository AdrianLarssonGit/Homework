/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adrian
 */
public class MaxWeightBox extends Box{
    
    private int maxWeight;
    private List<Thing> list = new ArrayList<Thing>();
    
    
    
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    

    @Override
    public void add(Thing thing) {
        int totalWeight = 0;
        for(Thing t : this.list){
            totalWeight += t.getWeight();
        }
        if(thing.getWeight() + totalWeight <= this.maxWeight){
            list.add(thing);
        }
        else{
            return;
        }
        
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        int i = 0;
        for(Thing t : this.list){
            if (thing.equals(t)){
                i++;
            }
           
        }
        
        if(i > 0){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
