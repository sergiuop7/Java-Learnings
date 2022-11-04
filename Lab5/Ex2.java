package Lab5;

public class Ex2 {
	
	public static void main(String[] args) 
	{
		
	
	RealImage realImage = new RealImage("f1");
	RotatedImage rotatedImage=new RotatedImage("f2");
 
    realImage.display();
 

    ProxyImage proxyImage1 = new ProxyImage(realImage,rotatedImage,true);
    proxyImage1.display();
 
}}