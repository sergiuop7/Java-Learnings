package Lab4;

class Author{
	
    private String name;
    private String email;
    private char gender;
   
  
   public Author(String name,String email,char gender)
    {
   	 this.name=name;
   	 this.email=email;
   	 this.gender=gender;
    }
 
   void setEmail(String email)
   {
   	this.email=email;
   }
   
   String getName()
   {
   	return name;
   }
   String getEmail()
   {
   	return email;
   }
   char getGender()
   {
   	return gender;
   }
   @Override
   public String toString()
   {
  	 return name+" ("+gender+") at my email "+email;
   }
	
}