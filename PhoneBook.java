/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package LinkedList_PhoneBook;
//import java.util.*;
public class PhoneBook {
    
    static DoubleLinkedList<Contact> contactList = new DoubleLinkedList<Contact>();
    static DoubleLinkedList<Event> eventList = new DoubleLinkedList<Event>();

    public static void main(String[]args){
        
    }
        public static<T> void AddContact(Contact C){
          if (contactList.isEmpty())  
              contactList.insert(C);
          contactList.findFirst();
          while(contactList.retrieve()!=null && !contactList.retrieve().getphone().equals(C.getPhonenumber()) )
          {
              if(contactList.retrieve().compareTo(C)<0) {
                  contactList.insert(C);
              }
              else if (contactList.retrieve().compareTo(C)>0){
                  Contact contactToBeAfterC=contactList.retrieve();
                  contactList.update(C);
                  contactList.insert(contactToBeAfterC);
              }
              
              else if (contactList.retrieve().copareTo(C)==0){
                  System.out.println("the contact is exist");
                  return;
              } contactList.findNext();
          }
          if(contactList.retrieve().getphone().equals(C.getPhonenumber())
                  {
              
              System.out.println("the contact is exist");
        }       
              }
        
              
             public void deleteContact(String S ) {
                 if (contactList.isEmpty()){
                     System.out.println("Empty List");
                     return;
                 }
                 contactList.findFirst();
                 while(!contactList.last())
                 {
                     if(contactList.retrieve().getcontactName().equals(S)){
                         contactList.remove();
                         System.out.println(S+"contact is deleted");
                         return
                         }
                     contactList.findNext();
                 }
                 if(contactList.retrieve().getcontactName().equals(S)){
                         
                         contactList.remove();
                 System.out.println(S+"contact is deleted");
             }
             else
             System.out.println("the contact is not deleted");
}

                     
 
                 

             
                 
                 
                 
                 
                 
                 
                 
                 
              
              
              
          
                  
                      
                      
                      
                      
                      
                      
                      
                      
                      
                      
                      
                      
                      
                     
            
            
            
            
            
            
            
        
        
        
        
        
        
        
    

