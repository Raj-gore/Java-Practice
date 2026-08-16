class Demo
{
	int a,b;
	Demo()
	{
		a = 10;
		b = 20;
		System.out.println("default constructor called");
	}
	Demo(int a , int b)
	{
		this.a = a;
		this.b = b;
		System.out.println("user-defined constructor called");
	}
	void display()
	{
		System.out.println("a = "+a+ " b = "+b );
	}
}