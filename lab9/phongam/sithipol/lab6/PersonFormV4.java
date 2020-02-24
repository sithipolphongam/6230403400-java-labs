package phongam.sithipol.lab6;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class PersonFormV4 extends PersonFormV3 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    protected ImageIcon newIcon;
    protected JMenuItem subRed, subGreen, subBlue, sub16, sub20, sub24;
    protected JMenu coloritem2, sizeitem2;



    public static void createAndShowGUI() {
        PersonFormV4 PersonFormV4 = new PersonFormV4("Person Form V4");
        PersonFormV4.addComponents();
        PersonFormV4.addMenus();
        PersonFormV4.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            } 
        });
    }

    public PersonFormV4() {
        super();
    }

    public PersonFormV4(String title) {
        super(title);
    }

    @Override
    protected void addMenus() {
        super.addMenus();
        updateMenuIcon();
        addSubMenu();
    }

    protected void updateMenuIcon() {
        this.newIcon = new ImageIcon(new ImageIcon("C:/Users/USER/Desktop/lab6/phongam/sithipol/lab6/image/new1.png")
        .getImage().getScaledInstance(20, 20,java.awt.Image.SCALE_DEFAULT)); // create object from ImageIcon and import image and setsize 

        this.newitem = new JMenuItem("NEW", newIcon); // add imageicon to newitem(JMenuItem) 
        this.filemenu.removeAll(); // remove menu item all on filemenu
        this.filemenu.add(newitem);
        this.filemenu.add(openitem);
        this.filemenu.add(saveitem);
        this.filemenu.add(exititem);
        // add new menu item again
        
        this.menubar.add(filemenu);
        this.menubar.add(configmenu);
        // add menu to menubar

        this.mainframe.setJMenuBar(menubar);
        //set menubar to frame
    
    }

    protected void addSubMenu() {
        subRed = new JMenuItem("Red");
        subGreen = new JMenuItem("Green");
        subBlue = new JMenuItem("Blue");
        sub16 = new JMenuItem("16");
        sub20 = new JMenuItem("20");
        sub24 = new JMenuItem("24");
        // create object from JMenuItem class
        
        this.configmenu.removeAll(); // remove menu item all on configmenu
        coloritem2 = new JMenu("Color");
        sizeitem2 = new JMenu("Size");
        // create object from JMenu class

        this.configmenu.add(coloritem2);
        this.configmenu.add(sizeitem2);
        this.coloritem2.add(subRed);
        this.coloritem2.add(subGreen);
        this.coloritem2.add(subBlue);
        this.sizeitem2.add(sub16);
        this.sizeitem2.add(sub20);
        this.sizeitem2.add(sub24);
        //line 83-90 is add menu item to menu

        this.menubar.add(configmenu); // add menu to menubar
        this.mainframe.setJMenuBar(menubar); // set menubar to frame
    
    }

    @Override
    protected void addComponents() {
        super.addComponents();
    }
}


// ************** เหลือทำรูปให้เล็ก กับ คลิกไ้ 2 รอบ **************