/**
 * This Athlete program is to accept three arguments: athlete name, the sport name 
*  that that athlete plays, and the nationality of that athlete.  Its output format is “My 
*  favorite athlete is <athlete_name> who plays <sport_name> and has 
* nationality as <athlete_nationality>”  
*
* Author: sithipol phongam
* ID: 623040340-0
* Sec: 1
* Date: December 16, 2019
*
**/
package sithipol.lab2;
public class Athlete{
    public static void main(String[] args) {
        if (args.length != 3){
            System.err.println("Athlete <athlete name> <sport name> <nationality>");
        }

        else {
            String name = args[0];
            String sport = args[1];
            String nationality = args[2];
            System.out.println("My favorite athlete is " + name + " who plays " + sport + " and has nationality as " + nationality);
        }

        
    }
}