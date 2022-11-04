package Lab11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class TemperatureController  {
      Thermometer t;
      TemperatureTextView tview;
      public TemperatureController(Thermometer t, TemperatureTextView tview, TemperatureCanvasView tcanvasView){
            t.addObserver(tview);
            t.addObserver(tcanvasView);
            this.t = t;
            this.tview = tview;
 
            tview.addEnableDisableListener(new EnableDisableListener());
      }    
 
      class EnableDisableListener implements ActionListener{
 
            public void actionPerformed(ActionEvent e) {
                  t.setPause(!t.isPaused());
            }
 
      }
}
