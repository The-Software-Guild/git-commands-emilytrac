
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;
import java.util.Random;

/**
 * @author emilytracey
 * date = 14/10/2022
 * purpose = improving guess me more
 */

public class GuessMeFinally {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        // getting number in range -100 - 100 and converting to int
        
        Random randomGenerator = new Random();
        double randomNumber = randomGenerator.nextDouble() * (100 - - 100) + - 100;
        int myNumber = (int)randomNumber;
        // System.out.println(myNumber); for testing

        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!" 
                + " You have two tries!");
        int guesses = 0;
        
        // unlimited guesses

        while (true) {
            
            System.out.println("Your guess: ");
            String guessedNumber = myScanner.nextLine();
            int guess = Integer.parseInt(guessedNumber);

            // break loop to go to if conditional at end if correct number
       
            if (guess == myNumber) {
                break;
            } else if (guess < myNumber) {
                System.out.println("Ha, nice try - too low!");
                guesses ++;
            } else {
                System.out.println("Too bad, way too high!");
                guesses ++;
            }
        }   
        
        if (guesses == 0) {
            System.out.println("Wow, nice guess! That was it!");
        } else {
            System.out.println("Finally! it's about time you got it!");
        }
    }
}
