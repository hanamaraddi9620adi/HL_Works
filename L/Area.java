import java.util.Scanner;

class A
{

	void Cal(int a, int b)
	{
		int Result = a*b;
		System.out.println("The Area of Rectangle is : " + Result);
	}

}

public class Area
{

	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		A Obj = new A();
		Obj.Cal(a,b);

	} 

}