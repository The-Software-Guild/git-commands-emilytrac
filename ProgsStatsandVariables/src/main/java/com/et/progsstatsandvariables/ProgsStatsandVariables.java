/*
 *@author emilytracey
 *date = 11/10/2022
 *purpose = operation practice
 */
package com.et.progsstatsandvariables;

public class ProgsStatsandVariables {
    
    public static void main(String[] args) {
        
        // declaring
        
        int result;
        int operand1;
        int operand2;
        int operand3;
        
        // initialising
        
        result = 0;
        
        operand1 = 5;
        operand2 = 7;
        operand3 = operand2;
        
        // addition
        
        result = 42 + 53;
        result = operand1 + operand2; 
        result = 1 + operand1;
        result = 1 + operand1 + operand2 + operand3;
        
        System.out.println(result);
        
        // result += operand1 is equivalent to result = result + operand1.
        
        result = 2;
        result += 4; // result is 6 or 11:
        result += operand1;
        
        System.out.println(result);
        
        // subtraction
        
        result = 9 - 5;
        result = operand1 - operand2;
        result = 15 - operand1;
        result = 19 - operand1 - operand2 - operand3;
        
        System.out.println(result);
        
        // result -= operand1 is equivalent to result = result - operand1.
        
        result = 2;
        result -= 4; // result is -2
        result -= operand1;
        
        System.out.println(result);
        
        // multiplication
        
        result = 2 * 3; 
        result = operand1 * operand2; 
        result = 2 * operand1; 
        result = 2 * operand1 * operand2 * operand3;
        
        System.out.println(result);

        // result *= operand1 is equivalent to result = result * operand1.
      
        result = 2; 
        result *= 4;  // result is now equal to 8 (2 * 4)
        result *= operand1;

        System.out.println(result);
        
        // Division and Modulus
        
        result = 6 / 3;
        result = operand1 / operand2; 
        result = 245 / operand1 / operand2 / operand3;
        
        System.out.println(result);

        // modulus operator (%) to get the remainder:
        
        result = operand1 % operand2;  // result now equals 5
        
        System.out.println(result);

        // result /= operand1 is equivalent to result = result / operand1.
        
        result = 40;
        result /= 4;  // result is now equal to 10 (40 / 4)
        result /= operand1;
        
        System.out.println(result);
    }
}

