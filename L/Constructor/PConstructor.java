class Student
{
	String name;
	int age;

	Student(int a , String n)
	{
		name = n;
		age = a;
	}

	void display()
	{
		System.out.println(name);
		System.out.println(age);
	}
}

public class PConstructor
{
	public static void main(String args[])
	{
		Student s1 = new Student(10," Rahul ");
		Student s2 = new Student(21,"Priya");
	
		s1.display();
		s2.display();
		
	}
}