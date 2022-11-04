package Lab3;

class Flower
{
    int petal;
    static int objCnt;
    Flower()
    { 
    	System.out.println("Flower has been created!"); 
    	objCnt++;
    }
    public static void printObjCount()
    {
    	System.out.println("The number of objects created so far is "+objCnt);
    }

   public static void main(String[] args) 
   {
	   Flower[] garden = new Flower[5];
	   for(int i =0;i<5;i++)
	   {
		 Flower f = new Flower();
		 garden[i] = f;
		// System.out.println("Total Number of Objects: "+Flower.objCnt);
		 f.printObjCount();
	   }
   }
}