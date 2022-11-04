package Lab6;

import java.util.List;
import java.util.TreeSet;

class Bank1  {
    protected TreeSet<BankAccount> accounts = new TreeSet<>();

    public void addAccount(BankAccount accounts) {
        this.accounts.addAll(List.of(accounts));
    }

    public void printAccounts() {
    	 for (var account : this.accounts) 
    	 {
        	System.out.println(account);
    	 }
    }

    public void printAccounts(double minBalance, double maxBalance) {
        for (var account : accounts) {
            if (account.getBalance() >= minBalance && account.getBalance() <= maxBalance) {
                System.out.println(account);
            }
        }
    }
    public BankAccount getAccount(String owner) {
        for(var account : accounts) {
            if(account.getOwner().equals(owner))
                return account;
        }
        return null;
    }
}
   
