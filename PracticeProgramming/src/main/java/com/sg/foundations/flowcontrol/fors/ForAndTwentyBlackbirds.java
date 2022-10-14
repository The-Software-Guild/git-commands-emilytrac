
package com.sg.foundations.flowcontrol.fors;

/**
 * @author emilytracey
 * date = 13/10/2022
 * purpose = Fixing for loop
 */

public class ForAndTwentyBlackbirds {

        public static void main(String[] args) {
        int birdsInPie = 0;
        for (int i = 1; i < 25; i++) {
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }

        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
}

// for statement updated to i = 1; i < 25, so prints Blackbird #1-24