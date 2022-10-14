
package com.sg.foundations.flowcontrol.whiles;

/**
 * @author emilytracey
 * date = 14/10/2022
 * purpose = practising whiles
 */

public class WaitAWhile {
    
    public static void main(String[] args) {

        int timeNow = 5;
        int bedTime = 10;

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
}

// if bedTime changed to 11 - while loop carrys on until 11 o'clock
// if timeNow < bedTime - Oh. It's 11 o'clock. Guess I should go to bed ... printed
// if timeNow commented out it causes an unending loop as it is never increased
