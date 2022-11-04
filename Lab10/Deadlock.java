package Lab10;

public class Deadlock {
	 
    public static void main(String[] args) {
        final Robot alphonse = new Robot("Alphonse");
        final Robot gaston = new Robot("Gaston");
        new Thread(new Runnable() {
            public void run() { alphonse.proceseazaPiesa(gaston); }
        }).start();
        new Thread(new Runnable() {
            public void run() { gaston.proceseazaPiesa(alphonse); }
        }).start();
    }
}
 
class Robot {
    private final String name;
    Piesa piesa;
    public Robot(String name) {
        this.name = name;
        this.piesa = new Piesa();
    }
    public String getName() {
        return this.name;
    }
    public synchronized void proceseazaPiesa(Robot r) {
        System.out.println(name+" proceseaza piesa ");
        piesa.procesare();
        r.primestePiesa(this);
    }
    public synchronized void primestePiesa(Robot r) {
        System.out.println(r.getName()+ " a transmis piesa catre "+name);
        this.piesa = r.getPiesa();
    }
 
      private Piesa getPiesa() {
            return piesa;
      }
}
 
class Piesa{
      public void procesare(){
            System.out.println("Piesa se proceseaza");
            try {
                  Thread.sleep(100);
            } catch (InterruptedException e) {
                  e.printStackTrace();
            }
            }
}