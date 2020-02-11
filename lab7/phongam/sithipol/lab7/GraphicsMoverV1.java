package phongam.sithipol.lab7;

import javax.swing.*;
import java.awt.*;
import javax.swing.SwingUtilities;
import phongam.sithipol.lab6.*;
public class GraphicsMoverV1  extends MySimpleWindow {

    private static final long serialVersionUID = 1L;
    protected JPanel mainpanelgraphic;
    protected JButton moveup_btn, movedown_btn, moveleft_btn, moveright_btn, reset_btn;
    
    public static void createAndShowGUI() {
        GraphicsMoverV1 GraphicsMoverV1 = new GraphicsMoverV1("Graphic Mover Version1");
        GraphicsMoverV1.addComponents();
        GraphicsMoverV1.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            } 
        });
    }
    public GraphicsMoverV1() {
        super();
    }
    public GraphicsMoverV1(String title) {
        super(title);
    }

    @Override
    public void addComponents() {
        super.addComponents(); // use keyword super for inherit method addComponents from MySimpleWindow class
        this.mainpanelgraphic = new JPanel(new BorderLayout()); // set Layout (use BorderLayout)

        this.moveup_btn = new JButton("Move up");
        this.movedown_btn = new JButton("Move down");
        this.moveleft_btn = new JButton("Move left");
        this.moveright_btn = new JButton("Move right");
        //line 38-41 is create object from JButton class 

        this.mainpanel.removeAll(); // remove components from mainpanel
        this.mainpanel.setLayout(new FlowLayout()); // setLayout (FlowLayout)

        CanvasDrawerV1 test = new CanvasDrawerV1(); // create object from CanvasDrawerV1 class

        this.mainpanel.add(moveup_btn);
        this.mainpanel.add(moveup_btn);
        this.mainpanel.add(movedown_btn);
        this.mainpanel.add(moveleft_btn);
        this.mainpanel.add(moveright_btn);
        // add button components to mainpanel
        
        this.mainpanelgraphic.add(test, BorderLayout.CENTER); // add test to mainpanelgraphic (at center)
        this.mainpanelgraphic.add(mainpanel, BorderLayout.SOUTH); // add mainpanel to mainpanelgraphic (at south)
        
        this.mainframe.add(mainpanelgraphic); // add mainpanelgraphic(all component on GraphicMoverV1) to mainframe 
        
}
}