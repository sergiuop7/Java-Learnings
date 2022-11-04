package Lab6;
class BankAccount implements Comparable<BankAccount>
{
	private String owner;
	private double balance;
	
	BankAccount(String owner,double balance)
	{
		this.owner=owner;
		this.balance=balance;
	}
	public void withdraw(double amount)
	{
		System.out.println("The amount you have withdrawn is "+amount);
	}
	public void deposit(double amount)
	{
		System.out.println("The amount you have deposited is "+amount);
	}
	@Override
	public boolean equals(Object obj) 
	{

		if(obj instanceof BankAccount){

		BankAccount p = (BankAccount)obj;

		return owner == p.owner;

		}

		return false;

	}
	public int hashCode()
	{

		return (int) (balance+ owner.hashCode());

	}
	 public String toString(){
	        return owner+":"+balance;
	 }
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	@Override
	public int compareTo(BankAccount o) {
		
		return getOwner().compareTo(o.getOwner());
	}
	
}

