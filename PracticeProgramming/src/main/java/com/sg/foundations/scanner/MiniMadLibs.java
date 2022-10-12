/*
 *@author emilytracey
 *date = 12/10/2022
 *purpose = assigning variables
 */

package com.sg.foundations.scanner;

import java.util.Scanner;

public class MiniMadLibs {
    
    public static void main(String[] args) {
        
        System.out.println("Let's play MAD LIBS!");
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("I need a noun: ");
        String noun = inputReader.nextLine();
        
        System.out.println("Now an adjective: ");
        String adjective = inputReader.nextLine();
        
        System.out.println("Another noun: ");
        String noun2 = inputReader.nextLine();
        
        System.out.println("Add a number: ");
        String number = inputReader.nextLine();
        
        System.out.println("Another adjective: ");
        String adjective2 = inputReader.nextLine();
        
        System.out.println("A plural noun: ");
        String pluralNoun = inputReader.nextLine();
        
        System.out.println("Another one: ");
        String pluralNoun2 = inputReader.nextLine();
        
        System.out.println("One more: ");
        String pluralNoun3 = inputReader.nextLine();
        
        System.out.println("A verb (infinitive form): ");
        String verbPresentTense = inputReader.nextLine();
        
        System.out.println("Same verb (past participle): ");
        String sameVerbPast = inputReader.nextLine();
        
        System.out.println();
        System.out.println("-<_>-" + "NOW LETS GET MAD LIBS" + "-<_>-");
        System.out.println();
        System.out.println(noun + ": the " + adjective + " frontier. " + 
                "These are the voyages of the starship " + noun2 + ". Its " +
                 number + "-year mission: to exlore strange " + adjective2 + " " +
                pluralNoun + ", to seek out red " + pluralNoun2 + " and red " + 
                pluralNoun3 + ", to boldly " + verbPresentTense + " where no one has " +
                sameVerbPast + " before.");
        
    }
}

