package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Bank
{
	private ArrayList<BankAccount> bankaccount = new ArrayList<BankAccount>();
	
	public void addAccount(String owner,double balance)
	{
		bankaccount.add(new BankAccount(owner,balance));
		
	}
	public void printAccounts()
	{
		BankAccount b;
		for(int i=0;i<bankaccount.size()-1;i++)
		{
			if(bankaccount.get(i).getBalance()>bankaccount.get(i+1).getBalance())
			{
				b=bankaccount.get(i);
				bankaccount.set(i,bankaccount.get(i+1));
				bankaccount.set(i+1,b);
			}
				
					
		}
		for(int i=0;i<bankaccount.size();i++)
		System.out.println(bankaccount.get(i));
	}
	public void printAccounts(double minBalance,double maxBalance)
	{
		for(int i=0;i<bankaccount.size();i++)
		{
			if(bankaccount.get(i).getBalance()>minBalance && bankaccount.get(i).getBalance()<maxBalance)
			{
				System.out.println(bankaccount.get(i));
			}
		}
	}
	public BankAccount getAccount(String owner) {
        for(var account : bankaccount) {
            if(account.getOwner().equals(owner))
                return account;
        }
        return null;
    }
	public void getAllAccounts()
	{
		Collections.sort(bankaccount);
		
		for(int i=0;i<bankaccount.size();i++)
		{
			System.out.println(bankaccount.get(i));
		
		}
		
	}
}


