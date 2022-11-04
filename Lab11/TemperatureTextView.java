package Lab11;
import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;
 

public class TemperatureTextView extends JPanel implements Observer{
 
      JTextField jtfTemp;
      JLabel jtlTemp;
      JButton action;
 
      TemperatureTextView(){
            this.setLayout(new FlowLayout());
            jtfTemp = new JTextField(20);
            jtlTemp = new JLabel("Temperature");
            action = new JButton("Enable-Disable");
            add(action);add(jtlTemp);add(jtfTemp);
      }
 
      public void update(Observable o, Object arg) {
            String s = ""+((Thermometer)o).getTemperature();
            jtfTemp.setText(s);
      }
 
      public void addEnableDisableListener(TemperatureController.EnableDisableListener listener) {
            action.addActionListener(listener);
      }
}