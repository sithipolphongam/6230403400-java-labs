package sithipol.lab4;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Person {

       private String name;
       private double height; 
       private double weight;
       private static int numberOfPerson = 0;

        public Person() {
            this.name = "unknown";
            this.height = 0.0f;
            this.weight = 0.0f;
            numberOfPerson++;
        }
        public Person(String name) { 
            this.name = name; 
            this.height = 0.0f;
            this.weight = 0.0f;
            numberOfPerson++;
        }
        public Person(String name, double height, double weight) {
            this.name = name; 
            this.height = height;
            this.weight = weight;
            numberOfPerson++;
        }
        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getHeight() {
            return this.height;
        }
        public void setHeight(double height) {
            this.height = height;
        }
        public double getWeight() {
            return this.weight;
        }
        public void setWeight(double weight) {
            this.weight = weight;
        }
        @Override
        public String toString() {
            return "name=" + name + ", height=" + height + " cm. weight=" + weight + "kg.";
        }
        public static int getNumberofPerson() {
            return numberOfPerson;
        }
        public String getBMI() {
            double height = this.height;
            double weight = this.weight;
            double bmi = weight/((height/100)*(height/100));
            NumberFormat formatter = new DecimalFormat("#0.00");
            return formatter.format(bmi);
        }
       
        
        

    
}
