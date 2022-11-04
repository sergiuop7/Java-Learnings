package Lab9;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
class CheckboxTest extends JFrame implements ItemListener {
 
    private JLabel label1, label2;
    private JCheckBox cbx1, cbx2, cbx3;
 
    public CheckboxTest(String titlu) {
        super(titlu);
        initializare();
        setVisible(true);
 
    }
 
    public void initializare() {
        setLayout(new GridLayout(5, 1));
        label1 = new JLabel("Componente :");
        label2 = new JLabel("");
        cbx1 = new JCheckBox("componenta 1");
        cbx2 = new JCheckBox("componenta 2");
        cbx3 = new JCheckBox("componenta 3");
 
        add(label1);
        add(label2);
        add(cbx1);
        add(cbx2);
        add(cbx3);
        pack();
        setSize(200, 200);
 
        cbx1.addItemListener(this);
        cbx2.addItemListener(this);
        cbx3.addItemListener(this);
    }
 
    //metoda interfetei ItemListener
    public void itemStateChanged(ItemEvent e) {
        StringBuffer ingrediente = new StringBuffer();
        if (cbx1.isSelected() == true) {
            ingrediente.append(" componenta 1");
        }
        if (cbx2.isSelected() == true) {
            ingrediente.append(" componenta 2 ");
        }
        if (cbx3.isSelected() == true) {
            ingrediente.append(" componenta 3 ");
        }
        label2.setText(ingrediente.toString());
    }
 
    public static void main(String[] args) {
        new CheckboxTest("titlu");
    }
}
