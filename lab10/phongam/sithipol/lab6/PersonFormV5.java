package phongam.sithipol.lab6;

import javax.swing.ButtonModel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.*;


public class PersonFormV5 extends PersonFormV4 {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    protected Font fontlb;
    protected Font fonttxt;
    protected JTextField addname;
    protected ButtonModel studentSelect;
    protected boolean b;

    protected void initComponent() {
        setFonts();
        setColors();
        setValues();
        
    }

    protected void setFonts() {
        Font fontlb = new Font("Serif", java.awt.Font.PLAIN, 14); // create object from Font class and set Font style and set font size

        namelb.setFont(fontlb);
        heightlb.setFont(fontlb);
        weightlb.setFont(fontlb);
        doblb.setFont(fontlb);
        typelb.setFont(fontlb);
        sportlb.setFont(fontlb);
        hobbies.setFont(fontlb);
        notelb.setFont(fontlb);
        // set font to all label

        Font fonttxt = new Font("Serif", java.awt.Font.BOLD, 14); // create object from Font class and set Font style and set font size
        name.setFont(fonttxt);
        height.setFont(fonttxt);
        weight.setFont(fonttxt);
        dob.setFont(fonttxt);
        // set font to all text field

    }

    protected void setColors() {
        okButton.setForeground(Color.BLUE); // set color of the font to okbutton
        cancelButton.setForeground(Color.RED); // set color of the font to cancelbutton
    }

    protected void setValues() {
        this.name.setText("Manee");
        this.height.setText("160");
        this.weight.setText("55");
        this.dob.setText("02-02-2000");
        this.buttonGroup.setSelected(student.getModel(), true);
        this.boxsport.setSelectedIndex(1);
        this.hobbieslist.setSelectedIndices(new int[] {0,3});
        // line 55-61 is setvalues defalult when run program 
        
       
        
    }

    public static void createAndShowGUI() {
        PersonFormV5 PersonFormV5 = new PersonFormV5("Person Form V5");
        PersonFormV5.addComponents();
        PersonFormV5.addMenus();
        PersonFormV5.setFrameFeatures();
    }

    public PersonFormV5() {
        super();
    }

    public PersonFormV5(String title) {
        super(title);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            } 
        });
    }
    @Override
    protected void addComponents() {
        super.addComponents();
        initComponent();
        
    }

    
}