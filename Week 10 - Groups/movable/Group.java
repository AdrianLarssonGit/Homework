/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;

/**
 *
 * @author adrian
 */
public class Group implements Movable{
    
    private ArrayList<Movable> list = new ArrayList<Movable>();
    
    public void addToGroup(Movable movable){
        list.add(movable);
    }
    
    @Override
    public void move(int dx, int dy){
        for(Movable m : list){
            m.move(dx, dy);
        }
    }
    
    @Override
    public String toString(){
        String string = "";
        for(Movable m : list){
            string += m.toString() + "\n";
        }
        return string;
    }

    
   
    
}
