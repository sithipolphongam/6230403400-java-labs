/* Author: sithipol phongam
* ID: 623040340-0
* Sec: 1
* Date: March 6, 2020 */
package phongam.sithipol.lab9;
import java.awt.geom.*;
public class Keeper extends Rectangle2D.Double {
    private static final long serialVersionUID = 1L;
    public final static int KEEPER_WIDTH = 20;
    public final static int KEEPER_HEIGHT = 50;
    public final static int KEEPER_SPEED = 10;

    public Keeper(int x, int y) {
        super(x, y, KEEPER_WIDTH, KEEPER_HEIGHT);
    }
    public void moveUp() {
        if (y - KEEPER_SPEED >= 150) {
            y = y - KEEPER_SPEED;
        }
    }

    public void moveDown() {
        if (y + KEEPER_HEIGHT + KEEPER_SPEED <= 350) {
            y = y + KEEPER_SPEED;
        }
    }
    


}