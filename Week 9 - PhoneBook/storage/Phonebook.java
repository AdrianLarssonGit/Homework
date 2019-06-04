/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author adrian
 */
public class Phonebook {

    private ArrayList<Person> phoneBook = new ArrayList<Person>();

    public boolean exist(String name) {
        int Int = 0;
        for (Person p : phoneBook) {
            if (p.getName().equals(name)) {
                Int++;
            }
        }

        if (Int == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void addNrAndNewPerson(Person person) {

            this.phoneBook.add(person);


    }

    //If person exist and we only adding nr this method gets called from addPerson
    public void addNrExistingPerson(String name, String nrString) {
        int index = 0;

        //Add them all to this list, clear the old list.
        ArrayList<String> tempNr = new ArrayList<String>();

        //Finding index of name we want to update. 
        for (Person p : phoneBook) {
            if (p.getName().equals(name)) {
                break;
            }
            index++;
        }

        //Add all old nrs to new list. 
        for (int i = 0; i < phoneBook.get(index).getNr().size(); i++) {
            tempNr.add(phoneBook.get(index).getNr().get(i));
        }

        //Adding new nr
        tempNr.add(nrString);

        //Clearing old list
        phoneBook.get(index).clearList();

        //Sending the new list to person object. 
        phoneBook.get(index).addNrs(tempNr);

    }

    public void addAddressAndNewPerson(Person person) {
        if (this.phoneBook.isEmpty()) {
            this.phoneBook.add(person);

        } else {
            this.phoneBook.add(person);
        }

    }

    public void addAddressExistingPerson(String name, String addressString) {
        
        //Finding index of name we want to update. 
         int index = 0;
        for (Person p : phoneBook) {
            if (p.getName().equals(name)) {
                break;
            }
            index++;
        }

        
        //Add them all to this list, clear the old list. 
        ArrayList<String> tempNr = new ArrayList<String>(phoneBook.get(index).getAdress());

        //Adding new nr
        tempNr.add(addressString);

        //Clearing old list
        phoneBook.get(index).clearAdress();

        //Sending the new list to person object. 
        phoneBook.get(index).addAdresses(tempNr);

    }

    public void searchByName(String person) {

        int triggerd = 0; //If this is one we have found a match and will not 
        //print not found message
        for (Person p : this.phoneBook) {
            if (p.getName().equals(person)) {
                for (int i = 0; i < p.getNr().size(); i++) {
                    triggerd++;
                    System.out.println(p.getNr().get(i));
                }

            }
        }
        if (triggerd == 0) {
            System.out.println("not found");
        }

    }

    public void searchByNr(String number) {

        int triggered = 0;
        for (Person p : phoneBook) {
            for (int i = 0; i < p.getNr().size(); i++) {
                if (p.getNr().get(i).equals(number)) {
                    System.out.println(p.getName());
                    triggered++;
                }

            }
        }

        //If we triggered at least once we found a match
        //if triggered still == 0 then no match was found in whole phonebook
        if (triggered == 0) {
            System.out.println("   not found");
        }

    }

    public void getInformation(String name) {
        //First test to see if person is in the phonebook at all
        //if not we print "not found"
        
        

        int trigg = 0;
        for (Person p : phoneBook) {
            if (p.getName().equals(name)) {
                trigg++;
            }

        }

        //if still 0 we did not find a match at all
        if (trigg == 0) {
            System.out.println("  not found");

        } else {

            int index = 0;
            for (Person p : phoneBook) {
                if (p.getName().equals(name)) {
                    break;

                }
                index++;
            }
 
            if (phoneBook.get(index).getAdress().isEmpty()) {

                System.out.println("  address unknown");

            } else {
                
                for(Person p : phoneBook){
                    
                

                System.out.print("  adress: ");
                
                for (int i = 0; i < phoneBook.get(index).getAdress().size(); i++) {
                            if(i == 0){
                                System.out.print("" + phoneBook.get(index).getAdress().get(i));
                            }
                            else{
                                System.out.print("          " + phoneBook.get(index).getAdress().get(i));
                            }
                            
                            System.out.println("");
                     
                    

                
            }
                }
            }
            
            System.out.println("");
            System.out.println("  phone numbers: ");

            int index1 = 0;
            for (Person p : phoneBook) {
                if (p.getName().equals(name)) {
                    
                    break;
                }
                index1++;

            }
            if (phoneBook.get(index1).getNr().isEmpty()) {
                System.out.println("  phone number not found");

            } else {

                for (int i = 0; i < phoneBook.get(index1).getNr().size(); i++) {
                    System.out.print("   " + phoneBook.get(index1).getNr().get(i));
                    System.out.println("");
                }
            }

        }
    }
    

    public void deletePersonal(String name) {

        for (Person p : phoneBook) {
            if (p.getName().equals(name)) {
                p.clearAdress();
                p.clearList();

            }
        }

    }

    public void seachByTerm(String searchTerm) {

        Collections.sort(phoneBook, new Sorter());

        //We need to search everything by this term.
        //Name, nr and adress and print all fields of person object if match
        if (searchTerm.isEmpty()) {

            for (Person p : phoneBook) {

                System.out.println(" " + p.getName());
                if (p.getAdress().isEmpty() && p.getNr().isEmpty()) {
                    System.out.println(" adress not found");
                    System.out.println("  phone number not found");

                } else if (!p.getAdress().isEmpty() && p.getNr().isEmpty()) {
                    System.out.print("  adress:");
                    for (int i = 0; i < p.getAdress().size(); i++) {
                        System.out.println(" " + p.getAdress().get(i));

                    }
                    System.out.println("  phone number not found");
                } else if (p.getAdress().isEmpty() && !p.getNr().isEmpty()) {

                    System.out.println("  phone numbers:");
                    for (int i = 0; i < p.getNr().size(); i++) {
                        System.out.println(" " + p.getNr().get(i));

                    }
                } else if (!p.getAdress().isEmpty() && !p.getNr().isEmpty()) {
                    System.out.print("  adress:");
                    for (int i = 0; i < p.getAdress().size(); i++) {
                        System.out.println(" " + p.getAdress().get(i));

                    }
                    System.out.println("  phone numbers:");
                    for (int i = 0; i < p.getNr().size(); i++) {
                        System.out.println(" " + p.getNr().get(i));

                    }
                }

            }
        } else {

            //Search name and if match print person object.
            int thetracker = 0;

            for (Person p : this.phoneBook) {
                if (p.getName().contains(searchTerm) || p.getAdress().toString().contains(searchTerm) || p.getNr().toString().contains(searchTerm)) {
                    thetracker++;
                    System.out.println(" " + p.getName());

                    //Print address
                    if (p.getAdress().isEmpty()) {

                        System.out.println("address unknown");
                    } else {
                        System.out.print("  address:");
                        for (int i = 0; i < p.getAdress().size(); i++) {
                            System.out.println(" " + p.getAdress().get(i));
                        }
                    }

                    //Print nr
                    if (p.getNr().isEmpty()) {
                        System.out.println("phone number not found");
                    } else {
                        System.out.println("  phone numbers:");
                        for (int i = 0; i < p.getNr().size(); i++) {

                            System.out.println("   " + p.getNr().get(i));
                        }
                    }
                }

            }
            if (thetracker == 0) {
                System.out.println("not found");
            }

        }
    }
}
