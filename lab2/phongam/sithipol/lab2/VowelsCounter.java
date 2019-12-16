/*
* this VowelsCounter program is to accept one arguments: s
* the program count vowels from sentence  
* the output format is Total number of vowels is <count>"
* Author: sithipol phongam
* ID: 623040340-0
* Sec: 1
* Date: December 16, 2019
*
**/


package phongam.sithipol.lab2;

public class VowelsCounter {
    public static void main(String args[]) {
        String s = args[0];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        System.out.println("Total number of vowels is " + count);
    }
}
