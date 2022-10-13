
package com.sg.foundations.flowcontrol.methods;

/**
 * @author emilytracey
 * date = 13/10/2022
 * purpose = Completing a program with methods
 */

import java.util.Random;

public class BarelyControlledChaos {

    public static void main(String[] args) {

        String color = randomColor(); 
        String animal = randomAnimal(); 
        String colorAgain = randomColor(); 
        int weight = randomNum(5, 200); 
        int distance = randomNum(10, 20); 
        int number = randomNum(10000, 20000); 
        int time = randomNum(2, 6);            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    public static String randomColor() {
        
        Random randomiser = new Random();
        int i = randomiser.nextInt(4);
        switch (i) {
            case 0:
                return "pink";
            case 1:
                return "purple";
            case 2:
                return "blue";
            case 3:
                return "green";
            case 4:
                return "red";
            default:
                break;
        }
        return null;
    }
    
    public static String randomAnimal() {
        
        Random randomiser = new Random();
        int j = randomiser.nextInt(4);
        switch (j) {
            case 0:
                return "pig";
            case 1:
                return "cow";
            case 2:
                return "donkey";
            case 3:
                return "goat";
            case 4:
                return "sheep";
            default:
                break;
        }
        return null;
    }
    
    public static int randomNum(int i, int j) {
        
        Random numRandomiser = new Random();
        int min = i;
        int max = j;
        
        int randomNumber = numRandomiser.nextInt((max-min) + min + 1);
        return randomNumber;
    }
      
}
