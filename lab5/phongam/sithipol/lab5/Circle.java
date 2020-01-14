/*The circle class is inherited from the shape class.
It has one protected variable called radius.
It has three constructors.
The first constructor accepts no argument. It calls the superclass's constructor with the keyword "super". Then it initializes radius with 1.0.
The second constructor accepts one double that will be used to initialize radius. It also calls superclass's constructor.
The last constructor accepts three arguments: double, String and boolean. It used the first double variable to initializes radius. The second and third will be used to call superclass's constructor.
When initialize radius, you must name the input argument radius and use keyword this.
It has getter and setter for radius. When create setters, you must use the keyword "this".
It overrides the abstract methods getArea() and getPerimeter().
It overrides the method toString() such that it outputs the result.

* Author: sithipol phongam
 * ID: 623040340-0
 * Sec: 1
 * Date: January 15, 2020

*/
package phongam.sithipol.lab5;
import java.text.DecimalFormat;

public class Circle extends Shape {
    protected double radius;


    public Circle() {
        super();
        this.radius = 1.0;

    }

    public Circle(double radius) {
        super();
        this.radius = radius;

    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;

    }

    public double getRadius() {
        return this.radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;

    }
    @Override
    public double getArea() { // calculate the area of a circle.
        double area = Math.PI * (radius*radius);
        DecimalFormat df2 = new DecimalFormat("0.00");
        return Double.parseDouble(df2.format(area));
    }
    @Override
    public double getPerimeter() { // calculate the perimeter of a circle.
        double Perimeter = 2*Math.PI*radius;
        DecimalFormat df2 = new DecimalFormat("0.00");
        return Double.parseDouble(df2.format(Perimeter));

    }

    public String toString() { // use keyword super for inherite method toString from Shape class.
        return super.toString() + ", radius:" + radius;
    }

}