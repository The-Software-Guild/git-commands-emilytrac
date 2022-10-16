
package com.et.assessmentbasicsconcepts;

/**
 * @author emilytracey
 * data = 13/10/2022
 * purpose = play a game of Rock Paper Scissors
 */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        
        while (true) {    
            
            // use of scanner throughout to get player response 
            
            Scanner inputScanner = new Scanner(System.in);
            System.out.println("Hello, how many rounds of Rock, Paper, Scissors "
                    + "would you like to play? ");
            int numberGames = Integer.parseInt(inputScanner.nextLine());

            // using an if to limit the rounds to between 1 and 10
            // allows the user to enter another number if not accepted

            if (numberGames < 1 || numberGames > 10) {
                System.out.println("Oops! Try a number between 1 and 10!");
                int newnumGames = Integer.parseInt(inputScanner.nextLine());
                rockPaperScissors(newnumGames);
            } else {
                rockPaperScissors(numberGames);
            }

            // setting condition to break the while loop

            System.out.println("Would you like to play again? 'Yes' or 'No'?");
            String answer = inputScanner.nextLine();

            if (answer.equals("No")) {
                System.out.println("Thanks for playing!");
                break;
            } else if (answer.equals("Yes")) {
                continue;
            }
        } 
    }

    // rock paper scissors method to be called        
   
    public static void rockPaperScissors(int numGames) {
        
        Scanner inputScanner = new Scanner(System.in);
        Random computerChooser = new Random();
        
        int numTies = 0;
        int userWins = 0;
        int compWins = 0;
        
        // setting up a for loop to play the chosen number of games
        
        for (int i = 1; i <= numGames; i++) {
        System.out.println("Would you like to pick 'Rock', 'Paper' or 'Scissors'?? ");
        String userInput = inputScanner.nextLine();
            
        int computerChoice = computerChooser.nextInt(3) + 1;
            
        // using else-if to match the computer input type to the user input type
            
        String computerPlay = "";
            
        switch (computerChoice) {
            case 1:
                computerPlay = "Rock";
                break;
            case 2:
                computerPlay = "Paper";
                break;
            case 3:
                computerPlay = "Scissors";
                break;
            default:
                break;
            }
            
        // printing what each chose
            
        System.out.println("You chose " + userInput);
        System.out.println("The computer chose " + computerPlay);
            
        // use if/else-if/else to determine if it's a tie/win/draw
            
        if (userInput.equals(computerPlay)) {
            System.out.println("It's a tie!");
            numTies ++;
        } else if (userInput.equals("Rock")) {
            if (computerPlay.equals("Scissors")) {
                System.out.println("You lose!");
                compWins ++;
            } else if (computerPlay.equals("Paper")) {
                System.out.println("You win!");
                userWins ++;
            }
        } else if (userInput.equals("Paper")) {
            if (computerPlay.equals("Rock")) {
                System.out.println("You win!");
                userWins ++;
            } else if (computerPlay.equals("Scissors")) {
                System.out.println("You lose!");
                compWins ++;
            }
        } else if (userInput.equals("Scissors")) {
            if (computerPlay.equals("Rock")) {
                System.out.println("You lose!");
                compWins ++;
            } else if (computerPlay.equals("Paper")) {
                System.out.println("You win!");
                userWins ++;
            }
        }     
        }
        
        // printing the results
        
        System.out.println("The results are in...");
        System.out.println("Number of ties: " + numTies);
        System.out.println("Number of wins: " + userWins);
        System.out.println("Number of losses: " + compWins);
        
        if (userWins > compWins) {
            System.out.println("Overall you WIN!!");
        } else if (userWins == compWins || compWins > userWins) {
            System.out.println("Sorry you LOST");
        }
    }
}
