class User
{
	private String username;
	private String password;

	public void setUsername(String username)
	{
		this.username = username;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getUsername()
	{
		return username;
	}

	public boolean login(String password)
	{
		return this.password.equals(password);
	}
}

public class login
{
	public static void main(String args[])
	{
		User u = new User();
		
		u.setUsername("Admin");
		u.setPassword("Admin@123");

		System.out.println(u.getUsername());

	
		if (u.login("Admin@123"))
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Invalid Password...!!");
		}
	
	}
}