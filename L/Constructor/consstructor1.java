class Student
{
	String name;
	int age;

	Student()
	{
		System.out.println("Student object Created and called automatically by constructor ");
	}

	void Method1()
	{
		 System.out.println("Student object called explicitly");
	}
}

public class consstructor1
{
	public static void main(String[] args)
	{
		 Student s1 = new Student();
	
		 s1.Method1();	
	}
}