package phongam.sithipol.lab7;

import javax.swing.*;
import java.awt.*;

public class GraphicsMoverV3 extends GraphicsMoverV2 {
    private static final long serialVersionUID = 1L;
    protected JMenu fileMenu;
    protected JMenuItem openitem;
    protected JMenuItem saveitem;
    protected JMenuItem quititem;
    protected ImageIcon openIcon; 
    protected JMenuBar menubar;
    protected Image openimage, newopenimage;

    
    public static void createAndShowGUI() {
        GraphicsMoverV3 GraphicsMoverV3 = new GraphicsMoverV3("Graphic Mover Version3");
        GraphicsMoverV3.addComponents();
        GraphicsMoverV3.addMenu();
        GraphicsMoverV3.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            } 
        });
    }

    public GraphicsMoverV3(String title) {
        super(title);
    }
    // create method addMenu()
    public void addMenu() {
        menubar = new JMenuBar(); // create object from JMenuBar class

        fileMenu = new JMenu("File");   // create object from JMenu class 
        
        saveitem = new JMenuItem("Save"); 
        quititem = new JMenuItem("Quit");
        // line 40-41 is create object from JMenuItem class

        this.openIcon = new ImageIcon(getClass().getResource("image/open.png")); // create object from ImageIcon class 
        this.openimage = openIcon.getImage(); // use method getImage for return Image to openimage 
        this.newopenimage = openimage.getScaledInstance(20, 20, java.awt.Image.SCALE_DEFAULT); // set size image 
        this.openIcon = new ImageIcon(newopenimage); 
        
        openitem = new JMenuItem("Open", openIcon); // add image to openitem 

        this.fileMenu.add(openitem);
        this.fileMenu.add(saveitem);
        this.fileMenu.add(quititem);
        // line 51 - 53 is add components to fileMenu 

        this.menubar.add(fileMenu); // add fileMenu to menubar(JMenuBar)

        this.mainframe.setJMenuBar(menubar); // set menubar to frame 


    }


}