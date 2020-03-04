/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
         Car c;
         
         int year, price,tables,speaker;
         String modle,make;
         Boolean speakers, table;
         
         
         int choice = Integer.parseInt(JOptionPane.showInputDialog("Choose from the list: \n" + 
                 "1. Get the defult car \n2. Custom car \n3. Random Hondla Civics"));
         
         if(choice == 1){
            year = 1977;
            price = 5000000;
            modle = "Impulla";
            make = "Chirstler";
            speakers = true;
            table = true;
         }
         else if (choice == 2){
            year = Integer.parseInt(JOptionPane.showInputDialog("Enter the year you would like"));
            price = (int) (Math.random() * 100000 + 500);
            modle = JOptionPane.showInputDialog("What is the modle of the car");
            make = JOptionPane.showInputDialog("What is the make of the car");
            speaker = Integer.parseInt(JOptionPane.showInputDialog("Would you like a stereo?" +
                    "1. Yes \n2. No"));
            tables = Integer.parseInt(JOptionPane.showInputDialog("Would you like a solid oak table?" +
                    "1. Yes \n2. No"));
            
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
            
         }
         else if(choice == 3){
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
             System.out.println(year + " "+ price + " " + modle + " " + make  + " " + speakers + " " + table);
         }
         
         
         
    }
    
}
