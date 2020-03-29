package phongam.sithipol.lab10;

import java.time.LocalDate;

public class Person {
    protected String name;
    protected double weight, height;
    protected LocalDate dob;
    

    public Person(String name, double height, double weight, LocalDate dob) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.dob = dob;

    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getWeight() {
        return this.weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public LocalDate getDob() {
        return this.dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override 
    public String toString() {
        String name = getName();
        double weight = getWeight();
        double height = getHeight();
        LocalDate dob = getDob();

        //Get age. (Compare dob with today date)
        int year_old = Math.abs(dob.getYear() - LocalDate.now().getYear());
        int month_old = Math.abs(dob.getMonthValue() - LocalDate.now().getMonthValue());
        int day_old = Math.abs(dob.getDayOfMonth() - LocalDate.now().getDayOfMonth());

        return name + " is " + year_old + " years " + month_old  + " months " 
                + day_old + " days, has weight as " + weight + " kg., and height as " 
                + height + " cm. \n";
    }


}