class Animal
{
	void eat()
	{
		System.out.println("Aniamal eats food");
	}
}
	
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog barks");
	}
}	

class Cat extends Dog
{
	void Meoww()
	{
		System.out.println("Cat Meoww");
	}
}

class HierarchicalInheritance extends Cat
{
	public static void main(String args[])
	{
		Dog d = new Dog();
		d.eat();
		d.bark();
		
		Cat c = new Cat();
		c.eat();
		c.Meoww();
	}
}
