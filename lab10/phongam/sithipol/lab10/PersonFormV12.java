package phongam.sithipol.lab10;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonFormV12 extends PersonFormV11 {
    protected Person person;
    protected JMenu dataMenu;
    protected JMenuItem display_item, sort_item, search_item, remove_item;
    protected ArrayList<Person> person_list = new ArrayList<Person>();
    Boolean search = null;
    private static final long serialVersionUID = 1L;

    public PersonFormV12(String title) {
        super(title);
    }

    public static void createAndShowGUI() {
        PersonFormV12 personFormV12 = new PersonFormV12("Person Form V12");
        personFormV12.addComponents();
        personFormV12.addMenus();
        personFormV12.addKeys();
        personFormV12.addListeners();
        personFormV12.setFrameFeatures();
        // personFormV12.initComponents();
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    // public void initComponents() {
    //     person_list = new ArrayList<Person>();
    // }
    @Override
    protected void handleOkButton() {
        createPerson();
        person_list.add(person);
        String info = getInfoFormForm();
        JOptionPane.showMessageDialog(this, info + "\n\nAdding this person into the list: " + person, "Person Information", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void createPerson() {
        String name = this.name.getText();
        double height = Double.parseDouble(this.height.getText());
        double weight = Double.parseDouble(this.weight.getText());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dob = LocalDate.parse(this.dob.getText(), formatter);
        person = new Person(name, height, weight, dob);
    }

    @Override
    public void addListeners() {
        super.addListeners();
        display_item.addActionListener(this);
        sort_item.addActionListener(this);
        search_item.addActionListener(this);
        remove_item.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object obj = e.getSource();
        if (obj == display_item) {
            handleDisplayMI();
        }
        else if (obj == sort_item) {
            handleSortMI();
        }
        else if (obj == search_item) {
            handleSearchMI();
        }
        else if (obj == remove_item) {
            handleRemoveMI();
        }
    } 

    public void addMenus() {
        super.addMenus();
        dataMenu = new JMenu("Data");
        display_item = new JMenuItem("Display");
        sort_item = new JMenuItem("Sort");
        search_item = new JMenuItem("Search");
        remove_item = new JMenuItem("Remove");
        
        dataMenu.add(display_item);
        dataMenu.add(sort_item);
        dataMenu.add(search_item);
        dataMenu.add(remove_item);
        menubar.add(dataMenu);
    }

    public void handleDisplayMI() {
        JOptionPane.showMessageDialog(this, person_list, "Person List", JOptionPane.INFORMATION_MESSAGE);
    }

    public void handleSortMI() {
        Collections.sort(person_list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        JOptionPane.showMessageDialog(this, person_list, "Person List", JOptionPane.INFORMATION_MESSAGE);
    }

    public void handleSearchMI() {
        String name = JOptionPane.showInputDialog("Please enter a person name to search : ");
        // Person person = searchName(name);
        //     if (person != null) {
        //         JOptionPane.showMessageDialog(this, person + " is found.", "Message", JOptionPane.INFORMATION_MESSAGE);
        //     } else {
        //         JOptionPane.showMessageDialog(this, name + " is not found.", "Message", JOptionPane.INFORMATION_MESSAGE);
        //     }
        for (Person person : person_list) {
            if (name.equals(person.getName())) {
                search = true;
            }
        }
        if (search == true) {
            JOptionPane.showMessageDialog(this, person + " is found.", "Message", JOptionPane.INFORMATION_MESSAGE);
            search = false;
        }
        else {
            JOptionPane.showMessageDialog(this, name + " is not found.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }

        
    }

    public void handleRemoveMI() {
        String name = JOptionPane.showInputDialog("Please enter a person name to remove : ");
        Person person = searchName(name);
        if (person != null) {
            person_list.remove(person);
            JOptionPane.showMessageDialog(this, person + " is remove.", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, name + " is not found.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public Person searchName(String name) {
        for (Person person : person_list) {
            if (person.getName().equals(name)){
                return person;
            }
        }
        return null;
    }
}





    