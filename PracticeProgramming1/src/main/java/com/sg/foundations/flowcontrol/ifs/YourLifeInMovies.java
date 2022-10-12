/*
 *@author emilytracey
 *date = 12/10/2022
 *purpose = practice ifs
 */

package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class YourLifeInMovies {

    public static void main(String[] args) {

        Scanner ageScanner = new Scanner(System.in);
        
        // finding the year born

        System.out.println("Hey, let's play a game! What year were you born? ");
        String yearBorn = ageScanner.nextLine();
        int intYear = Integer.parseInt(yearBorn);

        if (intYear < 2005) {
            System.out.println("Pixar's 'Up' came out a decade ago!");
        } if (intYear < 1995) {
            System.out.println("The first Harry Potter came out over 15 years ago!");
        } if (intYear < 1985) {
            System.out.println("Space Jam came out not last decade, but the one before THAT!");
        } if (intYear < 1975) {
            System.out.println("The original Jurassic Park is closer to the first lunar landing than it is to today");
        } if (intYear < 1965) {
            System.out.println("The MASH TV series has been around for almost half a century");
        }

        System.out.println("Thanks for playing!");
    }

}