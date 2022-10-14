
package com.et.luckysevens;

import java.util.Scanner;
import java.util.Random;

/**
 * @author emilytracey
 * date = 14/10/2022
 * purpose = playing lucky sevens
 */

public class LuckySevens {

    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        
        // find out how many dollars
        
        System.out.println("How many dollars do you have to bet? ");
        String dollarIn = inputScanner.nextLine();
        int dollarToBet = Integer.parseInt(dollarIn);
        
        // set up some variables
        
        int rollsTaken = 0;
        int maxMoney = dollarToBet;
        int rollsAtMax = 0;
        
        // initiate game loop
        
        while (dollarToBet > 0) {
            
            // random number between 1 and 6 to simulate dice roll
            
            int result1 = randomGenerator.nextInt(7);
            int result2 = randomGenerator.nextInt(7);
            
            if (result1 + result2 == 7) {
                int moneyWon = 4;
                dollarToBet += moneyWon;
                rollsTaken ++;
                if (moneyWon + maxMoney >= maxMoney) {
                    maxMoney += moneyWon;
                    rollsAtMax = rollsTaken;
                }
            } else {
                int moneyLost = 1;
                dollarToBet -= moneyLost;
                rollsTaken ++;
            }
        }
        System.out.println("You were broke after: " + rollsTaken + " rolls");
        System.out.println("You should have quit after " + rollsAtMax + " when you had $" + maxMoney);
    }
}
