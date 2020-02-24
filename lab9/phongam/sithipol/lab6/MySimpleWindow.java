package phongam.sithipol.lab6;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MySimpleWindow extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    protected JFrame mainframe;
    protected JButton okButton;
    protected JButton cancelButton;
    protected JPanel mainpanel,northpanel,southpanel,westpanel, eastpanel,centerpanel;;


    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
        // use method addComponents and setFrameFeatures


    }

    public MySimpleWindow() {
        this.mainframe = new JFrame("My Simple Window Title");
    }

    public MySimpleWindow(String title) {
        this.mainframe = new JFrame(title);
    }

    protected void addComponents() {
        this.mainpanel = new JPanel(new BorderLayout());
        this.okButton = new JButton("OK");
        this.cancelButton = new JButton("Cancel");
        this.southpanel = new JPanel();
        this.northpanel = new JPanel();
        //this.mainframe.setLayout();
        //line 36-41 is create components
        this.southpanel.add(cancelButton);
        this.southpanel.add(okButton);
        
        this.mainpanel.add(southpanel, BorderLayout.SOUTH);
        this.mainframe.add(mainpanel);
        
        // add to fram(title)

    }
 
    protected void setFrameFeatures() {
        this.mainframe.pack();
        this.mainframe.setLocationRelativeTo(null); //center of  display
        this.mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.mainframe.setVisible(true);
    }


public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
}

}