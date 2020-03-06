/* Author: sithipol phongam
* ID: 623040340-0
* Sec: 1
* Date: March 6, 2020 */

package phongam.sithipol.lab9;
import java.util.concurrent.ThreadLocalRandom;

public class CanvasDrawerV3 extends CanvasDrawerV2 implements Runnable {
    private static final long serialVersionUID = 1L;
    protected Thread running;
    protected int min = -2;
    protected int max = 2;  
    public CanvasDrawerV3() {
        super();
        running = new Thread(this);
        int random_xv = ThreadLocalRandom.current().nextInt(min, max+1);
        int random_yv = ThreadLocalRandom.current().nextInt(min, max+1); //Random numbers with the highest and smallest values ​​equal to 1 and 4.
        // Create a random int whose value is between MIN_RAND and MAX_RAND for xv and yv.
        int xv = random_xv;
        int yv = random_yv;
        drawBall.setXvelocity(xv);
        drawBall.setYvelocity(yv);
        // set x and y velocity 
        running.start();
    }

    @Override
    public void run() {
        while(true) {
            if (drawBall.x <= 0 || drawBall.x + Ball.BALL_DIAMETER >= CANVAS_WIDTH) {
                if (this.drawBall.y + Ball.BALL_DIAMETER / 2 <= 150 || this.drawBall.y + Ball.BALL_DIAMETER / 2 >= 350) {
                    // Get ball's current x velocity.
                    int xVelocity = this.drawBall.getXvelocity();
                    
                    // Set ball's new x velocity.
                    this.drawBall.setXvelocity(xVelocity * -1);
                }
            }
            else if (drawBall.y <= 0 || drawBall.y + Ball.BALL_DIAMETER >= CANVAS_HEIGHT) {
                // Get ball's current y velocity.
                int yVelocity = this.drawBall.getYvelocity();

                // Set ball's new y velocity.
                this.drawBall.setYvelocity(yVelocity * -1);

            }
            
            drawBall.move();
            repaint();


            try{
                Thread.sleep(10);
            }
            catch(InterruptedException ex) {

            }
        }
    }    
    
}