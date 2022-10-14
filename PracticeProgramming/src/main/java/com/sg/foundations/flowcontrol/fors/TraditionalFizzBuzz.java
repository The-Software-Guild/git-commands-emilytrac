
package com.sg.foundations.flowcontrol.fors;

/**
 * @author emilytracey
 * date = 13/10/2022
 * purpose = FizzBuzz game
 */

import java.util.Scanner;

public class TraditionalFizzBuzz {

    public static void main(String[] args) {
        
        Scanner myNumber = new Scanner(System.in);
        
        System.out.println("What number would you like to play with today? ");
        
        String number = myNumber.nextLine();
        int fbNumber = Integer.parseInt(number);
        
        for (int i = 1; i <= fbNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) { 
                System.out.println("fizzbuzz"); // divisible by 3 and 5
            } else if (i % 3 == 0) {
                System.out.println("fizz"); // divisible by 3
            } else if (i % 5 == 0) {
                System.out.println("buzz"); // divisible by 5
            } else {
                System.out.println(i); // not divisible by either
            }
        }
        System.out.println("TRADITION!!!");
    }
}
