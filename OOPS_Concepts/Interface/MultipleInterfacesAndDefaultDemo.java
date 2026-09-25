//in java 1.8 version,interface introduced default method concepts

interface Demo1
{
	int a=10,b=20;
	default void m1()
	{
		System.out.println("m1 method of Demo1");
	}
	default void m3()
	{
		System.out.println("m3 method of Demo1");
	}
}

interface Demo2
{
	int a=30,b=40;
	default void m2()
	{
		System.out.println("m2 methd of Demo2");
	}
	default void m3()
	{
		System.out.println("m3 methd of Demo2");
	}
}

class DemoClass implements Demo1,Demo2

{
	public void m3()
	{
		System.out.println("m3 method of DemoClass");
		Demo1.super.m3();
		Demo2.super.m3();	
	}
}
	
class MultipleInterfacesAndDefaultDemo
{
	public static void main (String args[])
	{
		DemoClass d1 = new DemoClass();
		d1.m1();
		d1.m2();
		d1.m3();
	}
}