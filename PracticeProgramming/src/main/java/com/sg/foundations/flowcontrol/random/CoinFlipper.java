
package com.sg.foundations.flowcontrol.random;

/**
 * @author emilytracey
 * date = 14/10/2022
 * purpose = simulating a coin toss
 */

import java.util.Random;

public class CoinFlipper {

    public static void main(String[] args) {
        
        System.out.println("Ready, Set, Flip....!!");
        
        Random randomGenerator = new Random();
        Boolean choiceMaker = randomGenerator.nextBoolean();
        
        if (choiceMaker == true) {
            System.out.println("You got TAILS!");
        } else if (choiceMaker == false) {
            System.out.println("You got HEADS!");
        }
        
    }
}
