package phongam.sithipol.lab10;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.event.*;


public class PersonFormV13 extends PersonFormV12 {
    private static final long serialVersionUID = 1L;
    protected String message = "";

    protected double MIN_HEIGHT = 100, MAX_HEIGHT = 250, MIN_WEIGHT = 40, MAX_WEIGHT = 150, 
    MIN_DAY = 1, MAX_DAY = 31, MIN_MONTH = 1, MAX_MONTH = 12, MIN_YEAR = 1900, MAX_YEAR = 2010;

    public PersonFormV13(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        PersonFormV13 personFormV13 = new PersonFormV13("Person Form V13");
        personFormV13.addComponents();
        personFormV13.addMenus();
        personFormV13.addKeys();
        personFormV13.addListeners();
        personFormV13.setFrameFeatures();
        //personFormV13.initComponents();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == okButton) {
            message = "";
           if (checkInputUser()) {
                JOptionPane.showMessageDialog(this, message, "Message", JOptionPane.INFORMATION_MESSAGE);
                return;
           }
        }
        super.actionPerformed(e);

    }

    public void checkDecimalException(String test, String name, double min_val, double max_val) {
        try {
            double test_double = Double.parseDouble(test);
            if (test_double < min_val || test_double > max_val) {
                message += "Valid values for " + name + " are [" + String.format("%.02f", min_val) + "," + String.format("%.02f", max_val) + "]\n";
            }
        } catch (NumberFormatException e) {
            message += "Please enter only numeric input for " + name + ". \n";
        }
    }

    public boolean checkInputUser() {
        if (name.getText().equals("")) {
            message += "please enter name." + "\n";
        }

        

        checkDecimalException(height.getText(), "height", MIN_HEIGHT, MAX_HEIGHT);
        checkDecimalException(weight.getText(), "weight", MIN_WEIGHT, MAX_HEIGHT);


        String dayMounthYear[] = dob.getText().split("-");
        if (dayMounthYear.length != 3) {
            message += "please enter date." + "\n";
        }
        else {
            checkDecimalException(dayMounthYear[0], "day", MIN_DAY, MAX_DAY);
            checkDecimalException(dayMounthYear[1], "month", MIN_MONTH, MAX_MONTH);
            checkDecimalException(dayMounthYear[2], "year", MIN_YEAR, MAX_YEAR);
        }

        if (message == "") {
            return false;
        }
        return true;

    }


    
}