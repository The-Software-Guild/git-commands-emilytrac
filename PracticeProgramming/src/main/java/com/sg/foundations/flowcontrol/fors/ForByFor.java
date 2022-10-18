
package com.sg.foundations.flowcontrol.fors;

/**
 * @author emilytracey
 * date = 18/10/2022
 * purpose = reviewing nested fors to print a pattern
 */

public class ForByFor {
    
    public static void main(String[] args) {

        for (int i = 0; i < 1; i++) {
            System.out.print("|");

            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("*");
                } System.out.print("|");
                for (int a = 0; a < 3; a ++) {
                    System.out.print("$");
                } System.out.print("|");
                for (int k = 0; k < 3; k++) {
                    System.out.print("*");
                }
                System.out.print("|");
                }
            System.out.println("");
        }
        for (int i = 0; i < 1; i++) {
            System.out.print("|");

            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("@");
                } System.out.print("|");
                for (int a = 0; a < 3; a ++) {
                    System.out.print("#");
                } System.out.print("|");
                for (int k = 0; k < 3; k++) {
                    System.out.print("@");
                }
                System.out.print("|");
                }
            System.out.println("");
        }
        for (int i = 0; i < 1; i++) {
            System.out.print("|");

            for (int j = 0; j < 1; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("*");
                } System.out.print("|");
                for (int a = 0; a < 3; a ++) {
                    System.out.print("$");
                } System.out.print("|");
                for (int k = 0; k < 3; k++) {
                    System.out.print("*");
                }
                System.out.print("|");
                }
            System.out.println("");
        }
    }

}
