package storage;


import java.util.Comparator;
import storage.Person;
import storage.Phonebook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrian
 */
public class Sorter implements Comparator<Person>{

    @Override
    public int compare(Person t, Person t1) {
        return t.getName().compareTo(t1.getName());
    }
    
}
