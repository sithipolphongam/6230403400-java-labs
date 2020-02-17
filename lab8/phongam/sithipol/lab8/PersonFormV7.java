package phongam.sithipol.lab8;
import javax.swing.*;
import java.awt.event.*;

public class PersonFormV7 extends PersonFormV6 implements ActionListener {

    private static final long serialVersionUID = 1L;

    public static void createAndShowGUI() {
        PersonFormV7 PersonFormV7 = new PersonFormV7("Person Form V1");
        PersonFormV7.addComponents();
        PersonFormV7.addListeners();
        PersonFormV7.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            } 
        });
}
    public PersonFormV7(String title) { 
        super(title);
    }

    @Override 
    public void actionPerformed(ActionEvent e) {  
        super.actionPerformed(e);
        if (e.getSource() == student) {
            JOptionPane.showMessageDialog(this, "Type : student has been selected", "Person Information", JOptionPane.INFORMATION_MESSAGE);
        } 

        else if (e.getSource() == teacher) {  
            JOptionPane.showMessageDialog(this, "Type : teacher has been selected", "Person Information" , JOptionPane.INFORMATION_MESSAGE);
        }


    }

    public void addListeners() { 
        super.addListeners();
        student.addActionListener(this);
        teacher.addActionListener(this);
    }
    
}