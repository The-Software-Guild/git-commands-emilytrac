
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 * @author emilytracey
 * date = 14/10/2022
 * purpose = program simulating a lazy teenager
 */

public class LazyTeenager {

    public static void main(String[] args) {
        
        Random randomGenerator = new Random();
        int chanceOfCleaning = randomGenerator.nextInt(101);
        int timesAsked = 0;
        
        // if chance of cleaning >80% it will break or if asked 7 times
        
        do {
            System.out.println("Clean your room!!");
            timesAsked++;
            if (chanceOfCleaning > 80) {
             System.out.println("FINE! I'LL CLEAN MY ROOM");
             break;
            } 
        } while (timesAsked <=7);
    
        if (timesAsked > 7) {
            System.out.println("That's IT, YOU'RE GROUNDED AND I'M TAKING YOUR XBOX");
        }   
    }
}
