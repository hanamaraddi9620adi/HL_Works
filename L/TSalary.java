import java.util.Scanner;

class Cal
{
	double CalSal(double salary , double bonus )
	{
	

		double Total = salary + bonus ;
		System.out.println("The total Salary is : " + Total);
		return Total;
		
	}


}

public class TSalary
{

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		double salary = sc.nextDouble();
		double bonus = sc.nextDouble();

		Cal x = new Cal();
		x.CalSal(salary,bonus);
		

		sc.close();

	}

}

