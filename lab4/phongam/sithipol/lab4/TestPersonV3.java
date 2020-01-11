/**Write a java class called Student and Teach that has the properties:
Class Student
Create 2 variables called major and GPA.
Create a constructor that accepts 6 parameters. The first 4 parameters should be initialized using "super".
Create getters and setters for the two variables created.
Override the method toString() such that it shows the information of the class Student. You should call toString() of the superclass PersonV2 to get some of the information.
Class Teacher
Create 2 variables called teachingSubject and salary.
Create a constructor that accepts 6 parameters. The first 4 parameters should be initialized using "super".
Create getters and setters for teachingSubject and salary.
Override the method toString() such that it shows the information of the class Teacher. You should call toString() of the superclass PersonV2 to get some of the information.
Class TestPersonV3
TestPersonV3 has the main method. However some parts of the code are hidden. Your task is to complete the code and make sure.
* Author: sithipol phongam
 * ID: 623040340-0
 * Sec: 1
 * Date: January 11, 2020 */
package phongam.sithipol.lab4;
public class TestPersonV3 {
    public static void main(String[] args) {
        Teacher onizuka = new Teacher("Onizuka", 185, 80, "1998-07-07", "social study", 15000);
        Student zuckerberg = new Student("Zuckerberg", 180, 25, "1984-05-14", "Computer Engineering", 4.00);
        System.out.println(onizuka);
        System.out.println(zuckerberg);
        onizuka.howOld();
        zuckerberg.howOld();
        System.out.println(Person.getNumberofPerson() + " persons have been created.");
        PersonV2 mickey = new PersonV2("Mickey Mouse", 60, 25, "1982-01-01");
        Student mickeyV2 = new Student("Mickey Mouse", 60, 25, "1982-01-01", "Animation", 3.0);
        System.out.println(mickey);
        System.out.println(mickeyV2);
        System.out.println(Person.getNumberofPerson() + " persons have been created.");
        mickey.compareAge(onizuka);
    }
}