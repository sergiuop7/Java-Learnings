package Lab5;

public class ProxyImage implements Image{
	 
	   private RealImage realImage;
	   private String fileName;
	   private RotatedImage rotatedImage;
	   boolean rotate;
	 
	   ProxyImage(RealImage realImage,RotatedImage rotatedImage,boolean rotate)
	   {
	      this.rotate=rotate;
	      this.realImage=realImage;
	      this.rotatedImage=rotatedImage;
	   }
	 
	   @Override
	   public void display() 
	   {
	      if(rotate==false)
	      {
	         realImage.display();
	      }
	      else
	      { 
	    	  rotatedImage.display();
	    	  }
	   }
	  
	}
