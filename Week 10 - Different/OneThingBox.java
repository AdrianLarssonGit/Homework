/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author adrian
 */
public class OneThingBox extends Box{
    
    private Thing thing; 
    
    public OneThingBox(){
        
    }

    @Override
    public void add(Thing thing) {
        if(this.thing != null){
            return;
        }
        else{
            this.thing = thing;
        }
       
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        try {
              if(this.thing.equals(thing)){
            return true;
        }
        else{
            return false;
        }
            
        } catch (Exception NullPointerException) {
            return false;
        }
      
    }
    
    
}
