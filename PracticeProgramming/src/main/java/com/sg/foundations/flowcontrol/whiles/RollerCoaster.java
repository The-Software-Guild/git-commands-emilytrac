
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 * @author emilytracey
 * date = 14/10/2022
 * purpose = experimenting with while loop
 */

public class RollerCoaster {

        public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("We're going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off...!");

        // String keepRiding = "y";
        String keepRiding = "n";
        int loopsLooped = 0;
        while (keepRiding.equals("n")) {
            System.out.println("WHEEEEEEEEEEEEEeEeEEEEeEeeee.....!!!");
            System.out.print("Want to keep going? (y/n) :");
            keepRiding = userInput.nextLine();
            loopsLooped++;
        }

        System.out.println("Wow, that was FUN!");
        System.out.println("We looped that loop " + loopsLooped + " times!!");
    }
}

// if you put a value other than y/n it breaks out of while loop and gives same as 'n'
// changing loop condition to "n" means that it will continue on "n" break on "y"
