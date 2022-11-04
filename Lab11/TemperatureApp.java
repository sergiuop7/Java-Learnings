package Lab11;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;
 
public class TemperatureApp extends JFrame{
 
      TemperatureApp(TemperatureTextView tview, TemperatureCanvasView tcanvasView){
            setLayout(new BorderLayout());
            tcanvasView.setPreferredSize(new Dimension(300,300));
            add(tview,BorderLayout.NORTH);
            add(tcanvasView,BorderLayout.CENTER);
            pack();
            setVisible(true);
      }
 
      public static void main(String[] args) {
            Thermometer t = new Thermometer();
            t.start();
 
            TemperatureCanvasView tcanvasView = new TemperatureCanvasView();
            TemperatureTextView tview = new TemperatureTextView();
            TemperatureController tcontroller = new TemperatureController(t,tview,tcanvasView);
 
            new TemperatureApp(tview,tcanvasView);
      }
}
