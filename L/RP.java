import java.util.Scanner;


class A 
{

	void Par1Ret0(int n , String name )
	{
		System.out.println( n +  " is " + name + " number ");
		System.out.println("This is a function/methond with paramters and no return type ");

	}

	
	void Par0Ret0()
	{

	System.out.println("This is a function/methond without paramters and no return type ");
	System.out.println("Hello ");

	}




	int Par1Ret1(int x , int y)
	{

	System.out.println("This is a function/methond with paramters and also with return type ");
	System.out.println("Hello ");
	int result = x + y;
	System.out.println( "The sum of the two numbers is : " + result);

	return result;

	}




	int Par0Ret1()
	{
	System.out.println("This is a function/methond without paramters and with return type ");
	System.out.println("Hello ");
	int a = 1;
	int b = 2;
	
	int result = a + b;

	System.out.println("The sum of the numbers is :   " + result);
	
	return result;
	}
}

public class RP
{
	public static void main(String[] args)
	{			

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String name = sc.next();

		int a = sc.nextInt();	
		int b = sc.nextInt();
	
		A obj = new A();
		
		//obj.Par1Ret0(k,name);
		obj.Par0Ret0();
		//obj.Par1Ret1(k,b);
		//obj.Par0Ret1();
		
	}
}
	
	


