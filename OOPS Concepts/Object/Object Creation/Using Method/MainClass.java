class MainClass
{
	public static void main(String args[])
	{
		System.out.println("Program Started");
		try
		{
			Class c = Class.forName("Demo");
			Demo d1 = (Demo)c.newInstance();
			d1.a = 10;
			d1.b = 20;
			d1.display();
		}
		catch(ClassNotFoundException | InstantiationException | IllegalAccessException e)
		{
			System.out.println(e);
		}
		System.out.println("Program Ended");
	}
}