import java.util.*;

class A
{
	void FRev(String S )
	{
		StringBuilder sb = new StringBuilder(S);
		System.out.println("The reversed string is : " + sb.reverse());
		
	
	}

	void Rev(String S)
	{
		System.out.println("The Reversed string is : ");
		for(int i = S.length()-1;i>=0;i--)
		{
			System.out.print(S.charAt(i));
		}

	} 



}


public class RevString
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();

		A a = new A();

		//a.Rev(name);

		a.FRev(name);

		
	}

}