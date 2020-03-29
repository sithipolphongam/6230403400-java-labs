package phongam.sithipol.lab8;

import javax.swing.*;
import java.awt.event.*;
import phongam.sithipol.lab6.*;

public class PersonFormV6 extends PersonFormV5 implements  ActionListener {
    private static final long serialVersionUID = 1L;
    protected String typeString;

 public static void createAndShowGUI() {
        PersonFormV6 PersonFormV6 = new PersonFormV6("Person Form V6");
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

    @Override //override method in actionlistener interface
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj.equals(okButton)) {
            handleOkButton();
 
        } // press cancelbuton
        else if (obj == cancelButton) {
            // clear text
                this.name.setText("");
                this.height.setText("");
                this.weight.setText("");
                this.dob.setText("");
                this.noteTA.setText("");

        }

    }

    public void addListeners() { // addlisteners to components
        this.okButton.addActionListener(this);
        this.cancelButton.addActionListener(this);
    }

    public String getInfoFormForm() {
        if  (student.isSelected()) { // getText from radiobutton student to tpyeString
            typeString = student.getText();
        }
        else if (teacher.isSelected()) { // getText from radiobutton teacher to tpyeString
            typeString = teacher.getText();
        }
        return "Name : " + name.getText()
        + "\nHeight (cm) : " + height.getText() 
        + "\nWeight (kg) : " + weight.getText()
        + "\nDate of Birth : " + dob.getText()
        +"\nType : " + typeString 
        + "\nSport : " + boxsport.getSelectedItem().toString()
        + "\nHobbies : " + String.join(" ", hobbieslist.getSelectedValuesList())
        + "\nNote : " + noteTA.getText();
    }
    protected void handleOkButton() {
        String info = getInfoFormForm();
        JOptionPane.showMessageDialog(this, info, "Person Information", JOptionPane.INFORMATION_MESSAGE);
    }
    


}