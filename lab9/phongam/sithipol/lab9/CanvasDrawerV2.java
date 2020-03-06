/* Author: sithipol phongam
* ID: 623040340-0
* Sec: 1
* Date: March 6, 2020 */

package phongam.sithipol.lab9;
import phongam.sithipol.lab7.CanvasDrawerV1;
import java.awt.*;

public class CanvasDrawerV2 extends CanvasDrawerV1 {
    protected Ball drawBall;
    protected Keeper keeperLeft, keeperRight;
    

    private static final long serialVersionUID = 1L;

    public CanvasDrawerV2() {
        super();
        int xBall = CANVAS_WIDTH/2-Ball.BALL_DIAMETER/2;
        int yBall = CANVAS_HEIGHT/2 - Ball.BALL_DIAMETER/2;
        drawBall = new Ball(xBall, yBall); // set position of the ball in panel 

        int xLeftKeeper = 0;
        int yLeftKeeper = CANVAS_HEIGHT/2 - Keeper.KEEPER_HEIGHT/2;

        int xRightKeeper = 780;
        int yRightKeeper = (CANVAS_HEIGHT/2 - Keeper.KEEPER_HEIGHT/2);

        keeperLeft = new Keeper(xLeftKeeper, yLeftKeeper);
        keeperRight = new Keeper(xRightKeeper, yRightKeeper); // set position of the keeper in the panel

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.YELLOW);
        g2d.fill(drawBall);

        g2d.setColor(Color.BLUE);
        g2d.fill(keeperLeft);

        g2d.setColor(Color.RED);
        g2d.fill(keeperRight);
        
        // fill shape and color in panel
    } 

    
}