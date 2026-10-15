//pol = polymorphism OverLoading 

class Calculator 
{
	void add(int a , int b)
	{
		System.out.println("Addition of 2 integers : " + (a+b));

	}
	
	void add(int a,int b,int c)
	{
		System.out.println("Addition of 3 integers : " + (a+b+c));

	}
	
	void add(double a , double b)
	{
		System.out.println("Addition of 2 integers : " + (a+b));

	}
}

public class pol
{
	public static void main(String[] args)
	{
		Calculator c = new Calculator();

		c.add(10,20);
		c.add(10,20,30);
		c.add(10.5,20.6);
	}
}


//this is called 
//compile time polymorphism / Static polymorphism / Method overloading 
//this below p-rogram is also wrong
//int add(int a, int b)
//double add(int a, int b)