/*
 *@author emilytracey
 *date = 12/10/2022
 *purpose = practice ifs
 */

package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class GuessMe {

    public static void main(String[] args) {

        int myNumber = 8;

        System.out.println("I've chosen a number. Betcha can't guess it!");

        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Your guess: ");
        String guessedNumber = myScanner.nextLine();
        
        // string to int
        
        int guess = Integer.parseInt(guessedNumber);

        if (guess == myNumber) {
            System.out.println("Wow, nice guess! That was it!");
        } else if (guess < myNumber) {
            System.out.println("Ha, nice try - too low! I chose 8");
        } else {
            System.out.println("Too bad, way too high. I chose 8");
        }

    }
}