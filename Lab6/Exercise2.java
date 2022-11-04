package Lab6;

public class Exercise2 {
	
	public static void main(String[] args) {
		
		BankAccount b1= new BankAccount("Alin",  12345);
		BankAccount b2= new BankAccount("Mircea",1234);
		BankAccount b3= new BankAccount("Daniel",123456);
		BankAccount b4= new BankAccount("Bogdan", 123455);
		Bank B1=new Bank();
		B1.addAccount(b1.getOwner(),b1.getBalance());
		B1.addAccount(b2.getOwner(),b2.getBalance());
		B1.addAccount(b3.getOwner(),b3.getBalance());
		B1.addAccount(b4.getOwner(),b4.getBalance());
		B1.printAccounts();
		System.out.println("\n");
		B1.printAccounts(123450, 134567);
		System.out.println("\n");
		B1.getAccount("Alin");
		System.out.println("\n");
		B1.getAllAccounts();
	
}}