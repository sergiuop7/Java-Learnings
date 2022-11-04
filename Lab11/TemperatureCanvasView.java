package Lab11;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;
 
public class TemperatureCanvasView extends JPanel implements Observer{
 
      private static final int width = 20;
      private static final int top = 20;
      private static final int left = 100;
      private static final int right = 250;
      private static final int height = 200;
 
      private double crtTemp;
 
      public void paintComponent(Graphics g){
 	super.paintComponent(g);
            g.setColor(Color.black);
            g.drawRect(left,top, width, height);
            g.setColor(Color.red);
            g.fillOval(left-width/2, top+height-width/3,width*2, width*2);
            g.setColor(Color.black);
            g.drawOval(left-width/2, top+height-width/3,width*2, width*2);
            g.setColor(Color.white);
            g.fillRect(left+1,top+1, width-1, height-1);
            g.setColor(Color.red);
            long redtop = (long)(height*(crtTemp-Thermometer.MAX_VALUE)/(Thermometer.MIN_VALUE-Thermometer.MAX_VALUE));
            g.fillRect(left+1, top + (int)redtop, width-1, height-(int)redtop);
            g.setColor(Color.BLUE);
      }
 
      public void update(Observable o, Object arg) {
            crtTemp = ((Thermometer)o).getTemperature();
            repaint();
      }
}