package phongam.sithipol.lab6;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
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
    protected JRadioButton student, teacher;
    protected JPanel allpanelV1, mainpanelV1, typepanelleft, typepanelright;
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
        this.name = new JTextField(15);
        this.height = new JTextField(15);
        this.weight = new JTextField(15);
        this.dob = new JTextField(15);

        this.namelb = new JLabel("Name:");
        this.heightlb = new JLabel("Height (cm.):");
        this.weightlb = new JLabel("Weight (kg.):");
        this.doblb = new JLabel("Date of birth(eg.,31-01-1990):");
        this.typelb = new JLabel("Type:");

        this.allpanelV1 = new JPanel();
        this.mainpanelV1 = new JPanel();
        this.typepanelleft = new JPanel(new BorderLayout());
        this.typepanelright = new JPanel(new BorderLayout());

        this.student = new JRadioButton("Student");
        this.teacher = new JRadioButton("Teacher");

        this.buttonGroup = new ButtonGroup();
        this.buttonGroup.add(student);
        this.buttonGroup.add(teacher);




        allpanelV1.setLayout(new BoxLayout(allpanelV1, BoxLayout.Y_AXIS));
        mainpanelV1.setLayout(new GridLayout(0,2));
        this.mainpanelV1.add(namelb);
        this.mainpanelV1.add(name);
        this.mainpanelV1.add(heightlb);
        this.mainpanelV1.add(height);
        this.mainpanelV1.add(weightlb);
        this.mainpanelV1.add(weight);
        this.mainpanelV1.add(doblb);
        this.mainpanelV1.add(dob);
        this.typepanelleft.add(typelb, BorderLayout.WEST);
        this.mainpanelV1.add(typepanelleft);
        this.mainpanelV1.add(typepanelright);
        this.typepanelright.add(student, BorderLayout.WEST);
        this.typepanelright.add(teacher, BorderLayout.CENTER);
        
        this.allpanelV1.add(mainpanelV1);
        this.mainpanel.add(allpanelV1, BorderLayout.NORTH);
       // this.mainpanel.add(northpanel, BorderLayout.NORTH);
       // this.mainframe.add(mainpanel);
        
        



    }
    
}