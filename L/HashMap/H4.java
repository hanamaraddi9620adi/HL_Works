import java.util.HashMap;

public class H4
{
	public static void main(String[] args)
	{
		int[] nums = {1,2,3,5,2,1,3,4,};

		HashMap<Integer , Integer> freq = new HashMap<>();


			//To get the frequency of elements
		for(int num : nums)
		{
			freq.put(num,freq.getOrDefault(num , 0) + 1);

		}
		System.out.println(freq);			


	}
}



/*freq.put(num,freq.getOrDefault(num , 0) + 1);


 This line has this meaning 


if (freq.containsKey(num)) {
       freq.put(num, freq.get(num) + 1);
    }
    else {
        freq.put(num, 1);
		
		also this 

if (freq.get(num) == null) {
        freq.put(num, 1);
    }
    else {
        freq.put(num, freq.get(num) + 1);
    }
*/