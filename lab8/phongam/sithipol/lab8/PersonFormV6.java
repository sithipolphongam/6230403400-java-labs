package phongam.sithipol.lab8;

import javax.swing.*;
import java.awt.event.*;
import phongam.sithipol.lab6.*;

public class PersonFormV6 extends PersonFormV5 implements  ActionListener {
    private static final long serialVersionUID = 1L;
    protected String typeString;

 public static void createAndShowGUI() {
        PersonFormV6 PersonFormV6 = new PersonFormV6("Person Form V1");
        PersonFormV6.addComponents();
        PersonFormV6.addListeners();
        PersonFormV6.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            } 
        });
}

    public PersonFormV6(String title) {
        super(title);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // JRadioButton testTpye;
        if (e.getSource() == okButton) {
            if  (student.isSelected()) {
                typeString = student.getText();
            }
            else if (teacher.isSelected()) {
                typeString = teacher.getText();
            }

            JOptionPane.showMessageDialog(this,"Name : " + name.getText()
                                               + "\nHeight (cm) : " + height.getText() 
                                               + "\nWeight (kg) : " + weight.getText()
                                               + "\nDate of Birth : " + dob.getText()
                                               +"\nType : " + typeString 
                                               + "\nSport : " + boxsport.getSelectedItem().toString()
                                               + "\nHobbies : " + String.join(" ", hobbieslist.getSelectedValuesList())
                                               + "\nNote : " + noteTA.getText(), "Person Information", JOptionPane.INFORMATION_MESSAGE);
 
        }
        else if (e.getSource() == cancelButton) {

                this.name.setText("");
                this.height.setText("");
                this.weight.setText("");
                this.dob.setText("");
                this.noteTA.setText("");

        }

    }

    public void addListeners() {
        this.okButton.addActionListener(this);
        this.cancelButton.addActionListener(this);
    }
    


}