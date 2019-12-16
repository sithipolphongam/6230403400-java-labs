/**Develop the program called Calculator which can add, subtract, multiply, or divide any  decimal numbers.
 *  The program displays the quitting message when the user types "q" or "Q". 
 * Author: sithipol phongam
 * ID: 623040340-0
 * Sec: 1
 * Date: December 16, 2019*/

package phongam.sithipol.lab2;
import java.text.DecimalFormat;
public class Calculator{
    private static DecimalFormat df2 = new DecimalFormat("0.00");
    public static void main(String[] args) {
        if (args[0].equals("q") || args[0].equals("Q")){
            System.out.println("Quitting the program");
            System.exit(1);
            
        }else if (args.length != 3){
            System.out.println("Calculator <operator><operand1><operand2>");
            System.exit(1);
        }
        String operator = args[0];
        float num1 = Float.parseFloat(args[1]);
        float num2 = Float.parseFloat(args[2]);
        if (operator.equals("+")){
            System.out.println(num1+" "+operator+" "+num2+" = "+df2.format(num1+num2));
        } else if (operator.equals("-")){
            System.out.println(num1+" "+operator+" "+num2+" = "+df2.format(num1-num2));
        } else if (operator.equals("x")){
            System.out.println(num1+" "+operator+" "+num2+" = "+df2.format(num1*num2));
        } else if (operator.equals("/") && num2 != 0){
            System.out.println(num1+" "+operator+" "+num2+" = "+df2.format(num1/num2));
        } else if (operator.equals("/") && num2 == 0){
            System.out.println("The second operand cannot be zero");
            System.exit(1);
        } 
    }
}