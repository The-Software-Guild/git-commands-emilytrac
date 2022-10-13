
package com.sg.foundations.flowcontrol.arrays;

/**
 * @author emilytracey
 * date = 13/10/2022
 * purpose = finding where a squirrel has hidden its nut
 */

import java.util.Random;

public class HiddenNuts {

    public static void main(String[] args) {

        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");

        // Using a for loop to iterate through hiding spots and find matching index
        
        for (int i = 0; i < hidingSpots.length; i++) {
            if ("Nut".equals(hidingSpots[i])) {
                System.out.println("Found it! It's in spot # " + i);
                break;
            } else {
                System.out.println("Keep looking!");
            }
        }
    }
}