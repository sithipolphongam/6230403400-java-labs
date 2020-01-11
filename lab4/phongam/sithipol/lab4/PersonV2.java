
package phongam.sithipol.lab4;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class PersonV2 extends Person {

    //create variable date of birth
    private LocalDate dob; 

    public PersonV2(String name, double height, double weight, String dob) {
        super(name, height, weight); // Use super so that the Subclass PersonV2 can use constructors that already exist in the superclass Person.

        LocalDate timedob = LocalDate.parse(dob); // Change the value that is inherited from string to LocalDate.
        this.dob = timedob; 

    }

    public void setDOB(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate  getDOB() {
        return this.dob;
    }
    public void isBirthday() {

        // If the date of birth is equal to the current time Type under if
        if (dob.equals(LocalDate.now())) {
            System.out.println("Today is " + getName() + "s' Birthday." );

        // Other than the case above Type under else.
        } else {
            System.out.println("Today is Not " + getName() + "s' Birthday." );
        }
    }
    

    public void howOld() { //// Calculate the age of that person from the present day.
        System.out.println(getName() + " is " + dob.until(LocalDate.now()).getYears()
        + " years " + dob.until(LocalDate.now()).getMonths() + " months " 
        + (dob.until(LocalDate.now()).getDays()) + "days old.");
    }

   
    // Comparing the age of 2 people
    public void compareAge(PersonV2 othPersonV2) {
        
       long daybetween = dob.until(othPersonV2.getDOB(), ChronoUnit.DAYS); //The distance between days, in days.

        
       if (daybetween == 0) { // If the distance between the days is equal

           System.out.println("same days");

       
       } else if (daybetween > 0 ) { // The distance between days is positive.

           int year = dob.until(othPersonV2.getDOB()).getYears();
           int months = dob.until(othPersonV2.getDOB()).getMonths();
           int day = (dob.until(othPersonV2.getDOB()).getDays())+1;
           System.out.println(getName() + " is " + year + " years " + months + " mouths " + day + " days older than " + othPersonV2.getName() + ".");

        
       } else if (daybetween < 0 ) { // The distance between days is negative.
           int year = dob.until(othPersonV2.getDOB()).getYears();
           int months = dob.until(othPersonV2.getDOB()).getMonths();
           int day = (dob.until(othPersonV2.getDOB()).getDays()-1);
           System.out.println(othPersonV2.getName() + " is " + (-1)*year + " years " + (-1)*months + " mouths " + (-1)*day + " days older than " + getName() + ".");
       }
        
    } @Override
      public String toString() {
        return "name=" + getName() + ", height=" + getHeight() + " cm., weight=" + getWeight() + "kg., Birthday=" + getDOB();
      }



}