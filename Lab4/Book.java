package Lab4;

class Book{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock=0;
	
	Book(String name,Author author,double price)
	{
	   this.name=name;
	   this.author=author;
	   this.price=price;
	}
	Book(String name,Author author,double price,int qtyInStock)
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
    Author getAuthor()
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
    @Override
    public String toString()
    {
   	 return "'"+name+"'"+" by "+author.getName()+" ("+author.getGender()+") "+"at "+author.getEmail();
    }
	
	
}