import java.util.HashMap;
import java.util.Map;

public class H3
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> map = new HashMap<>();

		map.put(1,"Java");
		map.put(2,"Python");
		map.put(3,"C");
		map.put(3,"C++");

			// Note: Key Set should be called --->> KeySet();


		for( int key : map.keySet())
		{
			System.out.println(key);
		}
		
			// Note: vlaues Set should be called --->> values();			 

		for( String value : map.values())
		{
			System.out.println(value);
		}
		

		for(Map.Entry<Integer,String> entry : map.entrySet())
		{
			System.out.println(entry.getKey() + " -->> " + entry.getValue());
				
		}

	}
}