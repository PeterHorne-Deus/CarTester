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
public class Car {
    
    //One of the types of the cars that can be made
    public Car(){
        //Variables
        int year = 1977;
        int price = 5000000;
        String modle = "Impulla";
        String make = "Chirstler";
        Boolean speakers = true;
        Boolean table = true;
        
        //Outputing all inputed information for the user
        System.out.println("Year: " + year + "\nPrice: " + price + "\nModel: " 
                + modle + "\nMake: " + make);
        if (speakers == true){
            System.out.println("Speakers: YES");
        }
        else{
            System.out.println("Speakers: NO");
        }
        
        if (table == true){
            System.out.println("Table: YES");
        }
        else{
            System.out.println("Table: NO");
        }
    }
    //Another class for a different car input
    public Car(int year, int price, String model, String make,Boolean speaker,Boolean table){
        //Setting the output of the car from the users info
        System.out.println("Year: " + year + "\nPrice: " + price + "\nModel: " 
                + model + "\nMake: " + make);
        if (speaker == true){
            System.out.println("Speakers: YES");
        }
        else{
            System.out.println("Speakers: NO");
        }
        
        if (table == true){
            System.out.println("Table: YES");
        }
        else{
            System.out.println("Table: NO");
        }
}
}

