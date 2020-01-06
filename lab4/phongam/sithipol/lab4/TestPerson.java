/** Create a method called getBMI() that return the BMI (Body Mass Index) for that person. 
 * The method should return String the value of BMI. The value should also displays with only two digits. 
 * BMI value can be calculated as 
 * BMI = weight / height^2
 * Create a class called TestPerson which includes the main method. 
 * The output of the main method
 * Author: sithipol phongam
 * ID: 623040340-0
 * Sec: 1
 * Date: January 6, 2020
*/
package sithipol.lab4;
public class TestPerson {
    public static void main(String[] args) {
        Person unknown = new Person();
        System.out.println(unknown);
        System.out.println(Person.getNumberofPerson() + " person has been creted.");
        Person sala = new Person("Sala");
        Person mane = new Person("Mane", 175, 65);
        System.out.println(sala);
        System.out.println(mane);
        Person henderson = new Person("Henderson", 180, 100);
        System.out.println(henderson);
        System.out.println(mane.getName() + "'BMI is " + mane.getBMI());
        System.out.println(henderson.getName() + "'s BMI is " + henderson.getBMI());
        henderson.setWeight(80);
        System.out.println(henderson.getName() + "' BMI is " + henderson.getBMI());
        System.out.println(Person.getNumberofPerson() + " persons have been created.");
    }
}