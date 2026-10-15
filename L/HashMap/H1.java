import java.util.HashMap;

public class H1
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> students = new HashMap<>();

		students.put(101,"Rahul");
		students.put(102,"Priya");
		students.put(103,"Aditya");

		System.out.println(students.get(102));
		
		students.put(101,"Vikram");

		System.out.println(students.containsKey(103));
		

		students.remove(102);


		System.out.println(students.size());
        	System.out.println(students);

		

	}
}