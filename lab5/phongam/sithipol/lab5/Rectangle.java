/*Class Rectangle inherited from Shape.
It has two double variables named width and length.
it has three constructors.
The first constructor accepts no argument. It calls the superclass's constructor with the keyword "super". Then it initializes width and length with 1.0 and 2.0 respectively.
The second constructor accepts two doubles that will be used to initialize width and length. It also calls superclass's constructor.
The last constructor accepts four arguments: double, double, String and boolean. It used the first two double variables to initializes width and length. The other arguments will be used to call superclass's constructor.
When initialize width and length, you must name the input arguments width and length and use keyword this.
It has getters and setters for width and length. When create setters, you must use the keyword "this".
It overrides the abstract methods getArea() and getPerimeter().
It overrides the method toString() such that it outputs the result.

* Author: sithipol phongam
 * ID: 623040340-0
 * Sec: 1
 * Date: January 15, 2020
*/
package phongam.sithipol.lab5;
import java.text.DecimalFormat;

public class Rectangle extends Shape {
    protected double width;
    protected double lenght;

    public Rectangle() {
        super();
        this.width = 1;
        this.lenght = 2;
    }

    public Rectangle(double width, double lenght) {
         super();
         this.width = width;
         this.lenght = lenght;
    }

    public Rectangle(double width, double lenght, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.lenght;
    }

    public void setLength(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getArea() { // calculate the area of a rectangle.
        double area = width *lenght;
        DecimalFormat d2f = new DecimalFormat("0.00");
        return Double.parseDouble(d2f.format(area)); 
    }

    @Override
    public double getPerimeter() { // calculate the perimeter of a rectangle.
        double Perimeter = 2*width + 2*lenght;
        DecimalFormat df2 = new DecimalFormat("0.00");
        return Double.parseDouble(df2.format(Perimeter));
    }

    public String toString() { //use keyword super for inherite method toString from Shape class.
        return super.toString() + ", width:" + width + ", length:" + lenght;
    }


} 