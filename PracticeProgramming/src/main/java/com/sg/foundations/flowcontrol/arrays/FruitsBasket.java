
package com.sg.foundations.flowcontrol.arrays;

/**
 * @author emilytracey
 * date = 19/10/2022
 * purpose = arrays revision
 */

public class FruitsBasket {
    
    public static void main(String[] args) {
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;

        // using enhanced for loop
           
        for(String fruit : fruitBasket) {
            if(fruit.equals("Orange")) {
                numOranges ++;
                
            } else if (fruit.equals("Apple")) {
                numApples ++;
                
            } else {
                numOtherFruit ++;
            }
        }

        // Print The Results!
        System.out.println("Total # of fruit in the basket: " + (numOranges + numApples + numOtherFruit));
        System.out.println("Number of Apples: " + numApples);
        System.out.println("Number of Oranges: " + numOranges);
        System.out.println("Number of other Fruit: " + numOtherFruit);

    }

}
