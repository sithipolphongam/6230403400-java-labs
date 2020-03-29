package phongam.sithipol.lab10;

import java.awt.event.*;
import java.io.File;

import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

import javax.swing.*;
import javax.swing.JColorChooser;
import java.awt.*;

import phongam.sithipol.lab8.PersonFormV10;

public class PersonFormV11 extends PersonFormV10 {
    protected JMenuItem subCustom;
    //private Color current; 
    private static final long serialVersionUID = 1L;

    public static void createAndShowGUI() {
        PersonFormV11 personFormV11 = new PersonFormV11("Person Form V11");
        personFormV11.addComponents();
        personFormV11.addMenus();
        personFormV11.addKeys();
        personFormV11.addListeners();
        personFormV11.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public PersonFormV11(String title) {
        super(title);
    }

    public void addMenus() {
        super.addMenus();
        addSubMenu();
    }

    public void addSubMenu() {
        super.addSubMenu();
        subCustom = new JMenuItem("Custom");
        this.coloritem2.add(subCustom);
        this.configmenu.add(coloritem2);
        

    }

    @Override //override method in actionlistener interface
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        super.actionPerformed(e); 
        if (obj == subCustom) {
            Color initialcolor=name.getForeground();    
            Color color=JColorChooser.showDialog(this,"Choose color",initialcolor);    
            
            name.setForeground(color);
            weight.setForeground(color);
            height.setForeground(color);
            dob.setForeground(color);
            noteTA.setForeground(color);
        }

        else if (obj == openitem) {
            openFile();
       }
       else if (obj == saveitem) {
            saveFile();
       }

       else if (obj == exititem) {
           System.exit(0);
       }
    }

    public void addListeners() { // addlistener to components
        super.addListeners();
        subCustom.addActionListener(this);
        openitem.addActionListener(this);
        saveitem.addActionListener(this);
        exititem.addActionListener(this);
        
    }
    public void openFile() {
        JFileChooser filechooser = new JFileChooser();
            filechooser.setDialogTitle("Open");
            int selectedButtonOpen = filechooser.showDialog(null, "Open");
            

            if (selectedButtonOpen == JFileChooser.OPEN_DIALOG) {
                File selectedFile = filechooser.getSelectedFile();
                String fileName = filechooser.getName(selectedFile);
                JOptionPane.showMessageDialog ( null, "Opening file " + fileName);
            } 
            else if (selectedButtonOpen == JFileChooser.CANCEL_OPTION) {
                JOptionPane.showMessageDialog ( null, "Open command canceled by user.");
            }
    }

    public void saveFile() {
        JFileChooser filechooser = new JFileChooser();
           filechooser.setDialogTitle("Save");
           int selectedButtonSave = filechooser.showSaveDialog(null);

           if (selectedButtonSave == JFileChooser.APPROVE_OPTION) {
                File selectedFile = filechooser.getSelectedFile();
                String fileName = filechooser.getName(selectedFile);
                JOptionPane.showMessageDialog ( null, "Saving file " + fileName);
           }
           else if (selectedButtonSave == JFileChooser.CANCEL_OPTION) {
                JOptionPane.showMessageDialog ( null, "Save command canceled by user.");
              
           }
    }
}