import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class PersonFormV2 extends MySimpleWindow {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    protected JLabel sportlb, notelb;
    protected JPanel sportpanel, notelbpanel, notetextpanel, mainpanelV2;
    protected JComboBox boxsport;
    protected JTextArea noteTA;

    public static void createAndShowGUI() {
        PersonFormV1 PersonFormV1 = new PersonFormV1("Person Form V1");
        PersonFormV1.addComponents();
        PersonFormV1.setFrameFeatures();
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

    protected void addComponents() {
        super.addComponents();
        sportlb = new JLabel("Sport:");
        notelb = new JLabel("Note:");
        noteTA = new JTextArea();
        sportpanel = new JPanel();
        notelbpanel = new JPanel();
        mainpanel = new JPanel();
        String[] listOfSport = {"Running", "Swimming", "Tennis"};
        boxsport = new JComboBox<>(listOfSport);

        noteTA = new JTextArea(3, 35);
        noteTA.setLineWrap(true);
        noteTA.setWrapStyleWord(true);
        noteTA.setRows(2);
        JScrollPane scrollpane = new JScrollPane(noteTA);

        this.notelbpanel.add(notelb);

        this.sportpanel.add(sportlb);



        this.mainpanelV2.add(sportpanel, BorderLayout.NORTH);
        this.mainpanelV2.add(notelbpanel, BorderLayout.SOUTH);
        this.title.add(mainpanelV2, BorderLayout.CENTER);



    }
    
}