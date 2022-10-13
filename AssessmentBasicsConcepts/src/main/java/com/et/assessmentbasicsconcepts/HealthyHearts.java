
package com.et.assessmentbasicsconcepts;

/**
 * @author emilytracey
 * date = 13/10/2022
 * purpose = calculating the healthy heart range
 */

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        
        // initialising and using Scanner to get age input
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("What is your age? ");
        String personAge = userInput.nextLine();
        int intAge = Integer.parseInt(personAge);
        
        // using simple integer expressions to assign variables
        
        int heartRate = 220 - intAge;
        int lowerMax = heartRate * 55 / 100;
        int upperMax = heartRate * 85 / 100;
        
        System.out.println("Your maximum heart rate should be " 
                + heartRate 
                + " beats per minute.");
        
        System.out.println("Your target HR Zone is " + lowerMax 
                + " - " + upperMax + " beats per minute.");
    }
 }

