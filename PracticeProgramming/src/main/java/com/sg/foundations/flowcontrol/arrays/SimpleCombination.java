
package com.sg.foundations.flowcontrol.arrays;

import java.util.Arrays;

/**
 * @author emilytracey
 * date = 13/10/2022
 * purpose = Combining two arrays
 */

public class SimpleCombination {

        public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49}; // 12 numbers
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100}; // also 12!

        int firstLen = firstHalf.length;
        int secondLen = secondHalf.length;
        
        int[] wholeNumbers = new int[firstLen + secondLen];

        // Using imported Arrays funtion
        
        System.arraycopy(firstHalf, 0, wholeNumbers, 0, firstLen);
        System.arraycopy(secondHalf, 0, wholeNumbers, firstLen, secondLen);

        // Printing new code using .toString() array method
        
        System.out.println("All together now!: ");
        System.out.println(Arrays.toString(wholeNumbers));
    }
}
