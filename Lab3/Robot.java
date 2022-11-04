package Lab3;
    	  
     class Robot {
      int x;
      Robot()
      { x=1;
       System.out.println("Value initialized to 1.");
      }
     
     void change(int k)
     {
    	 if(k>=1)
    		 x+=k;
    	 System.out.println("Position is now: "+x);
     }
     @Override
     public String toString()
     {
    	 return "Pozitia este "+x;
     }
     
     
}