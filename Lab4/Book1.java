package Lab4;

class Book1{
	private String name;
	private Author author[];
	private double price;
	private int qtyInStock=0;
	
	Book1(String name,Author author[],double price)
	{
	   this.name=name;
	   this.author=author;
	   this.price=price;
	}
	Book1(String name,Author author[],double price,int qtyInStock)
	{
		 this.name=name;
		   this.author=author;
		   this.price=price;
		   this.qtyInStock=qtyInStock;
	}
    String getName()
    {
    	return name;
    }
     Author[] getAuthors()
    {
    	return author;
    }
    double getPrice()
    {
    	return price;
    }
    void setPrice(double price)
    {
    	this.price=price;
    }
    int getQtyInStock()
    {
    	return qtyInStock;
    }
    void setQtyInStock(int qtyInStock)
    {
    	this.qtyInStock=qtyInStock;
    }
    void printAuthors()
    {
    	int i;
    	for (i=0;i<author.length;i++)
    	{
    		System.out.println(author[i].getName());
    	}
    		
    }
    @Override
    public String toString()
    {
   	  return name+" by "+author.length+" authors";
    }
	
	
}
