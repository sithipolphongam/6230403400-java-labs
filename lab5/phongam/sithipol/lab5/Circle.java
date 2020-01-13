package phongam.sithipol.lab5;

import java.math.BigDecimal;
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
    public double getArea() {
        double area = Math.PI * (radius*radius);
        DecimalFormat df2 = new DecimalFormat("0.00");
        return Double.parseDouble(df2.format(area));
    }
    @Override
    public double getPerimeter() {
        double Perimeter = 2*Math.PI*radius;
        DecimalFormat df2 = new DecimalFormat("0.00");
        return Double.parseDouble(df2.format(Perimeter));
        
    }

    public String toString() {
        return super.toString() + ", radius:" + radius;
    }
     
}
