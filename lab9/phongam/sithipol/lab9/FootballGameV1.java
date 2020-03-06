/* Author: sithipol phongam
* ID: 623040340-0
* Sec: 1
* Date: March 6, 2020 */
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
        CanvasDrawerV3 test = new CanvasDrawerV3(); // create object from CanvasDrawerV3 class.
        mainpanelgraphic.add(test, BorderLayout.CENTER); // add test(object from CanvasDrawerV3 class) to mainpanelgraphic.
        mainframe.add(mainpanelgraphic); // add mainpanelgraphic to mainframe.
      
    }

	public void actionPerformed(ActionEvent e) {
        
	}

}