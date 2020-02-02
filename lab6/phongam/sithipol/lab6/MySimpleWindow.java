
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
    protected JFrame title;
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
        this.title = new JFrame("My Simple Window Title");
    }

    public MySimpleWindow(String title) {
        this.title = new JFrame(title);
    }

    protected void addComponents() {
        this.mainpanel = new JPanel();
        this.southpanel = new JPanel();
        this.northpanel = new JPanel();
        this.centerpanel = new JPanel();
        this.okButton = new JButton("OK");
        this.cancelButton = new JButton("Cancel");
        // line 36-41 is create components
        this.southpanel.add(cancelButton);
        this.southpanel.add(okButton);
        this.mainpanel.add(southpanel, BorderLayout.SOUTH);
        this.title.add(mainpanel, BorderLayout.SOUTH);
        // add to fram(title)


    }
 
    protected void setFrameFeatures() {
        this.title.pack();
        this.title.setLocationRelativeTo(null); //center of  display
        this.title.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.title.setVisible(true);
    }


public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
}

}

