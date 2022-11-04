package Lab9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
class ChoiceTest extends JFrame implements ItemListener {
      private JLabel label;
      private JComboBox culori;
 
      public ChoiceTest(String titlu) {
            super(titlu);
            initializare();
            setVisible(true);
      }
 
      public void initializare() {
            setLayout(new GridLayout(4, 1));
 
            label = new JLabel("Alegeti culoarea");
            label.setOpaque(true);
            label.setBackground(Color.red);
 
            culori = new JComboBox();
            culori.addItem("Rosu");
            culori.addItem("Verde");
            culori.addItem("Albastru");
            culori.setSelectedIndex(0);
 
            add(label);
            add(culori);
            pack();
            setSize(200, 100);
 
            culori.addItemListener(this);
      }    
 
      //metoda interfetei ItemListener
      public void itemStateChanged(ItemEvent e) {
            switch (culori.getSelectedIndex()) {
                  case 0:
                        label.setBackground(Color.red);
                        break;
                  case 1:
                        label.setBackground(Color.green);
                        break;
                  case 2:
                        label.setBackground(Color.blue);
            }
      }
 
      public static void main(String[] args) {
            new ChoiceTest("test");
      }
}