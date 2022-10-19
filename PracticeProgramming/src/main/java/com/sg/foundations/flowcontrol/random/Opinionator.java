
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 * @author emilytracey
 * date = 19/10/2022
 * purpose = revising random and finding bug
 */

public class Opinionator {

    public static void main(String[] args) {
        
        Random randomizer = new Random();
        System.out.println("I can't decide what animal I like the best.");
        System.out.println("I know! Random can decide FOR ME!");
        
        // bound 5 will only give 0-4 as options as exclusive of bound
        // change bound from 5 to 6

        int x = randomizer.nextInt(6);

        System.out.println("The number we chose was: " + x);

        switch (x) {
            case 0:
                System.out.println("Llamas are the best!");
                break;
            case 1:
                System.out.println("Dodos are the best!");
                break;
            case 2:
                System.out.println("Woolly mammoths are DEFINITELY the best!");
                break;
            case 3:
                System.out.println("Sharks are the greatest, they have their own week!");
                break;
            case 4:
                System.out.println("Cockatoos are just so awesomme!");
                break;
            case 5:
                System.out.println("Have you ever met a naked mole-rat? They're GREAT!");
                break;
        }

        System.out.println("Thanks Random, maybe YOU'RE the best!");
    }
}
