package phongam.sithipol.lab8;
import javax.swing.*;
import java.awt.event.*;

public class PersonFormV7 extends PersonFormV6 {

    private static final long serialVersionUID = 1L;

    public static void createAndShowGUI() {
        PersonFormV7 PersonFormV7 = new PersonFormV7("Person Form V7");
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

    @Override  //override method in actionlistener interface
    public void actionPerformed(ActionEvent e) {  
        Object obj = e.getSource();
        super.actionPerformed(e); // use keyword super to inherit method actionPerfomed from PersonFormV6 class
        if (obj == student) { // choose student radiobutton ==> showmessagedialog 
            JOptionPane.showMessageDialog(this, "Type : student has been selected", "Person Information", JOptionPane.INFORMATION_MESSAGE);
        } 

        else if (obj == teacher) {  // choose teacher radiobutton ==> showmessagedialog 
            JOptionPane.showMessageDialog(this, "Type : teacher has been selected", "Person Information" , JOptionPane.INFORMATION_MESSAGE);
        }


    }

    public void addListeners() {  // addlistener to components
        super.addListeners();
        student.addActionListener(this);
        teacher.addActionListener(this);
    }
    
}