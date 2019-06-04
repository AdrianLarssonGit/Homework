import java.util.ArrayList;
import java.util.Scanner;
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
public class UI{
    Scanner scanner = new Scanner(System.in);
    private Phonebook phonebook = new Phonebook();
    
    public void start(){
        System.out.println("phone search\n" +
"available operations:\n" +
" 1 add a number\n" +
" 2 search for a number\n" +
" 3 search for a person by phone number\n" +
" 4 add an address\n" +
" 5 search for personal information\n" +
" 6 delete personal information\n" +
" 7 filtered listing\n" +
" x quit");
        
        
        
        while(true){
            System.out.println("");
            System.out.print("command: ");
            
            String choice = this.scanner.next();
            
         
                 
             if(choice.equals("1")){
                  addNr();
             }
              else if(choice.equals("2")){
                  searchName();
              }
              else if(choice.equals("3")){
                  searchByNr();
                  
              }
              else if(choice.equals("4")){
                  addAddress();
                  
              }
              else if(choice.equals("5")){
                  searchPersonalInformation();
                  
              }
              else if(choice.equals("6")){
                  deletePersonalInformation();
                  
              }
              else if(choice.equals("7")){
                  filterListing();
                  
              }
              else if(choice.equals("x")){
                  break;
              }
                
                  
              }
                  
        }
      
        
         public void addNr(){
             
                 System.out.print("whose number: ");
                 String name = scanner.next();
                
                System.out.print("number: ");
                String nr = scanner.next();
                String nrInt = nr;
        
                if(!phonebook.exist(name)){
                    Person person = new Person(name, nrInt);
                    phonebook.addNrAndNewPerson(person);
                }
                
                else{
                    phonebook.addNrExistingPerson(name,nrInt);
                }
                
               
                
             
        
    }

    private void searchName() {
        
        System.out.print("whose number: ");
        String person = scanner.next();
        phonebook.searchByName(person);

        }
        
    


    private void searchByNr() {
        System.out.print("number: ");
        String nr = scanner.next();
        String number = nr;
        phonebook.searchByNr(number);
    }

    private void addAddress() {
        
        System.out.print("whose address: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        
        
        System.out.print("street: ");
        String street = scanner.nextLine();
        
        System.out.print("city: ");
        String city = scanner.nextLine();

        if(!phonebook.exist(name)){
                    Person person = new Person(name, street, city);
                   
                    phonebook.addAddressAndNewPerson(person);
                }
                
                else{
                    phonebook.addAddressExistingPerson(name, street, city);
                }

       
    }

    private void searchPersonalInformation() {
        scanner.nextLine();
        System.out.print("whose information: ");
        String who = scanner.nextLine();
        
        phonebook.getInformation(who);
    }

    private void deletePersonalInformation() {
        scanner.nextLine();
        System.out.print("whose information: ");
        String name = scanner.nextLine();
        phonebook.deletePersonal(name);
        
    }

    private void filterListing() {
        scanner.nextLine();
        System.out.print("keyword (if empty, all listed): ");
        String searchTerm = scanner.nextLine();
        phonebook.seachByTerm(searchTerm);
    }
        
    }
    
  
    

