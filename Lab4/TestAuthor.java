package Lab4;

public class TestAuthor {
	
	public static void main(String args[])
	{
		Author a1=new Author("Mark Twain","mark_twain@yahoo.com",'m');
		Author a2=new Author("Jules Verne","jules_verne@yahoo.com",'m');
		a2.setEmail("julesverne@yahoo.com");
       
        System.out.println(a1);
        System.out.println(a2);
	}

}
