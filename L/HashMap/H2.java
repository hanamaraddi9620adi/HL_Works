// HashMap is case sensitive 



import java.util.HashMap;

public class H2
{
	public static void main(String[] args)
	{
		HashMap<String,Integer> marks = new HashMap<>();

		marks.put("Rahul",80);
		marks.put("Laxmi",98);
		marks.put("Megha",90);

		String name = "Laxmi";

		if(marks.containsKey(name))
		{
			System.out.println(marks.get(name));
		}
		else
		{
			System.out.println("Student not found ");
		}
		
	}
}