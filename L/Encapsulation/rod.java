//rod = read only data 
//Note if they ask fpr no getter method should be there fpr a particular encapsulation , tha indirectly means we need to use constructor directly 

class Company
{
	private final String companyName;
	private String location;

	Company(String companyName)
	{
		this.companyName = companyName;
	}

	public String getCompanyName()
	{
		return companyName;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public String getLocation()
	{
		return location;
	}

}

public class rod
{
	public static void main(String args[])
	{
		Company c = new Company("Google");
		
		//This is not possible it throws error 
		//companyName = "Microsoft";

		c.setLocation("Bangalore");
		c.setLocation("Hyderabad");

		//final key word doesnt chhange once it is  assigned to some value means
	
		System.out.println("Company : " + c.getCompanyName());
		System.out.println("Location : " + c.getLocation());
	}
}