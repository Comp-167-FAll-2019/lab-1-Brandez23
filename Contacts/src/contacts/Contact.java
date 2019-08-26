/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

/**
 *
 * @author CCannon
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    String getfirstName;
    String getlastName;
    
    public Contact(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    
    @Override //Needed to add override annotation
    public String toString(){
        return firstName + " " + lastName +  " " + phoneNumber + " " + emailAddress; //Didn't contain another "+"
    }

    String getfirstName() { //The method getfirstName didnt't exist 
        return firstName;
    }
    
    String getlastName(){ //The method getfirstName didnt't exist 
    return lastName;
    
}
}
