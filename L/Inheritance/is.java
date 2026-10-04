//is = inhearitance with super()

class Person
{
	String name;

	Person(String name)
	{
		this.name = name ;
	}
}

class Student extends Person
{
	int marks;

	Student(int marks,String name)
	{
		super(name);
		this.marks = marks;
	}

	void display()
	{
		System.out.println("Name : " + name);
		System.out.println("Marks : " + marks);

	}
}

public class is
{
	public static void main(String[] args)
	{
		Student s = new Student(100,"Mohan");

		these are of no use , it cannot be assigned in this wayas above bcoz it is a costructor hence we need to pass the argumenst while creating the objecgt 
		//s.marks = 100;
		//s.name = "Mohan";
	
		s.display();
	}
}