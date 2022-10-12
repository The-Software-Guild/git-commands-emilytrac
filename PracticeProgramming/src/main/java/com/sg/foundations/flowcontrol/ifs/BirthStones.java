/*
 *@author emilytracey
 *date = 12/10/2022
 *purpose = practice ifs
 */

package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class BirthStones {
    
    public static void main(String[] args) {
        
        Scanner monthScanner = new Scanner(System.in);
        
        System.out.println("Hey, what month were you born in? Number please! ");
        
        String monthBorn = monthScanner.nextLine();
        int intMonth = Integer.parseInt(monthBorn);
        
        if (intMonth == 1) {
            System.out.println("Your birth month is January and your birthstone is Garnet");
        } else if (intMonth == 2) {
            System.out.println("Your birth month is February and your birthstone is Amethyst");
        } else if (intMonth == 3) {
            System.out.println("Your birth month is March and your birthstone is Aquamarine");
        } else if (intMonth == 4) {
            System.out.println("Your birth month is April and your birthstone is Diamond");
        } else if (intMonth == 5) {
            System.out.println("Your birth month is May and your birthstone is Emerald");
        } else if (intMonth == 6) {
            System.out.println("Your birth month is June and your birthstone is Pearl");
        } else if (intMonth == 7) {
            System.out.println("Your birth month is July and your birthstone is Ruby");
        } else if (intMonth == 8) {
            System.out.println("Your birth month is August and your birthstone is Peridot");
        } else if (intMonth == 9) {
            System.out.println("Your birth month is September and your birthstone is Sapphire");
        } else if (intMonth == 10) {
            System.out.println("Your birth month is October and your birthstone is Opal");
        } else if (intMonth == 11) {
            System.out.println("Your birth month is November and your birthstone is Topaz");
        } else if (intMonth == 12) {
            System.out.println("Your birth month is December and your birthstone is Turquoise");
        } else {
            System.out.println("Sorry month not found :(");
        }
    }    
}
