//e = encapsulation

class Student
{
	private String name;
	private int age;
	private String college;

	public void setName(String name)
	{
		this.name = name; 
	}

	public void setAge(int age)
	{
		this.age = age; 
	}

	public void setCollege(String college)
	{
		this.college = college;
	}

	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}

	public String getCollege()
	{
		return college;
	}

}

public class e2
{
	public static void  main(String[] args)
	{
		Student s = new Student();

		s.setName("Rahul");
		s.setAge(19);
		s.setCollege("BMSCE");

		System.out.println("Name : " + s.getName());
		System.out.println("Age : " + s.getAge());
		System.out.println("College : " + s.getCollege());
	}
}