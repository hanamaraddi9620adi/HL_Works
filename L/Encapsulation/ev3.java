// ev3 = encapsualtion valaidation programme 3

//No setter method fo rthis , onlyh getter method 



class ATM
{
	//double amount;
	private double balance;

	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance += amount;
			System.out.println("Deposited: " + amount);
		}
		else
		{
			System.out.println("Inavlid amount to deposit.....!!");
		}
	}

	public void withdraw(double amount)
	{
		if(amount <= 0)
		{
			System.out.println("Invalid amount to withdraw");
		}
		else if(amount > balance)
		{
			System.out.println("Invalid amount to withdraw, Insufficient bal ");
		} 
		else
		{
			System.out.println("Withdrawn : " +  amount);
			balance = balance - amount;
		}
	}






//we dont need to set any a,mount inaitially in the banking system , so intially it will be zero and the we deposit and the th eprocess goes on 






	//public void setBalance(double balance)
	//{
	//	this.balance = balance;
	//}

	public double getBalance()
	{
		return balance;
	}
}


public class ev3
{
	public static void main(String[] args)
	{
		ATM a = new ATM();
		
		System.out.println("Balance is : " + a.getBalance());		

		a.deposit(10000);
		System.out.println("Balance after deposit : " + a.getBalance());
		

		a.withdraw(2000);
		System.out.println("Balance after withdrawal : " + a.getBalance());

		//a.withdraw(-2000);
		//a.withdraw(2000000000);

		

		
		//a.deposit(-100);

		
	} 
}


