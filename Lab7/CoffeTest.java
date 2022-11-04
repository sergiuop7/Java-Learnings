package Lab7;

public class CoffeTest {
    public static void main(String[] args) {
          CofeeMaker mk = new CofeeMaker();
          CofeeDrinker d = new CofeeDrinker();

          for(int i = 0;i<15;i++){
                Cofee c = mk.makeCofee();
                try {
                      d.drinkCofee(c);
                }  catch (NumberException e) {
                	System.out.println("Exception:"+e.getMessage()+" nr="+e.getCount());
                }  catch (TemperatureException e) {
                      System.out.println("Exception:"+e.getMessage()+" temp="+e.getTemp());
                } catch (ConcentrationException e) {
                      System.out.println("Exception:"+e.getMessage()+" conc="+e.getConc());
                }
                
                  
                finally{
                      System.out.println("Throw the cofee cup.\n");
                }
          }    
    }
}//.class
class CofeeMaker {
    Cofee makeCofee() {
          System.out.println("Make a coffe");
          int t = (int)(Math.random()*100);
          int c = (int)(Math.random()*100);
          Cofee cofee = new Cofee(t,c);
          return cofee;
         
    }

}//.class

class Cofee{
    private int temp;
    private int conc;
    private static int count=0;

    Cofee(int t,int c){temp = t;conc = c;count++;}
    int getTemp(){return temp;}
    int getConc(){return conc;}
    public static int getCount() {return count;}
    public String toString(){return "[cofee temperature="+temp+":concentration="+conc+"]";}
}//.class

class CofeeDrinker{
    void drinkCofee(Cofee c) throws TemperatureException, ConcentrationException,NumberException{
          if(Cofee.getCount()>10)
        	  throw new NumberException(Cofee.getCount(),"Too many cofee objects have been created");
          if(c.getTemp()>60)
                throw new TemperatureException(c.getTemp(),"Cofee is too hot!");
          if(c.getConc()>50)
                throw new ConcentrationException(c.getConc(),"Cofee concentration too high!");  
          
          System.out.println("Drink cofee:"+c);
    }
}//.class

class TemperatureException extends Exception{
    int t;
    public TemperatureException(int t,String msg) {
          super(msg);
          this.t = t;
    }

    int getTemp(){
          return t;
    }
}//.class

class ConcentrationException extends Exception{
    int c;
    public ConcentrationException(int c,String msg) 
    {
          super(msg);
          this.c = c;
    }

    int getConc()
    {
          return c;
    }
}
class NumberException extends Exception{
	int nr;
	public NumberException(int nr,String msg) 
	{
	super(msg);
	this.nr=nr;
	}
	
 int getCount()
 {
	 return Cofee.getCount();
 }

}
