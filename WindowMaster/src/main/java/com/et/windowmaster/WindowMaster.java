/*
 *@author emilytracey
 *date = 12/10/2022
 *purpose = window master code along
 */

package com.et.windowmaster;

import java.util.Scanner;

public class WindowMaster {
    
    public static void main(String [] args) {
        
        float height;
        float width;
        
        String stringHeight;
        String stringWidth;
        
        float glass;
        float trim;
        
        String costOfGlass;
        String costOfTrim;
        
        float areaOfWindow;
        float perimeterOfWindow;
        
        int windows;
        
        String numWindows;
        
        float cost;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Please enter window height: ");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width: ");
        stringWidth = myScanner.nextLine();
        System.out.println("Please enter glass cost: ");
        costOfGlass = myScanner.nextLine();
        System.out.println("Please enter trim cost: ");
        costOfTrim = myScanner.nextLine();
        System.out.println("Please enter the number of windows: ");
        numWindows = myScanner.nextLine();
       
        
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        glass = Float.parseFloat(costOfGlass);
        trim = Float.parseFloat(costOfTrim);
        windows = Integer.parseInt(numWindows);
        
        areaOfWindow = height * width;
        perimeterOfWindow = 2 * (height + width);
        
        cost = ((glass * areaOfWindow) + (trim * perimeterOfWindow)) * windows;
        
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + cost);
    }
}