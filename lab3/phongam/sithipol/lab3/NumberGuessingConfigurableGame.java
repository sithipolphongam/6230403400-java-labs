/*
In method configure(), 
The program lets you choose the minimum value of the guessing number, the maximum value of the guessing number, 
and the number of maximum number of tries.  
In method playGames(),
Method playGame() that was implemented in problem 2 is called
The minimum and maximum values need to be updated at the prompt accepting a guessing number
After the game ends, the program gives an option to play again if the user enters "y" or "Y".
If the user enters other values, the program will quit and prints the message 
"Thank you for playing our games. Bye!"

ID : 623040340-0
 Sec : 1 
 Date Dec 23 2019
*/
package phongam.sithipol.lab3;
import java.lang.Math;
import java.util.Scanner;
public class NumberGuessingConfigurableGame {
    static int answer, minimumval, maximumval, numtries;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        configurable();
        genAnswer();
        playGame();    
    }
    public static void configurable() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the min value:");
        int minimumval = obj.nextInt(); //min value
        System.out.print("Enter the max value:");
        int maximumval = obj.nextInt(); // max value
        System.out.print("Enter the maximum number of tries:"); 
        int numtries = obj.nextInt(); // number of try
        NumberGuessingConfigurableGame.minimumval = minimumval;
        NumberGuessingConfigurableGame.maximumval = maximumval;
        NumberGuessingConfigurableGame.numtries = numtries;
        
    }
    public static void genAnswer() {
       
        answer = minimumval + (int)(Math.random() * ((maximumval - minimumval) + 1));
        // random number assign in answer
        
    }
    public static void playGame() {
        System.out.println("Welcome to a number guessing game!");
        int count = 0; 
        for (int i = 0; i < numtries; i++) {
            Scanner obj=new Scanner(System.in);
            System.out.print("Enter an integer between " + minimumval + " and " + maximumval +":");
            int number = obj.nextInt();
            
                if (number < minimumval || number > maximumval) {
                    System.out.println("The number must be between " + minimumval + " and " + maximumval);
                    i++;
                    numtries = numtries + 2;

              } else if (number < answer && i == numtries-1){
                    System.out.println("Try a higher number");
                    count++;
                    System.out.println("You have tried "+count+ " time. You can out of guesses");
                    System.out.println("The answer is "+ answer);
                 break;

            }   else if (number > answer && i == numtries-1){
                    System.out.println("Try a lower number");
                    count++;
                    System.out.println("You have tried "+count+ " time. You can out of guesses");
                    System.out.println("The answer is "+ answer);
                    break;

            }   else if (number != answer && i == numtries-1){
                    count++;
                    System.out.println("You have tried "+count+ " time. You can out of guesses");
                    System.out.println("The answer is "+ answer);
                    break;

            }   else if (number < answer){
                    System.out.println("Try a higher number");
                    count++;
        
            } else if (number > answer){
                System.out.println("Try a lower number");
                count++;
                
                
            } else if (number == answer){
                System.out.println("Congratulations!");
                count++;
                System.out.println("You have tried "+count+" times");
                break;
                }
            }
            Scanner askuser = new Scanner(System.in);
            System.out.print("Want to play again (Y or y):");
            String input = askuser.nextLine();
            if (input.equals("Y") || input.equals("y")) {
                configurable();
                genAnswer();
                playGame();

            } else {
                System.out.println("Thank you for playing our games. Bye!");
            } 

        }   
        
            
    }

