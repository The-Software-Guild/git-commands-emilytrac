/*
 *@author emilytracey
 *date = 18/10/2022
 *purpose = window master refactor with methods
 */

package com.et.windowmaster;

import java.util.Scanner;

public class WindowMaster {
    
    public static void main(String [] args) {
        
        float height = readValue("Please enter window height: ");
        float width = readValue("Please enter window width: ");
        float glass = readValue("Please enter glass cost: ");
        float trim = readValue("Please enter trim cost: ");
        int windows = readValueTwo("Please enter the number of windows: ");
        
        float areaOfWindow = height * width;
        float perimeterOfWindow = 2 * (height + width);
        float cost = ((glass * areaOfWindow) + (trim * perimeterOfWindow)) * windows;
        
        System.out.println("Window height = " + height);
        System.out.println("Window width = " + width);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = £" + cost);
    }
    
    public static float readValue(String prompt) {
        
        Scanner inputScanner = new Scanner(System.in);
        System.out.println(prompt);
        String input = inputScanner.nextLine();
        float floatInput = Float.parseFloat(input);
        return floatInput;
    }
    
    public static int readValueTwo(String prompt) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println(prompt);
        String input = inputScanner.nextLine();
        int intInput = Integer.parseInt(input);
        return intInput;
    }
}