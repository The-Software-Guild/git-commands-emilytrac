/*
 *@author emilytracey
 *date = 12/10/2022
 *purpose = practice ifs
 */

package com.sg.foundations.flowcontrol.ifs;

public class SpaceRustlers {
    
    public static void main(String[] args) {
        
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;
        
        if (aliens > spaceships) {
            System.out.println("Vroom, vroom! Let's get going!");
        } else {
            System.out.println("There aren't enough green guys to dirve these ships!");
        }
        
        if (cows == spaceships) {
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers");
        } else if (cows > spaceships) {
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        } else {
            System.out.println("Too many ships! Not enough cows.");
        }
        
        if (aliens > cows) {
            System.out.println("Hurrah, we've got the grub!");
        } else {
            System.out.println("Oh no! The herds took over!");
        }
    }
}

/* else if will allow the code to stop running through if a condition is met -
ideal if there is only one possible answer.
If do means that a condition needs to be met before the 'do' can happen.
If you remove the else from else if it becomes a standard if statement and 
the code will execute if the conditions are met.
*/