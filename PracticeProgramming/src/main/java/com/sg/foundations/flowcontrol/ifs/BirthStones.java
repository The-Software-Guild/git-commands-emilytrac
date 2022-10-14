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

        switch (intMonth) {
            case 1:
                System.out.println("Your birth month is January and your birthstone is Garnet");
                break;
            case 2:
                System.out.println("Your birth month is February and your birthstone is Amethyst");
                break;
            case 3:
                System.out.println("Your birth month is March and your birthstone is Aquamarine");
                break;
            case 4:
                System.out.println("Your birth month is April and your birthstone is Diamond");
                break;
            case 5:
                System.out.println("Your birth month is May and your birthstone is Emerald");
                break;
            case 6:
                System.out.println("Your birth month is June and your birthstone is Pearl");
                break;
            case 7:
                System.out.println("Your birth month is July and your birthstone is Ruby");
                break;
            case 8:
                System.out.println("Your birth month is August and your birthstone is Peridot");
                break;
            case 9:
                System.out.println("Your birth month is September and your birthstone is Sapphire");
                break;
            case 10:
                System.out.println("Your birth month is October and your birthstone is Opal");
                break;
            case 11:
                System.out.println("Your birth month is November and your birthstone is Topaz");
                break;
            case 12:
                System.out.println("Your birth month is December and your birthstone is Turquoise");
                break;
            default:
                System.out.println("Sorry month not found :(");
                break;
        }
    }    
}