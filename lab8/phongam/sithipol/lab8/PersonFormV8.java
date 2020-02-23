package phongam.sithipol.lab8;
import java.awt.event.*;
import javax.swing.*;
public class PersonFormV8 extends PersonFormV7 implements ActionListener {
    private static final long serialVersionUID = 1L;

    public static void createAndShowGUI() {
        PersonFormV8 PersonFormV8 = new PersonFormV8("Person Form V8");
        PersonFormV8.addComponents();
        PersonFormV8.addListeners();
        PersonFormV8.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            } 
        });
}
    public PersonFormV8(String title) { 
        super(title);
    }

    @Override //override method in actionlistener interface
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        super.actionPerformed(e); // use keyword super to inherit method actionPerfomed from PersonFormV7 class
        if (obj == boxsport) {  // user is select choice in boxsport (JComboBOX) ==> showmessagedialog 
            JOptionPane.showMessageDialog(this, "Your sport is now changed to " + boxsport.getSelectedItem().toString(), "Person Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void addListeners() { // addlistener to components
        super.addListeners();
        boxsport.addActionListener(this);
    }

}