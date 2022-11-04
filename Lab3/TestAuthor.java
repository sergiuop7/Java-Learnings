package Lab3;

public class TestAuthor {
	public static void main(String args[])
	{
		Author a1=new Author("Ion Creanga","ioncreanga_nr1@yahoo.com",'m');
		Author a2=new Author("Mihai Eminescu","mihai_eminescu@yahoo.com",'m');
		a2.setEmail("mihaieminescu");
	
       
        System.out.println(a1);
        System.out.println(a2);
	}
}