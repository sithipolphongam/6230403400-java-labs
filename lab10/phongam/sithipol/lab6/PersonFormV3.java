package phongam.sithipol.lab6;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

public class PersonFormV3 extends PersonFormV2 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
        protected JMenuBar menubar;
        protected JMenu filemenu, configmenu;
        protected JMenuItem newitem, saveitem, openitem, exititem, coloritem, sizeitem;
        protected JLabel hobbies;
        protected JPanel hobbieslbpanel, hoppieslistpanel, allhobbies;
        protected JList<String> hobbieslist;
    
    public static void createAndShowGUI() {
        PersonFormV3 PersonFormV3 = new PersonFormV3("Person Form V3");
        PersonFormV3.addComponents();
        PersonFormV3.addMenus();
        PersonFormV3.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            } 
        });
    }

    public PersonFormV3() {
        super();
    }

    public PersonFormV3(String title) {
        super(title);
    }
    // add menu method
    protected void addMenus() {
         menubar = new JMenuBar(); //create object from JMenuBar class

         filemenu = new JMenu("File"); 
         configmenu = new JMenu("Config");
        //create object from JMenu class


         newitem = new JMenuItem("New");
         openitem = new JMenuItem("Open");
         saveitem = new JMenuItem("Save");
         exititem = new JMenuItem("Exit");
         //create object from JMenuItem class ==> menu item in file menu

         coloritem = new JMenuItem("Color");
         sizeitem = new JMenuItem("Size");
         //create object from JMenuItem class ==? menu item in config menu

        
        this.filemenu.add(newitem);
        this.filemenu.add(openitem);
        this.filemenu.add(saveitem);
        this.filemenu.add(exititem);
        // add menu item to menu(add to file menu)
        
        this.configmenu.add(coloritem);
        this.configmenu.add(sizeitem);
        // add menu item to menu(add to config menu)

        this.menubar.add(filemenu);
        this.menubar.add(configmenu);
        // addd menu to menu bar

        this.mainframe.setJMenuBar(menubar);
        // set menu bar to fram
        
    }
    @Override
    protected void addComponents() {
        super.addComponents(); // use keyword super to inherit method addComponents form PersonFormV2

        this.hobbies = new JLabel("Hobbies:"); //create object from JLabel class

        this.hobbieslbpanel = new JPanel();
        this.hoppieslistpanel = new JPanel();
        this.allhobbies = new JPanel();
        //create object from JPanel class 

        this.allhobbies.setLayout(new BorderLayout()); // set Layout to BorderLayout

        String[] list = {"Reading", "Traveling" , "Cooking", "Photography"};  // create list of hobbies
        this.hobbieslist = new JList<String>(list); // add list to hobbieslist (JList)
        this.hobbieslist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // single interval selection

        this.betweenpanel.add(hobbies);
        this.betweenpanel.add(hobbieslist); 
        // add all of hobbies panel to between panel (between panel is a panel in PersonFormV2 in between note panel and sport panel)
        

    }
}