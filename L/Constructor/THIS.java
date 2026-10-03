class Student
{
	String name ;
	int age;

	Student(int age, String name)
	{
		this.name = name;
		this.age = age;

		System.out.println("Constructor: ");
		System.out.println(this.age);
		System.out.println(this.name);
	}
	//void display(int age, String name) ,, this is a qwrong way to write the programme
//once the parameters are defined in the COnstructir they are accessable to other classes also so we need not to call them or pass them againa in th eother megthods

	void display()
	{
		System.out.println(this.age);
		System.out.println(this.name);
	}
	
}

public class THIS
{
	public static void main(String[] args)
	{
		Student s1 = new Student(19,"Adi");
		//s1.name = "Adi";
		//s1.age = 20;
		s1.display();
	}
}