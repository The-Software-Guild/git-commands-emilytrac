
package com.sg.foundations.flowcontrol.arrays;

import java.util.Arrays;

/**
 * @author emilytracey
 * date = 14/10/2022
 * purpose = 
 */

public class FruitSalad {

        public static void main(String[] args) {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", 
            "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", 
            "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  
            "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", 
            "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", 
            "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[12];
        int numOranges = 0;
        int numApples = 0;
        int numBerries = 0;
        int numFruits = 0;

        for (int i = 0; i < fruitSalad.length; i++) {
            
            do {
                if (fruit[i].contains("berry")) {
                    fruitSalad[i] = fruit[i];
                    numBerries ++;
                    numFruits ++;
                    
                } else if (fruit[i].contains("Apple")) {
                    if (numApples < 3) {
                        fruitSalad[i] = fruit[i];
                        numApples ++;
                        numFruits ++;
                    }
                    
                } else if (fruit[i].contains("Orange")) {
                    if (numOranges < 2) {
                        fruitSalad[i] = fruit[i];
                        numOranges ++;
                        numFruits ++;
                    }
                    
                // from remaining, as long as not tomato, add
                    
                } else if (!fruit[i].contains("Tomato")) {
                    fruitSalad[i] = fruit[i];
                    numFruits ++;
                } else if (fruit[i].contains("Tomato")) {
                }
                
            } while (fruitSalad.length < 12);
        }
        System.out.println("My fruit salad contains " + Arrays.toString(fruitSalad));
            System.out.println("There are " + numFruits + " fruits in my fruit salad");
    }
}
