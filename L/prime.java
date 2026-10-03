import java.util.Scanner;

class A
{
    void Cal(int n)
    {
	boolean p = true ;

	if(n<2)
	{
		p = false;	
	}
        for(int i = 2; i < n; i++)
        {
		if(n%i ==  0)
		{
			p = false;
			break;
		}
	}
	if(p)
	{
		System.out.println(n +" is prime");
	}

	else
	{
		
		System.out.println(n +" is not prime");
	}
    }
}

public class prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        A x = new A();
        x.Cal(n);

        sc.close();
    }
}