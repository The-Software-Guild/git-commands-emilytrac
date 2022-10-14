
package com.sg.foundations.flowcontrol.random;

import java.util.Scanner;
import java.util.Random;

/**
 * @author emilytracey
 * date = 14/10/2022
 * purpose = improving guess me
 */

public class GuessMeMore {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);
        
        // getting number in range -100 - 100 and converting to int
        
        Random randomGenerator = new Random();
        double randomNumber = randomGenerator.nextDouble() * (100 - - 100) + - 100;
        int myNumber = (int)randomNumber;

        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!" 
                + " You have two tries!");
        int guesses = 0;
        
        // adding two guesses

        while (guesses < 2) {
            
            System.out.println("Your guess: ");
            String guessedNumber = myScanner.nextLine();
            int guess = Integer.parseInt(guessedNumber);

            if (guess == myNumber) {
                System.out.println("Wow, nice guess! That was it!");
                break;
            } else if (guess < myNumber) {
                System.out.println("Ha, nice try - too low!");
                guesses ++;
            } else {
                System.out.println("Too bad, way too high!");
                guesses ++;
            }
        }    
    }
}
