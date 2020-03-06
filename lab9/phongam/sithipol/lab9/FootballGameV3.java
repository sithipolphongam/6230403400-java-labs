/* Author: sithipol phongam
* ID: 623040340-0
* Sec: 1
* Date: March 6, 2020 */
package phongam.sithipol.lab9;
import javax.swing.SwingUtilities;
import java.awt.event.*;
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

    // override abstract method from ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        if (obj == reset_btn) {
            khonkaenScore.setText("0");
            udonScore.setText("0");
            test.resetBall();
            mainpanelgraphic.add(test, BorderLayout.CENTER);
            mainframe.add(mainpanelgraphic);
        }
    }

     
}