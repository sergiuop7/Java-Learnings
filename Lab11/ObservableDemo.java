package Lab11;

import java.util.Observable;
import java.util.Observer;

public class ObservableDemo implements Observer {
	   public static void main(String[] args) {
	      // create watched and watcher objects
	      ObservedObject watched = new ObservedObject("Original Value");
	      // watcher object listens to object change
	      ObservableDemo watcher = new ObservableDemo();
	 
	      // trigger value change
	      watched.setValue("New Value");
	 
	      // add observer to the watched object
	      watched.addObserver(watcher);
	 
	      // trigger value change
	      watched.setValue("Latest Value");
	   }
	 
	   public void update(Observable obj, Object arg) {
	      System.out.println("Update called with Arguments: "+arg);
	   }
}
