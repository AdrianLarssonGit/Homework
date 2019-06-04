package storage;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrian
 */
public class Person{
    
    private String name = "";
    private ArrayList<String> nrs = new ArrayList<String>(); 
    private ArrayList<String> adress = new ArrayList<String>();
    private String trash = "";
    
    
    
    public Person(String name, String nr){
        this.name = name; 
         this.nrs.add(nr); 
    }
    
    
    public Person(String name, String street, String city){
        String adressToBeAdded = street + " " + city; 
        this.adress.add(adressToBeAdded);
        this.name = name;
        this.trash = trash;
        
    }

    public Person(String name){
        this.name = name; 
    }
    
    public void addNr(String nr){
        this.nrs.add(nr);
    }
    
    public void addAdress(String adress){
        this.adress.add(adress);
        
    }
    
    public void addEmptyAdress(){
        if(this.adress == null){
            this.adress = new ArrayList<String>();
        }
    }
    
    public void addAdresses(ArrayList<String> listOfAdresses){
        for(int i = 0; i < listOfAdresses.size(); i++){
            this.adress.add(listOfAdresses.get(i));
        }
        
    }
    
    public void addNrs(ArrayList<String> listOfNrs){
        for(int i = 0; i < listOfNrs.size(); i++){
            this.nrs.add(listOfNrs.get(i));
        }
    }
    
    public ArrayList<String> getNr(){
        return this.nrs;
    }
    
    public ArrayList<String> getAdress(){
        return this.adress;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void clearList(){
        this.nrs.clear();
    }
    
    public void clearAdress(){
        this.adress.clear();
    }
    
    public String toString(){
        return this.nrs.toString() + this.adress.toString();
    }

    
}
