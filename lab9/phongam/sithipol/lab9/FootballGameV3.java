package phongam.sithipol.lab9;

import javax.swing.SwingUtilities;
import java.awt.event.*;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.BorderLayout;

public class FootballGameV3 extends FootballGameV2  {
    private static final long serialVersionUID = 1L;
    protected CanvasDrawerV5 canvasV5;
    protected int min = -2;
    protected int max = 2;
    

    public FootballGameV3(String title) {
        super(title);
        mainframe.setFocusable(true);
        requestFocus();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            } 
        });
    }

    public static void createAndShowGUI() {
        FootballGameV3 footballGameV3 = new FootballGameV3("Football Game V3");
        footballGameV3.addComponents();
        footballGameV3.addMenu();
        footballGameV3.setFrameFeatures();
        footballGameV3.addListeners();
    }


    @Override
    public void addComponents() {
        super.addComponents();
        test = new CanvasDrawerV5();
        mainpanelgraphic.add(test, BorderLayout.CENTER);
        mainframe.add(mainpanelgraphic);
    }
    
    @Override
    public void addListeners() {
        super.addListeners();
        reset_btn.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if (obj == reset_btn) {
            khonkaenScore.setText("0");
            udonScore.setText("0");
            // test.drawBall.x = 400 - 15;
            // test.drawBall.y = 250 - 15;

            // int random_xv = ThreadLocalRandom.current().nextInt(min, max+1);
            // int random_yv = ThreadLocalRandom.current().nextInt(min, max+1);
            // int xv = random_xv;
            // int yv = random_yv;
            // test.drawBall.setXvelocity(xv);
            // test.drawBall.setYvelocity(yv);
            test.resetBall();
            mainpanelgraphic.add(test, BorderLayout.CENTER);
            mainframe.add(mainpanelgraphic);
        }
    }

     
}