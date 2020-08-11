package ui;

import javax.swing.*;

public class ContactForm extends JFrame {

    private JPanel rootPanel;
    private JTextField textName;
    private JTextField textPhone;
    private JButton buttonCancel;
    private JButton buttonSave;

    public ContactForm() {
        setContentPane(rootPane);
        setSize(500, 250);
        setVisible(true);
    }
}
