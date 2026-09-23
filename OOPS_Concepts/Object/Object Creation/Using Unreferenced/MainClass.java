class MainClass
{
	public static void main(String args[])
	{
 		Demo d1 = new Demo();
		d1.a = 10;
		d1.b = 20;
		d1.display();
		new Demo().a = 10;
		new Demo().b = 20;
		new Demo().display();
	}
}