
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
        int i = 0;

        for (int j = 0; j < 12; j++) {
            while(fruitSalad[j] == null && i < fruit.length) {
                
  
                if (fruit[i].contains("berry")) {
                    fruitSalad[j] = fruit[i];
                    numBerries ++;
                    numFruits ++;
                    i ++;
                    
                } else if (fruit[i].contains("Apple")) {
                    if (numApples < 3) {
                        fruitSalad[j] = fruit[i];
                        numApples ++;
                        numFruits ++;
                        i ++;
                        
                    } else {
                        i ++;
                    }
                    
                } else if (fruit[i].contains("Orange")) {
                    if (numOranges < 2) {
                        fruitSalad[j] = fruit[i];
                        numOranges ++;
                        numFruits ++;
                        i ++;
                        
                    } else {
                        i++;
                    }
                    
                // from remaining, as long as not tomato, add
                    
                } else if (!fruit[i].contains("Tomato")) {
                    fruitSalad[j] = fruit[i];
                    numFruits ++;
                    i++;
                } else {
                    i ++;
                }
                
            } 
        }
        System.out.println("My fruit salad contains " + Arrays.toString(fruitSalad));
        System.out.println("There are " + numFruits + " fruits in my fruit salad");
        System.out.println("There are " + numOranges + " oranges in my fruit salad");
        System.out.println("There are " + numApples + " apples in my fruit salad");
        System.out.println("There are " + numBerries + " berries in my fruit salad");
    }
}
