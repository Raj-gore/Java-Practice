interface Demo 
{
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
}

class HelperClass implements Demo
{
	public void m1(){}
	public void m2(){}
	public void m3(){}
	public void m4(){}
	public void m5(){}
}

class DemoClass extends HelperClass implements Demo
{
	public void m1()
	{
		System.out.println("m1 method of DemoClass");
	}
}

class HelperClassMainClass
{
	public static void main(String args[])
	{
		DemoClass d1 = new DemoClass();
		d1.m1();
		d1.m2();
		d1.m3();
		d1.m4();
		d1.m5();
	}
	
}







