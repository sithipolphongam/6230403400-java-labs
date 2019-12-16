
package sithipol.lab2;
public class Athlete{
    public static void main(String[] args) {
        if (args.length != 3){
            System.err.println("<athlete name> <sport name> <nationality>");
        }

        else {
            String name = args[0];
            String sport = args[1];
            String nationality = args[2];
            System.out.println("My favorite athlete is " + name + " who plays " + sport + " and has nationality as " + nationality);
        }

        
    }
}