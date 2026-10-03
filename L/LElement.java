import java.util.Scanner;

class A 
{

	int LE(int n , int arr[])
	{
		int Largest = 0;
		for(int i = 0;i<n;i++)
		{

			if(Largest<arr[i])
			{

				Largest = arr[i];
			}

		}
		System.out.println("The Largest element in the array is :  " + Largest);
		return Largest;

	}

}

public class LElement
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the values of array elements : ");

		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}

		A a = new A();

		a.LE(n,arr);

	}

}