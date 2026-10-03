class Student
{
	private String name;
	private int marks;

	public void setName(String name)
	{
		this.name = name;
	}

	public void setMarks(int marks)
	{
		if(marks >= 0 && marks <=100)
		{
			this.marks = marks;
		}
		else
		{
			System.out.println("Invalid Marks .....!!");
		}
	}
		
	public String getName()
	{
		return name;
	}

	public int getMarks()
	{
		return marks;
	}
}

public class ev2 
{
	public static void main(String[] args)
	{
		Student s = new Student();
		
		s.setName("Hanamaraddi");
		s.setMarks(85);


		Student s1 = new Student();

		System.out.println("Name : " + s.getName());
		System.out.println("Marks : " + s.getMarks());


//this is the correct sequence to write becoz the java execute sthe program line by line hence if any get method is set to give out for something menas it will be executed 

		s1.setName("Manju");
		System.out.println("Name : " + s1.getName());

		s1.setMarks(150);
		System.out.println("Marks : " + s1.getMarks());

	}
}