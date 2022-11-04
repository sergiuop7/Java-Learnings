package Lab6;

public class Exercise1 {
	public static void main(String[] args) {
		
		BankAccount b1= new BankAccount("Alin",1234);
		BankAccount b2= new BankAccount("Mircea",12345);
		if(b1.equals(b2))
			System.out.println(b1+" and "+b2+ " are equals");
		else
			System.out.println(b1+" and "+b2+ " are NOT equals");
		
	}
}