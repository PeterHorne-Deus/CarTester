/*
 * Peter Horne-Deus
 * This program shows car options to a user
 * Palindrome.java
 * March 5, 2020
 */


package cartester;

/**
 *
 * @author pehor9164
 */

import javax.swing.*;
        
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        //Variables and decliration
        Car c; 
        int year, price,tables,speaker;
        String modle,make;
        Boolean speakers, table;

        //Getting user input of how they would like to procced
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Choose from the list: \n" + 
                "1. Get the defult car \n2. Custom car \n3. Random Hondla Civics"));

        //Changing code depending on user input
        if(choice == 1){
           c = new Car();

        }
        //Making the car with the users choice
        else if (choice == 2){
           //Setting all of the car variables based on user input for a custom car
           year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year you would like"));
           price = (int) (Math.random() * 100000 + 500);
           modle = JOptionPane.showInputDialog("What is the modle of the car");
           make = JOptionPane.showInputDialog("What is the make of the car");
           speaker = Integer.parseInt(JOptionPane.showInputDialog("Would you like a stereo?" +
                   "\n1. Yes \n2. No"));
           tables = Integer.parseInt(JOptionPane.showInputDialog("Would you like a solid oak table?" +
                   "\n1. Yes \n2. No"));

           if(speaker == 1){
               speakers = true;
           }
           else{
             speakers = false;  
           }
           if(tables == 1){
               table = true;
           }
           else{
               table = false;
           }
           //Sending input to a method in the Car class
           c = new Car(year,price,modle,make,speakers,table);
        }
        //Making the car with the users input
        else if(choice == 3){
           //Setting random information to a predermined car for the user
           year = (int) (Math.random() * 2010 + 1990);
           price = (int) (Math.random() * 100000 + 500);
           modle = "Civics";
           make = "Hondla";
           speaker = (int) (Math.random() * 2 + 1);
           tables = (int) (Math.random() * 2 + 1);

           if(speaker == 1){
               speakers = true;
           }
           else{
             speakers = false;  
           }
           if(tables == 1){
               table = true;
           }
           else{
               table = false;
           }
           //Sending the car info to the car method in the car class
           c = new Car(year,price,modle,make,speakers,table);
        }
         
         
         
    }
    
}
