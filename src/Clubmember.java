/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrian
 */
public class Clubmember implements Comparable<Clubmember> {
    
    private int height; 
    private String name; 
    
    public Clubmember(String name, int height){
        this.name = name;
        this.height = height;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getHeight(){
        return this.height;
                
    }
    
    @Override
    public String toString(){
        return this.getName() + " (" + this.getHeight() + ")";
    }

    @Override
    public int compareTo(Clubmember clubmember) {
      return this.height - clubmember.getHeight();
    }
    
    
    
    
    
}
