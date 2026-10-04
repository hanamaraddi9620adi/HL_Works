//ic =constructor with inheritance   

class Person
{
	Person()
	{
		System.out.println("Person constructor is called ");
	}

}

class Student extends Person
{
	Student()
	{
		System.out.println("Student constructor is called");
	}
}

public class ic
{
	public static void main(String[] args)
	{
		Student s = new Student();
	}
}

//both are automatially called becoz both are consturctors 