class Animal 
{
	void sound()
	{
		System.out.println("Animal makes Sound ");
	}
}

class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dog Barks");

	}
}

class Cat extends Animal
{
	void sound()
	{
		System.out.println("Cat Meows");

	}
}

public class por
{
	public static void main(String[] args)
	{

		//Genaral execution 
		//Dog d = new Dog();
				      // this can be written as 
				      // Dog d ;
				      // d = new dog();
				      // d.sound();
		//Cat c = new Cat();
		//d.sound();
		//c.sound();


		//Using the refernce of parent class and calling 

		Animal a;

		a = new Dog();
		a.sound();

		a = new Cat();
		a.sound();

	}
}

//Same name same parametrs but different implemetation 
//one in many forms 
//This is called method overridding
//Runtime polymorphism 