class MyDemo implements Cloneable
{
	int a,b;
	void display()
	{
		System.out.println("a = "+a+ " b = "+b);
	}
	
	public MyDemo clone()
	{
		MyDemo obj = null;
		try{
		obj = (MyDemo) super.clone();
		}catch(CloneNotSupportedException e){
			System.out.println(e);
		}
		return obj;
	}
}

class TestCloneNotSupportedException
{
	public static void main (String args[])
	{
		System.out.println("Program Started");
		MyDemo d1 = new MyDemo();
		d1.a = 10;
		d1.b = 20;
	
		MyDemo d2 = d1.clone();
		d1.display();
		d2.display();
		System.out.println(d1 == d2);
		System.out.println("Program Ended");
	}	
}