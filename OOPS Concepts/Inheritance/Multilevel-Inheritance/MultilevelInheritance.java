class GrandParent
{
	void house()
	{
		System.out.println("GrandFather has a house");
	}
}

class Parent extends GrandParent
{
	void car()
	{
		System.out.println("Parent has a car");
	}
}

class Child extends Parent
{
	void bike()
	{
		System.out.println("Child has a bike");
	}
}

class MultilevelInheritance
{
	public static void main(String args[])
	{
		Child c = new Child();
		
		c.house();
		c.car();
		c.bike();
	}
}