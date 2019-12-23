/*
Write a Java program called NumberGuessingGame that simulates a guessing game of which a user guesses number from 1 to 10. 
The answer is randomly generated then a user enter a number via the console. 
Each time a number is entered, one of the following three possible outputs will be displayed. 1. “Congratulations!”:
 if a number entered is the same as the answer, 2. “Try a lower number!”: if the number entered is higher than the answer, and 3. 
 “Try a higher number!”: if the number entered is smaller than the answer. 
 The game ends when user guess the answer correctly or the user guess the number incorrectly five times. 
 
 Author: sithipol phongam
 ID : 623040340-0
 Sec : 1 
 Date Dec 23 2019

*/
package sithipol.lab3;
import java.lang.Math;
import java.util.Scanner;
public class NumberGuessingGame{
    public static void main(String[] args) {
        System.out.println("Welcome to a number guessing game!");
        int max = 10;
        int min = 1;
        int random = min + (int)(Math.random() * ((max - min) + 1));

        for (int i = 0; i < 10; i++){
            Scanner obj=new Scanner(System.in);
            System.out.print("Enter an integer between 1 and 10:");
            int number = obj.nextInt();

             if (number == random && i == 4){
                System.out.println("Congratulations!");
                System.out.println("You have tried "+(i+1)+" time");
                break;

            } else if (number < random && i == 4){
                System.out.println("Try a higher number");
                System.out.println("You have tried 5 time. You can out of guesses");
                System.out.println("The answer is "+ random);
                 break;

            } else if (number > random && i == 4){
                System.out.println("Try a lower number");
                System.out.println("You have tried 5 time. You can out of guesses");
                System.out.println("The answer is "+ random);
                 break;

            } else if (number != random && i == 4){
                System.out.println("You have tried 5 time. You can out of guesses");
                System.out.println("The answer is "+ random);
                 break;

            } else if (number < random){
                System.out.println("Try a higher number");

            } else if (number > random){
                System.out.println("Try a lower number");

            } else if (number == random){
                System.out.println("Congratulations!");
                System.out.println("You have tried "+(i+1)+" times");
                break;
            } 

        }
    }
}