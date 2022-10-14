
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;
import java.util.Random;

/**
 * @author emilytracey
 * date = 14/10/2022
 * purpose = practising the break command
 */

public class BewareTheKraken {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        Random randomGenerator = new Random();
        
        String[] fish = {"cod", "salmon", "shark"};
        
        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;
        
        while(depthDivedInFt < 36200){
            
            // adding random fish printout
            
            int fishPicker = randomGenerator.nextInt(3);
            String randomFish = fish[fishPicker];
            
            System.out.println("So far, we've swum " + depthDivedInFt + " feet");
            System.out.println("I see a " + randomFish + "!");

            if(depthDivedInFt >= 20000){
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;
            }
            
            // new break command to ask if the user wants to stop
            
            System.out.println("Do you want to stop? (y/n)");
            String wantOut = userInput.nextLine();
            if (wantOut.equals("y")) {
                System.out.println("We're heading to the surface");
                break;
            }

            // I can swim, really fast! 500ft at a time!
            depthDivedInFt += 1000;
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
}

// if you change the loop condition to just equal tru it will be an endless loop