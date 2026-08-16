class MainClass
{
	public static void main(String args[])
	{	
		Demo d1 = new Demo();
		Demo d2 = new Demo(100,200);
		Demo d3 = new Demo(300,400);
		d1.display();
		d2.display();
		d3.display();
	}
}