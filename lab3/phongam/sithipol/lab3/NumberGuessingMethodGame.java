
/*
Write a Java program called NumberGuessingMethodGame. 
The program defines at least two subroutines, namely genAnswer(), and playGame() described below. 
The program also contains a static int variable answer which contains the answer of the game.
 The main of the program should be as shown.
 Author: sithipol phongam
 ID : 623040340-0
 Sec : 1 
 Date Dec 23 2019

*/
package sithipol.lab3;
import java.lang.Math;
import java.util.Scanner;
public class NumberGuessingMethodGame {
    static int answer;
    public static void main(String[] args) {
        genAnswer();
        playGame();
        
    }
    private static void genAnswer() {
        int max = 10;
        int min = 1;
        final int answer = min + (int)(Math.random() * ((max - min) + 1));
        System.out.println(answer);
        NumberGuessingMethodGame.answer = answer;
    }
    private static void playGame() {
        System.out.println("Welcome to a number guessing game!");

        for (int i = 0; i < 10; i++){
            Scanner obj=new Scanner(System.in);
            System.out.print("Enter an integer between 1 and 10:");
            int number = obj.nextInt();

             if (number == answer && i == 4){
                System.out.println("Congratulations!");
                System.out.println("You have tried "+(i+1)+" time");
                break;

            } else if (number < answer && i == 4){
                System.out.println("Try a higher number");
                System.out.println("You have tried 5 time. You can out of guesses");
                System.out.println("The answer is "+ answer);
                 break;

            } else if (number > answer && i == 4){
                System.out.println("Try a lower number");
                System.out.println("You have tried 5 time. You can out of guesses");
                System.out.println("The answer is "+ answer);
                 break;

            } else if (number != answer && i == 4){
                System.out.println("You have tried 5 time. You can out of guesses");
                System.out.println("The answer is "+ answer);
                 break;

            } else if (number < answer){
                System.out.println("Try a higher number");

            } else if (number > answer){
                System.out.println("Try a lower number");
                
            } else if (number == answer){
                System.out.println("Congratulations!");
                System.out.println("You have tried "+(i+1)+" times");
                break;
            } 

        }
    }
}
