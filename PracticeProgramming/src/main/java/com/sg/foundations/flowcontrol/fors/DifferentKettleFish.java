
package com.sg.foundations.flowcontrol.fors;

/**
 * @author emilytracey
 * date = 18/10/2022
 * purpose = reviewing fors/whiles
 */

public class DifferentKettleFish {

    public static void main(String[] args) {
        
        // switching a while loop to a for loop

        for (int i = 1; i <= 10; i++) {
            if(i == 3){
                System.out.println("RED fish!");
            }else if(i == 4){
                System.out.println("BLUE fish!");
            } else{
                System.out.println(i + " fish!");
            }
        }

    }
}
