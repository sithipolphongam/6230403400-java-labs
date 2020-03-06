package phongam.sithipol.lab9;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.SwingUtilities;

public class FootballGameV1 extends GraphicsMoverV4 {
    private static final long serialVersionUID = 1L;

    public FootballGameV1(String title) {
        super(title);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            } 
        });
    }

    public static void createAndShowGUI() {
        FootballGameV1 footballGameV1 = new FootballGameV1("Football Game V1");
        footballGameV1.addComponents();
        footballGameV1.addMenu();
        footballGameV1.setFrameFeatures();
    }

    public void addComponents() {
        super.addComponents();
        CanvasDrawerV3 test = new CanvasDrawerV3();
        mainpanelgraphic.add(test, BorderLayout.CENTER);
        mainframe.add(mainpanelgraphic);
      
    }

	public void actionPerformed(ActionEvent e) {
        
	}

}