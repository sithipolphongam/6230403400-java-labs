package phongam.sithipol.lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class CanvasDrawerV1 extends JPanel {
    protected JPanel g2d;
    protected int CANVAS_HEIGHT = 500;
    protected int CANVAS_WIDTH = 800;
    protected int LINE_WIDTH = 4;
    protected BasicStroke bs;
    protected int DOT_CIRCLE_RADIUS = 5;
    protected Color CANVAS_BACKGROUND = Color.GREEN;
    private static final long serialVersionUID = 1L;

    public CanvasDrawerV1() {
        super();
        setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT)); // setsize (width = 500 height = 800)
        setBackground(CANVAS_BACKGROUND); // set background color (Green)
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g; // cast type Graphic to Graphic2D

        BasicStroke bs = new BasicStroke(LINE_WIDTH); // set pen stroke (The pen stroke is 4)

        g2d.setStroke(bs);
        g2d.drawLine(400, 0, 400, 500); // Draw a vertical line that is at the center of the canvas

        g2d.drawRect(0, 150, 60, 200); //Draw a left inner rectangle

        g2d.drawRect(0, 80, 150, 340); //Draw a left outer rectangle

        g2d.draw(new Ellipse2D.Double(102.5, 247.5, DOT_CIRCLE_RADIUS, DOT_CIRCLE_RADIUS)); 
        /**Draw a filled circle that is in the center between 
        the right side of the inner rectangle and the right side of the outer rectangle in the horizontal direction 
        and is at the center of the right side of the inner rectangle in vertical direction */
        

        g2d.drawRect(740, 150, 60, 200); //Draw a right inner rectangle

        g2d.drawRect(650, 80, 150, 340); //Draw a right outer rectangle

        g2d.draw(new Ellipse2D.Double(692.5, 247.5, DOT_CIRCLE_RADIUS, DOT_CIRCLE_RADIUS)); 
        /**Draw a filled circle that is in the center between
        the right side of the inner rectangle and the right side of the outer rectangle in the horizontal direction 
        and is at the center of the right side of the inner rectangle in vertical direction */

        g2d.setColor(Color.WHITE); // Change color to white

        g2d.draw(new Ellipse2D.Double(350, 200, 100, 100)); // draw the circle at the center horizontally
        



        
        
        
    }
    
}