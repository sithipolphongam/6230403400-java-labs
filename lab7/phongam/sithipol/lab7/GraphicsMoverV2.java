package phongam.sithipol.lab7;

import javax.swing.*;
import java.awt.*;

public class GraphicsMoverV2 extends GraphicsMoverV1 {
  
    private static final long serialVersionUID = 1L;
    protected JPanel labelpanel;
    protected JLabel khonkaenlabel, udonlabel;
    protected JTextField khonkaenScore, udonScore;

    public static void createAndShowGUI() {
        GraphicsMoverV2 GraphicsMoverV2 = new GraphicsMoverV2("Graphic Mover Version2");
        GraphicsMoverV2.addComponents();
        GraphicsMoverV2.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            } 
        });
    }

    public GraphicsMoverV2(String title) {
        super(title);
    }

    @Override
    public void addComponents() {
        super.addComponents(); // use keyword super for inherit method addComponents from GraphicMoverV1 class

        labelpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT)); // create object from JPanel class 

        khonkaenlabel = new JLabel("Khonkaen");
        udonlabel = new JLabel("Udon Thani");
        // line 36 and 37 is create object from JLabel class 

        khonkaenScore = new JTextField();
        udonScore = new JTextField();
        // line 40 and 42 is create object from JTextField class

        Font font = new Font("Serif", java.awt.Font.BOLD, 20); // create object from Font class and set font 
        khonkaenScore.setFont(font); // set font to khonkaenScore
        udonScore.setFont(font); // set font to udonScore

        khonkaenScore.setText("3"); 
        udonScore.setText("1");
        // line 48 and 49 is set text to textfiled (khonkaenScore and udonScore)

        khonkaenlabel.setForeground(Color.BLUE);
        udonlabel.setForeground(Color.RED);
        // set text color 

        this.labelpanel.add(khonkaenlabel);
        this.labelpanel.add(khonkaenScore);
        this.labelpanel.add(udonlabel);
        this.labelpanel.add(udonScore);
        // line 56-59 is and components to labelpanel 

        this.mainpanelgraphic.add(labelpanel, BorderLayout.NORTH);
        // add labelpanel to mainpanelgraphic (at North)
        


    }
}