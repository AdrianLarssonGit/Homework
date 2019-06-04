/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author adrian
 */
public class Person {
    
    private String name;
    private String address;
    
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    @Override
    public String toString(){
        String string = this.name + "\n  " + this.address;
        return string;
    }
    
}
