/* Author: sithipol phongam
* ID: 623040340-0
* Sec: 1
* Date: March 6, 2020 */
package phongam.sithipol.lab9;
import java.awt.geom.*;
public class Ball extends Ellipse2D.Double {
    private static final long serialVersionUID = 1L;

    public final static int BALL_DIAMETER = 30;
    private int  xVelocity, yVelocity;
    // private int x = 0;
    // private int y = 0;

    public Ball(int x, int y) {
        super(x, y, BALL_DIAMETER , BALL_DIAMETER);
        this.xVelocity = 0;
        this.yVelocity = 0;
    }

    public Ball(int x, int y, int xVelocity, int yVelocity) {
        super(x, y, BALL_DIAMETER , BALL_DIAMETER);
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
    }

    public int getXvelocity() {
        return this.xVelocity;
    }

    public void setXvelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    public int getYvelocity() {
        return this.yVelocity;
    }

    public void setYvelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }
    public void move() {
        this.x += xVelocity;
        this.y += yVelocity;
    }

    
}   