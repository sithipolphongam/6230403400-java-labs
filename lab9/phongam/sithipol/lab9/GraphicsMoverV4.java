package phongam.sithipol.lab9;

import javax.swing.SwingUtilities;
import java.awt.*;
import phongam.sithipol.lab7.*;

public class GraphicsMoverV4 extends GraphicsMoverV3 {
    private static final long serialVersionUID = 1L;

    public static void createAndShowGUI() {
        GraphicsMoverV4 graphicsMoverV4 = new GraphicsMoverV4("Graphic Mover Version4");
        graphicsMoverV4.addComponents();
        graphicsMoverV4.addMenu();
        graphicsMoverV4.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            } 
        });
    }
    public GraphicsMoverV4(String title) {
        super(title);
    }

    public void addComponents() {
        super.addComponents();
        moveup_btn.setText("Move Left up");
        movedown_btn.setText("Move Left down");
        moveleft_btn.setText("Move Right left");
        moveright_btn.setText("Move Right right");
        CanvasDrawerV2 test = new CanvasDrawerV2();
        mainpanelgraphic.add(test, BorderLayout.CENTER);
        mainframe.add(mainpanelgraphic);

    }
}