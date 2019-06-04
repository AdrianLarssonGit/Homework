
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.management.ObjectName;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrian
 */
public class RingingCentre {
    
    
    private Map<Bird,List<String>> mapOfObservations;
    
    public RingingCentre(){
        this.mapOfObservations = new HashMap<Bird, List<String>>();
    }
    
    
    public void observe(Bird bird, String place){
        
        if(mapOfObservations.containsKey(bird)){
            mapOfObservations.get(bird).add(place);
        }
        else{
            ArrayList<String> placeList = new ArrayList<String>();
            placeList.add(place);
            mapOfObservations.put(bird, placeList);
        }
        

        
        
    }
    
    public void observations(Bird bird){
        
        System.out.print(bird.toString() + " observations: " );
        if(mapOfObservations.containsKey(bird)){
            System.out.print(mapOfObservations.get(bird).size());
        }
        else{
            System.out.println("0");
        }
        
        System.out.println("");
        
        if(mapOfObservations.containsKey(bird)){
            for(int i = 0; i < mapOfObservations.get(bird).size(); i++){
                System.out.println(mapOfObservations.get(bird).get(i));
            }
        }
       
      
      
        
       }
       
        
        
    }
    

