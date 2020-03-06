/* Author: sithipol phongam
* ID: 623040340-0
* Sec: 1
* Date: March 6, 2020 */

package phongam.sithipol.lab9;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.SwingUtilities;
public class FootballGameV2 extends FootballGameV1 implements KeyListener, ActionListener {
    protected CanvasDrawerV4 test;
    protected Object obj;
    private static final long serialVersionUID = 1L;

    public FootballGameV2(String title) {
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
        FootballGameV2 footballGameV2 = new FootballGameV2("Football Game V2");
        footballGameV2.addComponents();
        footballGameV2.addMenu();
        footballGameV2.setFrameFeatures();
        footballGameV2.addListeners();
    }
    // add listener 
    public void addListeners() {
        moveup_btn.addActionListener(this);
        movedown_btn.addActionListener(this);
        moveleft_btn.addActionListener(this);
        moveright_btn.addActionListener(this);
        mainframe.addKeyListener(this);
        mainpanelgraphic.addKeyListener(this);
    }

    @Override
    public void addComponents() {
        super.addComponents();
        test = new CanvasDrawerV4();
        mainpanelgraphic.add(test, BorderLayout.CENTER);
        mainframe.add(mainpanelgraphic);
    }

    // override abstract method from ActionListener interface
    @Override 
    public void actionPerformed(ActionEvent e) {  
        super.actionPerformed(e);
        obj = e.getSource();
        if (obj == moveup_btn) {
            test.keeperLeft.moveUp();
        }
        else if (obj == movedown_btn) {
            test.keeperLeft.moveDown();
        }
        else if (obj == moveleft_btn) {
            test.keeperRight.moveUp();
        }
        else if (obj == moveright_btn) {
            test.keeperRight.moveDown();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }
    // override abstract method from KeyListener interface
    @Override
    public void keyPressed(KeyEvent e) {
        int intkey = e.getKeyCode();
        if (intkey == KeyEvent.VK_W) {
            test.keeperLeft.moveUp();
        }
        else if (intkey == KeyEvent.VK_S) {
            test.keeperLeft.moveDown();
        }
        else if (intkey == KeyEvent.VK_UP) {
            test.keeperRight.moveUp();
        }
        else if (intkey == KeyEvent.VK_DOWN) {
            test.keeperRight.moveDown();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
}