package phongam.sithipol.lab8;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class PersonFormV10 extends PersonFormV9 implements ActionListener {
    private static final long serialVersionUID = 1L;

    public static void createAndShowGUI() {
        PersonFormV10 PersonFormV10 = new PersonFormV10("Person Form V9");
        PersonFormV10.addComponents();
        PersonFormV10.addMenus();
        PersonFormV10.addKeys();
        PersonFormV10.addListeners();
        PersonFormV10.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public PersonFormV10(String title) {
        super(title);
    }

    @Override 
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        super.actionPerformed(e);
        if (obj == subRed) {
            name.setForeground(Color.RED);
            weight.setForeground(Color.RED);
            height.setForeground(Color.RED);
            dob.setForeground(Color.RED);
            noteTA.setForeground(Color.RED);
        }
        else if (obj == subGreen) {
            name.setForeground(Color.GREEN);
            weight.setForeground(Color.GREEN);
            height.setForeground(Color.GREEN);
            dob.setForeground(Color.GREEN);
            noteTA.setForeground(Color.GREEN);
        }
        else if (obj == subBlue) {
            name.setForeground(Color.BLUE);
            weight.setForeground(Color.BLUE);
            height.setForeground(Color.BLUE);
            dob.setForeground(Color.BLUE);
            noteTA.setForeground(Color.BLUE);
        }
        // line 35-54 is Color changing handler.

        else if (obj == sub16) {
            name.setFont(new Font("Serif", java.awt.Font.BOLD, 16));
            weight.setFont(new Font("Serif", java.awt.Font.BOLD, 16));
            height.setFont(new Font("Serif", java.awt.Font.BOLD, 16));
            dob.setFont(new Font("Serif", java.awt.Font.BOLD, 16));
            noteTA.setFont(new Font("Serif", java.awt.Font.BOLD, 16));
            
        }

        else if (obj == sub20) {
            name.setFont(new Font("Serif", java.awt.Font.BOLD, 20));
            weight.setFont(new Font("Serif", java.awt.Font.BOLD, 20));
            height.setFont(new Font("Serif", java.awt.Font.BOLD, 20));
            dob.setFont(new Font("Serif", java.awt.Font.BOLD, 20));
            noteTA.setFont(new Font("Serif", java.awt.Font.BOLD, 20));
        }

        else if (obj == sub24) {
            name.setFont(new Font("Serif", java.awt.Font.BOLD, 24));
            weight.setFont(new Font("Serif", java.awt.Font.BOLD, 24));
            height.setFont(new Font("Serif", java.awt.Font.BOLD, 24));
            dob.setFont(new Font("Serif", java.awt.Font.BOLD, 24));
            noteTA.setFont(new Font("Serif", java.awt.Font.BOLD, 24));
        }
        // line 58 - 80 is Size changing handler.
    }

    public void addKeys() {
        // Setting the accelerator.
        subRed.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        subGreen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        subBlue.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        sub16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.CTRL_MASK));
        sub20.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, ActionEvent.CTRL_MASK));
        sub24.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.CTRL_MASK));

        // Setting the mnemonic.
        subRed.setMnemonic(KeyEvent.VK_R);
        subGreen.setMnemonic(KeyEvent.VK_G);
        subBlue.setMnemonic(KeyEvent.VK_B);
        configmenu.setMnemonic(KeyEvent.VK_C);
        coloritem2.setMnemonic(KeyEvent.VK_L);
        sizeitem2.setMnemonic(KeyEvent.VK_Z);
        sub16.setMnemonic(KeyEvent.VK_1);
        sub20.setMnemonic(KeyEvent.VK_0);
        sub24.setMnemonic(KeyEvent.VK_4);

    }

    public void addListeners() { // addlistener to components
        super.addListeners();
        subRed.addActionListener(this);
        subGreen.addActionListener(this);
        subBlue.addActionListener(this);
        sub16.addActionListener(this);
        sub20.addActionListener(this);
        sub24.addActionListener(this);
        configmenu.addActionListener(this);
        coloritem2.addActionListener(this);
        sizeitem2.addActionListener(this);
        
    }


}
