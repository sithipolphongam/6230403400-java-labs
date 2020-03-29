package phongam.sithipol.lab10;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class PersonFormV14 extends PersonFormV13 {
    private static final long serialVersionUID = 1L;

    public PersonFormV14(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        PersonFormV14 personFormV14 = new PersonFormV14("Person Form V13");
        personFormV14.addComponents();
        personFormV14.addMenus();
        personFormV14.addKeys();
        personFormV14.addListeners();
        personFormV14.setFrameFeatures();
        //personFormV14.initComponents();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    @Override
    public void saveFile() {
            JFileChooser filechooser = new JFileChooser();
            filechooser.setDialogTitle("Save");
            int selectedButtonSave = filechooser.showSaveDialog(null);
            if (selectedButtonSave == JFileChooser.APPROVE_OPTION) {
                try {
                    File selectedFile = filechooser.getSelectedFile();
                    FileOutputStream file_output = new FileOutputStream(selectedFile);
                    ObjectOutput object_output = new ObjectOutputStream(file_output);

                    String fileName = filechooser.getName(selectedFile);
                    JOptionPane.showMessageDialog ( null, "Saving file " + fileName);
                    String text_save = "";
                    for (Person person : person_list) {
                        text_save += person + "\n";
                    }
                    object_output.writeObject(text_save);
                    file_output.close();
                    object_output.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (selectedButtonSave == JFileChooser.CANCEL_OPTION) {
                JOptionPane.showMessageDialog ( null, "Save command canceled by user.");
            }
    }

    @Override
    public void openFile() {
            JFileChooser filechooser = new JFileChooser();
            filechooser.setDialogTitle("Open");
            int selectedButtonOpen = filechooser.showDialog(null, "Open");
            if (selectedButtonOpen == JFileChooser.APPROVE_OPTION) {
                try {
                    File selectedFile = filechooser.getSelectedFile();
                    FileInputStream file_input = new FileInputStream(selectedFile);
                    ObjectInputStream object_input = new ObjectInputStream(file_input);
                    JOptionPane.showMessageDialog(this, object_input.readObject());
                    file_input.close();
                    object_input.close();
                    
                } catch (Exception e) {
                    System.out.println("*********error*********");
                }
            }
            else if (selectedButtonOpen == JFileChooser.CANCEL_OPTION) {
                JOptionPane.showMessageDialog ( null, "Open command canceled by user.");
            }
    }
}