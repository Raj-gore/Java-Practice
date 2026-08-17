class Demo
{
	int a,b;
	void display()
	{
		System.out.println("a = "+a+ " b = "+b);
	}
	Demo()
	{
		System.out.println("default constructor called");
	}
	Demo(Demo d1)
	{
		a = d1.a;
		b = d1.b;
		System.out.println("Copy constructor called");
	}
}