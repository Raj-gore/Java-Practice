class Demo
{
	static 
	{
		System.out.println("Static block called");
	}
	int a,b;
	Demo()
	{
		System.out.println("default constructor called");
	}
	void display()
	{
		System.out.println("a = "+a+ " b = "+b);
	}	
}