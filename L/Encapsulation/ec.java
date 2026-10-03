//ec = encapsulation + constructor 

class Employee
{
	private int id;
	private String name;
	private double salary;

	//This is the advantage of Constructor where we need not to create  a separate setters mthods in the program 

	Employee(int id , String name , double salary )
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
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

public class ec
{
	public static void main(String[] args)
	{
		Employee e = new Employee(100,"Reena",60000);
		
		
			//This method will not work wehn we use constructor becoz no setter methods are defined in th programme 
		//Employee e = new Employee();
		//e.setName("Rahul");
		//e.setId(100);
		//e.setSalary(60000);


		System.out.println("Name : " + e.getName());
		System.out.println("Id  : " + e.getId());
		System.out.println("Salary : " + e.getSalary());

		
	}
}