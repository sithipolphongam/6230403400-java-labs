/**Write a java class called PersonV2 which has properties. PersonV2 inherited from Person.
Create a variable called dob which will keep date of birth of a person.
The variable dob should be of type LocalDate. LocalDate class with store a date (year, month, day).
Create a constructor that accepts 4 parameters. 
Your constructor needs to initialize 3 variables from class Person. 
This should be done by using keyword "super". The super keyword in Java is a reference variable which is used to refer to immediate parent class object.
 We can use super(parameters) to invoke immediate parent class constructor.
The constructor accepts String for variable dob in the form of yyyy-mm-dd. To initialize the value of dob, use the method parse(String) from class LocalDate. 
Create getters and setters for variable dob.
Create a method called isBirthday() which will check if today is an instance's birthday.
Create a method called howOld() which print out how old an instance is.
Create a method called compareAge(PersonV2) the method compare the age of an instance and that of an instance in the parameter. The method outputs who is older.
Override method toString(). The method returns String that is the detail of the class PersonV2 and Person. The detail of Person should be from the method toString() in class Person. Use keyword "super" to get the wanted String.
Create a class TestPersonV2 which will test PersonV2. The output of TestPersonV2 
* Author: sithipol phongam
 * ID: 623040340-0
 * Sec: 1
 * Date: January 11, 2020
*/
package phongam.sithipol.lab4;
import phongam.sithipol.lab4.Person;

public class TestPersonV2 {
    public static void main(String[] args) {
        PersonV2 doraemon = new PersonV2("Doraemon", 100, 100, "2017-05-26");
        PersonV2 nobita = new PersonV2("Nobita", 120, 25, "2012-01-06");
        System.out.println(doraemon);
        System.out.println(nobita);
        doraemon.howOld();
        nobita.howOld();
        doraemon.compareAge(nobita);
        nobita.compareAge(doraemon);
        doraemon.isBirthday();
        nobita.isBirthday();
        System.out.println(Person.getNumberofPerson() + " persons have been created.");
    }
}