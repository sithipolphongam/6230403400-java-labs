
package sithipol.lab2;
public class Calculator{
    public static void main(String[] args) {
        String operator = args[0];
        float num1 = Float.parseFloat(args[1]);
        float num2 = Float.parseFloat(args[2]);
        if (operator.equals("+")){
            System.out.println(num1+" "+operator+" "+num2+" = "+(num1+num2));
        } else if (operator.equals("-")){
            System.out.println(num1+" "+operator+" "+num2+" = "+(num1-num2));
        } else if (operator.equals("x")){
            System.out.println(num1+" "+operator+" "+num2+" = "+(num1*num2));
        } else if (operator.equals("/") && num2 != 0){
            System.out.println(num1+" "+operator+" "+num2+" = "+(num1/num2));
        } else if (operator.equals("/") && num2 == 0){
            System.out.println("The second operand cannot be zero");
        }
    }
}