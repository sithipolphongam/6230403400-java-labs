package phongam.sithipol.lab9;

import java.util.concurrent.ThreadLocalRandom;

public class CanvasDrawerV4 extends CanvasDrawerV3 {
    private static final long serialVersionUID = 1L;
    protected int min = -2;
    protected int max = 2;
    public CanvasDrawerV4() {
        super();
        running = new Thread(this);
        int random_xv = ThreadLocalRandom.current().nextInt(min, max+1);
        int random_yv = ThreadLocalRandom.current().nextInt(min, max+1);
        int xv = random_xv;
        int yv = random_yv;
        drawBall.setXvelocity(xv);
        drawBall.setYvelocity(yv);
        running.start();
    }

    @Override
    public void run() {
        while(true) {
            if (drawBall.x  <= 0 || drawBall.x + Ball.BALL_DIAMETER >= CANVAS_WIDTH) {
                if (drawBall.y + Ball.BALL_DIAMETER / 2 <= 150 || drawBall.y + Ball.BALL_DIAMETER / 2 >= 350) {
                    int xVelocity = drawBall.getXvelocity();
                    drawBall.setXvelocity(xVelocity * -1);
                }
            }
            else if (drawBall.y <= 0 || drawBall.y + Ball.BALL_DIAMETER >= CANVAS_HEIGHT) {
                int yVelocity = drawBall.getYvelocity();
                drawBall.setYvelocity(yVelocity * -1);

            }
            else if (
                    keeperLeft.y  <= drawBall.y + Ball.BALL_DIAMETER / 2 && 
                    drawBall.y + Ball.BALL_DIAMETER / 2 <= keeperLeft.y + Keeper.KEEPER_HEIGHT && 
                    drawBall.x <= 20) {

                int xVelocity = drawBall.getXvelocity();
                    drawBall.setXvelocity(xVelocity * -1);
            }
            else if (
                    keeperRight.y <= drawBall.y + Ball.BALL_DIAMETER / 2 && 
                    drawBall.y + Ball.BALL_DIAMETER / 2 <= keeperRight.y + Keeper.KEEPER_HEIGHT && 
                    drawBall.x + Ball.BALL_DIAMETER >= 780) { 

                int xVelocity = drawBall.getXvelocity();
                    drawBall.setXvelocity(xVelocity * -1);
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
    public void resetBall() {
        drawBall.x = CANVAS_WIDTH/2-Ball.BALL_DIAMETER/2;
        drawBall.y = CANVAS_HEIGHT/2 - Ball.BALL_DIAMETER/2;

        int random_xv = ThreadLocalRandom.current().nextInt(min, max+1);
        int random_yv = ThreadLocalRandom.current().nextInt(min, max+1);
        int xv = random_xv;
        int yv = random_yv;
        drawBall.setXvelocity(xv);
        drawBall.setYvelocity(yv);

    }
}