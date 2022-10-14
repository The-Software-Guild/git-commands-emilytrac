
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 * @author emilytracey
 * date = 14/10/2022
 * purpose = practising with do-while loops
 */

public class DoOrDoNot {

        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Should I do it? (y/n) ");
        boolean doIt;

        if (input.next().equals("y")) {
            doIt = true; // DO IT!
        } else {
            doIt = false; // DONT YOU DARE!
        }

        boolean iDidIt = false;

        /* do {
            iDidIt = true;
            break;
        } while (doIt); */
        
        while (doIt) {
            iDidIt = true;
        }

        if (doIt && iDidIt) {
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not to ... but I totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anything!");
        } 
    }
}

// prints out "I did it' if you tell it to do it
// prints out "I know you said not to... but I totally did anyways"
// by using the while loop it won't be possible to access the second if statement
// as the while loop will not execute
