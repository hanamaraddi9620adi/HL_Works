//ivm = inheriting variables and methods
class Employee
{
	String name;
	int salary;

	void displayEmployee()
	{
		System.out.println("Name is : " + name);
		System.out.println("Salary is : " + salary);
	}
}

class Developer extends Employee
{
	String programmingLanguage;

	void displayDeveloper()
	{
		System.out.println("Programming Language : " + programmingLanguage);
	}
}

public class ivm
{
	public static void main(String[] args)
	{
		Developer d = new Developer();
		d.name = "Ramesh";
		d.salary = 99999;
		d.programmingLanguage = "Java";

		d.displayEmployee();
		d.displayDeveloper(); 	
	}
}