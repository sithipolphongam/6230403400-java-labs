package phongam.sithipol.lab6;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class PersonFormV2 extends PersonFormV1 {

    private static final long serialVersionUID = 1L;
    protected JLabel sportlb, notelb;
    protected JPanel allsportpanel,sportpanel, notepanel, sportboxpanel, allpanelV2, betweenpanel;
    protected JComboBox<String> boxsport;
    protected JTextArea noteTA;

    public static void createAndShowGUI() {
        PersonFormV2 PersonFormV2 = new PersonFormV2("Person Form V2");
        PersonFormV2.addComponents();
        PersonFormV2.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            } 
        });
    }
    public PersonFormV2() {
        super();
    }
    public PersonFormV2(String title) {
        super(title);
    }
    @Override
    protected void addComponents() {
        super.addComponents();
        //create object from JLabel class
        sportlb = new JLabel("Sport:");
        notelb = new JLabel("Note:");

        //create object from JPanel class
        sportpanel = new JPanel();
        sportboxpanel = new JPanel();
        notepanel = new JPanel();
        allpanelV2 = new JPanel();
        allsportpanel = new JPanel(new BorderLayout());
        betweenpanel = new JPanel();

        String[] listOfsport = {"Running", "Swimming", "Tennis"}; //Create a list of sports.
        boxsport = new JComboBox<>(listOfsport); // add list of sport to JcomboBox.

        //set Text
        noteTA = new JTextArea(3, 35);
        noteTA.setLineWrap(true);
        noteTA.setWrapStyleWord(true);
        noteTA.setRows(2);
        this.noteTA.setText("21st Century skills includeCritical thinking, Creativity, Collaboration, Communication, etc.");

        JScrollPane scroll = new JScrollPane(noteTA); // create scrollpane to textarea.

        this.allpanelV2.setLayout(new BoxLayout(allpanelV2, BoxLayout.Y_AXIS));
        this.notepanel.setLayout(new BorderLayout());
        this.sportpanel.setLayout(new BorderLayout());
        this.sportboxpanel.setLayout(new BorderLayout());
        this.betweenpanel.setLayout(new GridLayout(0, 2));
        this.allsportpanel.setLayout(new GridLayout(0, 2));
        // line 68-73 is setLayout to panel 

        this.sportpanel.add(sportlb, BorderLayout.WEST);
        this.sportboxpanel.add(boxsport, BorderLayout.CENTER);
        this.notepanel.add(notelb, BorderLayout.NORTH);
        this.notepanel.add(scroll, BorderLayout.SOUTH);
        // line 76-79 is add components(label and combobox) to panel

        this.allsportpanel.add(sportpanel);
        this.allsportpanel.add(sportboxpanel);
        this.allpanelV2.add(allsportpanel);
        this.allpanelV2.add(betweenpanel);
        this.allpanelV2.add(notepanel);
        //line 80-84 is add subpanel of PersonFormV2 to mainpaenl of V2 (allpanelV2).

        this.mainpanel.add(allpanelV2, BorderLayout.CENTER); // add allpanelV2 to mainpanel.

    }
    
}