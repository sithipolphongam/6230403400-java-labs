package phongam.sithipol.lab5;
public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "White";
        this.filled = false;

    }

    public Shape(String color, boolean filled) { 
        this.color = color;
        this.filled = filled;

    }

    public String getColor() {
        return this.color;

    }

    public void setColor(String color) {
        this.color = color; 

    }

    public boolean isFilled() {
        return this.filled;

    }

    public void setFilled(boolean filled) { 
        this.filled = filled;

    }

    public abstract double getArea();

    public abstract double getPerimeter();
    @Override
    public String toString() {
        return "Color:" + color + ", Filled:" + filled;
    }
}

