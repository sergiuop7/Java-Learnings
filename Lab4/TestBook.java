package Lab4;

public class TestBook 
{
	public static void main(String args[])
	{
		Author a1=new Author("Mark Twain","mark_twain@yahoo.com",'m');
		Author a2=new Author("Jules Verne","jules_verne@yahoo.com",'m');
		Book b1=new Book("The Adventures of Tom Sawyer",a1,30.5);
		Book b2=new Book("The Steam House",a2,98,10);
		b1.setQtyInStock(5);
		System.out.println(b1);
        System.out.println(b2);
		
	}
        
}
