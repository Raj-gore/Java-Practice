interface Demo1
{
	int a =10,b=20;
	void m1();
}

class DemoClass implements Demo1
{
	public void m1()
	{
		System.out.println("m1 method of DemoClass");
	}
}

class InterfaceBasicDemo
{
	public static void main(String args[])
	{
		DemoClass d1 = new DemoClass();
		d1.m1();
		System.out.println(d1.a);
		System.out.println(d1.b);
	}
}