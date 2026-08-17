class MainClass
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		d1.a = 100;
		d1.b = 200;
		Demo d2 = d1.clone();
		d1.display();
		d2.display();
		System.out.println(d1 == d2);
	}
}