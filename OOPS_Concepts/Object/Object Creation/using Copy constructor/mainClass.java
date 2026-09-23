class MainClass
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		d1.a = 40;
		d1.b = 20;
		Demo d2 = new Demo(d1);
		d1.display();
		d2.display();
		System.out.println(d1 == d2);
	}
}