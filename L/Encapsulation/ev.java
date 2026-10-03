// ev = encapsulation validation 

class BankAccount
{
	private String accountHolder;
	private double balance;

	public void setAccountHolder(String accountHolder)
	{
		this.accountHolder = accountHolder;
	}

	public void setBalance(double balance)
	{
		if(balance >= 0)
		{
			this.balance = balance;
		}
		else
		{
			System.out.println("Balance cannot be negative ");
		}
	}

	public String getAccountHolder()
	{
		return accountHolder;
	}

	public double getBalance()
	{
		return balance;
	}
}

public class ev
{
	public static void main(String[] args)
	{
		BankAccount ba = new BankAccount();
		BankAccount ba1 = new BankAccount();

		ba.setAccountHolder("Hanamaraddi");
		ba.setBalance(9999999);

		ba1.setAccountHolder("Jhon");
		ba1.setBalance(-99999);

		System.out.println("Account Holder Name is : " + ba.getAccountHolder());
		System.out.println("Account Balance is : " + ba.getBalance());


		System.out.println("Account Holder Name is : " + ba1.getAccountHolder());
		System.out.println("Account Balance is : " + ba1.getBalance());
	}
}