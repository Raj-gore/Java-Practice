class MainClass
{
	public static void main(String args[])
	{
 		Demo d1 = new Demo();
		Demo d2 = new Demo();
		d1.display();
		d2.display();
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
	}
}