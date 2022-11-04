package Lab10;

class JoinTest extends Thread
{
      String n;
      Thread t;
      JoinTest(String n, Thread t){this.n = n;this.t=t;}
 
      public void run()
      {
            System.out.println("Firul "+n+" a intrat in metoda run()");
            try
            {                
                  if (t!=null) t.join();
                  System.out.println("Firul "+n+" executa operatie.");
                  Thread.sleep(3000);
                  System.out.println("Firul "+n+" a terminat operatia.");
            }
            catch(Exception e){e.printStackTrace();} 
 
      }
 
public static void main(String[] args)
{
      JoinTest w1 = new JoinTest("Proces 1",null);
      JoinTest w2 = new JoinTest("Proces 2",w1);
      w1.start();
      w2.start();
}
}
