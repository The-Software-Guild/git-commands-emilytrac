
package com.et.interestcalculator;

import java.util.Scanner;

/**
 * @author emilytracey
 * date = 14/10/2022
 * purpose = create an interest calculator
 */

// change so that user can choose compound frequency

public class InterestCalculator {

    public static void main(String[] args) {
        
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.println("How much do you want to invest? ");
        double moneyIn = inputScanner.nextDouble();
        
        System.out.println("How many years are you investing for? ");
        int yearsIn = inputScanner.nextInt();

        System.out.println("What is the annual interest rate % growth? ");
        double accountGrowth = inputScanner.nextDouble();
        
        System.out.println("Calculating...");
        
        compoundInterestCalc(moneyIn, yearsIn, accountGrowth, 4);
        
        }
    
    // using compound interest formula; easily editable 
    // can change to compound monthly by changing compound to 1
        
    public static void compoundInterestCalc(double principal, int years, double interest, int compound) {
        for (int i = 1; i <= years; i++) {
            
            double amount = Math.floor((principal * (Math.pow(1 + (interest/compound), compound * 1))) 
                    * 100) / 100;
            double cInterest = Math.floor((amount - principal) * 100) / 100;
            
            System.out.println("Year " + i + ": ");
            System.out.println("Began with $" + Math.floor((principal) * 100 / 100));
            System.out.println("Earned $" + cInterest);
            System.out.println("Ended with $" + amount);  
            System.out.println("");
            
            principal += cInterest;
        }  
    }
}   

