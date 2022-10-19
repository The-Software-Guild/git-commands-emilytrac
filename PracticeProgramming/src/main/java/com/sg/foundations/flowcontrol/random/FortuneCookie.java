
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 * @author emilytracey
 * date = 19/10/2022
 * purpose = revising random
 */

public class FortuneCookie {

    public static void main(String[] args) {
        
        Random randomizer = new Random();
        int x = randomizer.nextInt(10);

        System.out.print("Your Geek Fortune: ");

        switch (x) {
            case 0:
                System.out.print("Those aren't the droids you're looking for.");
                break;
            case 1:
                System.out.print("Never go in against a Sicilian when death is on the line!" );
                break;
            case 2:
                System.out.print( "Goonies never say die." );
                break;
            case 3:
                System.out.print("With great power, there must also come — great responsibility.");
                break;
            case 4:
                System.out.print("Never argue with the data.");
                break;
            case 5:
                System.out.print("Try not. Do, or do not. There is no try.");
                break;
            case 6:
                System.out.print("You are a leaf on the wind, watch how you soar.");
                break;
            case 7:
                System.out.print("Do absolutely nothing, and it will be everything that you thought it could be.");
                break;
            case 8:
                System.out.print("Kneel before Zod." );
                break;
            case 9:
                System.out.print("Make it so.");
                break;                
          
        }
    }
}
