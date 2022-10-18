
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 * @author emilytracey
 * date = 18/10/2022
 * purpose = reviewing different inputs for same output
 */

public class TwoForsAndTenYearsAgo {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("What year would you like to count back from? ");
        int year = userInput.nextInt();
        
        // range for both is 10
        // first one seems more intuitive as no negatives

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " years ago would be " + (year - i));
        }

        System.out.println("\nI can count backwards using a different way too...");
        
        // change from -10 to -20 so counts back 20 years

        for (int i = year; i >= year - 20; i--) {
            System.out.println( (year - i) + " years ago would be " + i);
        }
    }
}
