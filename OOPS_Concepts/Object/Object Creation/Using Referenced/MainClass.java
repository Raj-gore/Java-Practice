class MainClass
{
	public static void main(String args[])
	{
 		Demo d1 = new Demo();
		Demo d2 = d1;
		d1.a = 10;
		d2.b = 20;
		d1.display();
		d2.display();
		System.out.println(d1==d2);
	}
}