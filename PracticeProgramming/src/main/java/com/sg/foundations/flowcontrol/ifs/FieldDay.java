
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 * @author emilytracey
 * date = 19/10/2022
 * purpose = ifs revision; compareTo() function
 */

public class FieldDay {

    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("What's your last name? ");
        String lastName = inputScanner.nextLine();
        
        if (comesBefore(lastName, "Baggins")) {
            System.out.println("Your team is Red Dragons");
        } else if (comesBefore(lastName, "Dresdon")) {
            System.out.println("Your team is Dark Wizards");
        } else if (comesBefore(lastName, "Howl")) {
            System.out.println("Your team is Moving Castles");
        } else if (comesBefore(lastName, "Potter")) {
            System.out.println("Your team is Golden Snitches");
        } else if (comesBefore(lastName, "Vimes")) {
            System.out.println("Your team is Night Guard");
        } else {
            System.out.println("Black Holes");
        }
        
        System.out.println("Good luck in the games!");
    }
    

    public static boolean comesBefore(String a, String b){
        return a.compareToIgnoreCase(b) < 0;
    }
}