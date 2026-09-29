
// explicit implementation

interface Demo
{
	void m1();
	void m2();
}

class MyDemo1 implements Demo
{
	public void m1(){System.out.println("m1 method of MyDemo1");}
	public void m2(){System.out.println("m2 method of MyDemo1");}
}

class MyDemo2 implements Demo
{
	public void m1(){System.out.println("m1 method of MyDemo2");}
	public void m2(){System.out.println("m2 method of MyDemo2");}
}

class ExplicitImplementation
{
	public static void main(String args[])
	{
		MyDemo1 d1 = new MyDemo1();
		d1.m1();
		d1.m2();

		MyDemo2 d2 = new MyDemo2();
		d2.m1();
		d2.m2();
	}
}





