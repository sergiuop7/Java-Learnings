package Lab11;

import java.util.Observable; 


public class Thermometer extends Observable implements Runnable {
      static int MAX_VALUE=100;
      static int MIN_VALUE=0;
      double temp=30;
      Thread t;
      boolean active = true;
      boolean paused = false;
 
      public void start(){
            if(t==null){
                  t = new Thread(this);
                  t.start();
            }
      }
 
      public void run(){
            while(active){
                  if(paused){
                        synchronized(this){
                              try {
                                    wait();
                              } catch (InterruptedException e) {
                                    e.printStackTrace();
                              }
                        }//.sync
                  }//.if
 
                  double d = Math.random()*4;
                  double x = Math.random();
                  if(x<0.5) d = -1*d;
 
                  if(temp+d<MAX_VALUE&&temp+d>MIN_VALUE){
                        temp= temp+d;
                        this.setChanged();
                        this.notifyObservers();
                  }
 
                  try {Thread.sleep(1000);} catch (InterruptedException e) {}
            }//.while
      }//.run
 
      public void setPause(boolean p){
            synchronized (this) {
                  if(p==true){
                        paused = true;
                  }else{
                        paused = false;
                        notify();
                  }
            }
      }
 
      public double getTemperature(){
            return temp;
      }
 
      public boolean isPaused() {
            return paused;
      }    
}
