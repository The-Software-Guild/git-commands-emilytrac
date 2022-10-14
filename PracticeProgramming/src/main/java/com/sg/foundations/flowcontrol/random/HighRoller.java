
package com.sg.foundations.flowcontrol.random;

/**
 * @author emilytracey
 * date = 14/10/2022
 * purpose = simulating rolling a dice
 */

import java.util.Random;
import java.util.Scanner;

public class HighRoller {
    
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Random diceRoller = new Random();
        
        System.out.println("How many sides does a single die have? ");
        String sidesDie = userInput.nextLine();
        int sides = Integer.parseInt(sidesDie);
        int rollResult = diceRoller.nextInt(sides) + 1;

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure! Ouch.");
        } else if (rollResult == 6) {
            System.out.println("You rolled a critical! Nice job!");
        } else {
            System.out.println("Thanks for playing!");
        }
    }
}

