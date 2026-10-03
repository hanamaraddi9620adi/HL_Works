//ev1 = Encapsualtion Validation Programe 1

class Employee
{
	private int id;
	private String name;
	private double salary;

	public void setId(int id)
	{
		this.id = id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setSalary(double salary)
	{
		if(salary >= 0)
		{
			this.salary = salary;
		}
		else
		{
			System.out.println("Salary is Invalid...!!");
		}
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}
}





public class ev1
{
	public static void main(String[] args)
	{
		Employee e = new Employee();
	
		e.setId(100);
		e.setName("Hanamaraddi");
		e.setSalary(999999);



		Employee e1 = new Employee();
	
		e1.setId(200);
		e1.setName("Latha");
		e1.setSalary(-200);

		

		System.out.println("Id is: " + e.getId());
		System.out.println("Name is: " + e.getName());
		System.out.println("Salary is: " + e.getSalary());

		System.out.println("Id is: " + e1.getId());
		System.out.println("Name is: " + e1.getName());
		System.out.println("Salary is: " + e1.getSalary());

		
		
	}
}

































