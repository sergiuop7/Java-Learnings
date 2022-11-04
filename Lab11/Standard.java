package Lab11;

import java.util.Observable;
import java.util.Observer;
 
class ObservedObject extends Observable {
   private String watchedValue;
 
   public ObservedObject(String value) {
      watchedValue = value;
   }
 
   public void setValue(String value) {
      // if value has changed notify observers
      if(!watchedValue.equals(value)) {
         System.out.println("Value changed to new value: "+value);
         watchedValue = value;
 
         // mark as value changed
         setChanged();
         // trigger notification
         notifyObservers(value);
      }
   }
}
