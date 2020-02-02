import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class PersonFormV1 extends MySimpleWindow {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    protected JLabel namelb, heightlb, weightlb, doblb, typelb;
    protected JTextField name, height, weight, dob;
    protected JRadioButton student ,teacher;
    protected JPanel mainpanelV1, labelandTextFieldpanel, radiobtnpanel, addradiopanel;
    protected ButtonGroup buttonGroup;

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
    public PersonFormV1() {
        super();
    }
    public PersonFormV1(String title) {
        super(title);
    }
    // add component
    protected void addComponents() {
        super.addComponents();
        this.addradiopanel = new JPanel();
        this.labelandTextFieldpanel = new JPanel(new GridLayout());
        this.radiobtnpanel = new JPanel();
        this.mainpanelV1 = new JPanel(new BorderLayout());

        this.namelb = new JLabel("Name:");
        this.heightlb= new JLabel("Height (cm.):");
        this.weightlb = new JLabel("Weight (kg.):");
        this.doblb = new JLabel("Date of birth(eg.,31-01-1990):");
        this.typelb= new JLabel("Type:");

        this.name = new JTextField(15);
        this.height = new JTextField(15);
        this.weight = new JTextField(15);
        this.dob= new JTextField(15);

        this.student = new JRadioButton("Student");
        this.teacher = new JRadioButton("Teacher");
        // line 44-61 is create components

        this.radiobtnpanel.setLayout(new BorderLayout());
        this.radiobtnpanel.add(typelb, BorderLayout.WEST);
        this.addradiopanel.add(student, BorderLayout.EAST);
        this.addradiopanel.add(teacher, BorderLayout.EAST);
        this.radiobtnpanel.add(addradiopanel, BorderLayout.EAST);

        // add label and text to labelandTextFieldpanel
        this.labelandTextFieldpanel.add(namelb);
        this.labelandTextFieldpanel.add(name);
        this.labelandTextFieldpanel.add(heightlb);
        this.labelandTextFieldpanel.add(height);
        this.labelandTextFieldpanel.add(weightlb);
        this.labelandTextFieldpanel.add(weight);
        this.labelandTextFieldpanel.add(doblb);
        this.labelandTextFieldpanel.add(dob);
        this.labelandTextFieldpanel.setLayout(new GridLayout(4,2)); // Layoutmanager is GridLayout 4 rows 2 columns

        this.mainpanelV1.add(radiobtnpanel, BorderLayout.SOUTH);
        this.mainpanelV1.add(labelandTextFieldpanel, BorderLayout.NORTH);

        // add mainpanel V1 to fram (title)
        this.title.add(mainpanelV1, BorderLayout.NORTH);

        

        
        
        



    }
    
}