
package com.et.assessmentbasicsconcepts;

/**
 * @author emilytracey
 * date = 13/10/2022
 * purpose = generating a fake dog DNA background using while
 */

// required imports for the program

import java.util.Scanner;
import java.util.Random;

public class DogGenetics {
    
    public static void main(String[] args) {
        
        // initialising and using Scanner to get dog name
        
        Scanner userInput = new Scanner(System.in);
        Random randInput = new Random();
        
        System.out.println("What is your dog's name? ");
        String dogName = userInput.nextLine();
        
        System.out.println();
        System.out.println("Well then, I have this highly reliable report on "
                + dogName + "'s prestigious background right here.");
        
        System.out.println();
        System.out.println(dogName + " is: ");
        System.out.println();
        
        
        // using a while loop to find random numbers under 100 that add up to 100
        // using Random import
        
        while (true) {
            int random1 = randInput.nextInt(100) + 1;
            int random2 = randInput.nextInt(100) + 1;
            int random3 = randInput.nextInt(100) + 1;
            int random4 = randInput.nextInt(100) + 1;
            int random5 = randInput.nextInt(100) + 1;
            if (random1 + random2 + random3 + random4 + random5 == 100) {
                System.out.println(random1 + "%" + " St. Bernard" + "\n"
                + random2 + "%" + " Chihuahua" + "\n" 
                + random3 + "%" + " Dramatic Rednosed Asian Pug" + "\n"
                + random4 + "%" + " Common Cur" + "\n"
                + random5 + "%" + " King Doberman" + "\n");
                System.out.println("Wow, that's QUITE the dog!");
                break;
            }
        }
    }
}
