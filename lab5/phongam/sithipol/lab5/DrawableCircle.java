/*Class DrawableCircle inherited from Circle and implements Drawable and Movable. 
It has two double variables named x and y. 
it has three constructors.
The first constructor accepts no argument. It calls the superclass's constructor with the keyword "super". Then it initializes x and y with 0.0 and 0.0 respectively.
The second constructor accepts two doubles that will be used to initialize x and y. It also calls superclass's constructor.
The last constructor accepts five arguments: double, double, double, String and boolean. It used the first two double variables to initializes x and y. The rest of the argument will be used to call superclass's constructor.
When initialize x and y, you must name the input arguments x and y and use keyword "this".
It has getters and setters for x and y. When create setters, you must use the keyword "this".
It overrides the methods moveUp(), moveDown(), moveLeft() and moveRight().

* Author: sithipol phongam
 * ID: 623040340-0
 * Sec: 1
 * Date: January 15, 2020
*/
package phongam.sithipol.lab5;
public class DrawableCircle extends Circle implements Drawable, Movable {
    private double x;
    private double y;

    public DrawableCircle() {
        super();
        this.x = 0.0;
        this.y = 0.0;
    }

    public DrawableCircle(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public DrawableCircle(double x, double y, double radius, String color, boolean filled) {
        super(radius, color, filled);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void moveUp(int y) {
        this.y = this.y + y;

    }

    @Override
    public void moveDown(int y) {
        this.y = this.y - y;

    }

    @Override
    public void moveRight(int x) {
        this.x = this.x + x;

    }

    @Override
    public void moveLeft(int x) {
        this.x = this.x - x;

    }

    @Override
    public String draw() {
    
        return "draw a circle with the center at  (" + x + "," + y + ") with radius=" + radius;
    }

    




}