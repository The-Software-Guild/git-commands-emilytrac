
package com.sg.foundations.flowcontrol.arrays;

import java.util.Arrays;

/**
 * @author emilytracey
 * date = 16/10/2022
 * purpose = practising swaps
 */

public class SwapTemps {
    
    public static void main(String[] args) {
        
        int[] temps = {2, 8, 5, 18, 12};
        int holder;
        
        // introduce boolean to break out of loop if no swaps made

        boolean sorted = false;
                
        while (!sorted) {
            for (int i = 1; i < temps.length; i++) {
                for (int j = 0; j < temps.length - 1; j++) {
                    if (temps[j] > temps[j+1]) {
                        holder = temps[j];
                        temps[j] = temps [j+1];
                        temps[j+1] = holder;
                        System.out.println(Arrays.toString(temps));
                        sorted = false;                                
                    } else {
                        sorted = true;
                    }
                }
            }          
        }   
        System.out.println(Arrays.toString(temps));
    }
}
