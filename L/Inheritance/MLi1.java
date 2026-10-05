//MLi1 = MultiLvel Inheritance Progarmme 1 

//Here in this programme we used constructor so the varaible is accessable directly , but in method we cannot directly use them hence we use 'static' key word to make it accessabl eto evrvy class and method


class Parent 
{

	static int PAmount = 100000;  			 //Static/Class variable

	int PAmount = 100000;				//Instance varaible , then they are accessabl everywhere 
	
	Parent()
	{

	//int PAmount = 100000;   //These are called local variables (Only Accesable inside this particular method/Coonstructor)
	System.out.println("Parent Amount is : " + PAmount);
	System.out.println("Parent Total Amount is : " + PAmount);

	}
	
}

class Child extends Parent
{
	static int CAmount = 10000;  		 //Static/Class variable
	
	//int CAmount = 10000;  		//Instance varaible

	Child()
	{

	//int CAmount = 10000;		//These are called local variables 
	System.out.println("Child Amount is : " + CAmount);
	System.out.println("Child Total Amount is : " + (CAmount+PAmount) );

	}

}

class GrandChild extends Child
{
	static int GCAmount = 1000; 	 //Static/Class variable


	GrandChild()
	{

	//int GCAmount = 1000;		//These are called local variables 
	System.out.println("GrandChild Amount is : " + GCAmount);
	System.out.println("GrandChild Total Amount is : " + (CAmount+PAmount+GCAmount));

	}
}

public class MLi1
{
	public static void main(String[] args)
	{
		GrandChild a = new GrandChild();
	}
}