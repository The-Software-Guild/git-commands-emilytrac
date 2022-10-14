
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 * @author emilytracey
 * date = 14/10/2022
 * purpose = practising random
 */

public class ALittleChaos {

    public static void main(String[] args) {

        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        int num = randomizer.nextInt(100);

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.print(randomizer.nextInt(51) + 50 + ", "); // will still print from 0-100
        System.out.print(randomizer.nextInt(51) + 50 + ", ");
        System.out.print(randomizer.nextInt(51) + 50 + ", ");
        System.out.print(randomizer.nextInt(51) + 50 + ", ");
        System.out.print(randomizer.nextInt(51) + 50 + ", ");
        System.out.println(randomizer.nextInt(51) + 50);
    }
}

// random numbers can be in a math statement if initialised as varibles of suitable type