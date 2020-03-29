package phongam.sithipol.lab8;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PersonFormV9 extends PersonFormV8 implements ListSelectionListener {
    private static final long serialVersionUID = 1L;

    public static void createAndShowGUI() {
        PersonFormV9 PersonFormV9 = new PersonFormV9("Person Form V9");
        PersonFormV9.addComponents();
        PersonFormV9.addListeners();
        PersonFormV9.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public PersonFormV9(String title) {
        super(title);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

    }

    public void addListeners() {
        super.addListeners();
        hobbieslist.addListSelectionListener(new ListSelectionListener() {
            
            @Override
            public void valueChanged(ListSelectionEvent e) {
               if (!e.getValueIsAdjusting()) {
                JOptionPane.showMessageDialog(null, "Selected Hobbies : " + String.join(" ", hobbieslist.getSelectedValuesList()) , "Person Information", JOptionPane.INFORMATION_MESSAGE);
               } 
            }
        });
    }

}