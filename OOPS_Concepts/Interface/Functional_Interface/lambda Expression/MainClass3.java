//how to return values from functional interface

interface Demo3
{
	String m1();
}

class MainClass3
{
	public static void main(String args[])
	{
		Demo3 d1 = ()-> "INDIA";
		
		Demo3 d2 = ()-> "Bharat";
		System.out.println(d1.m1());
		System.out.println(d2.m1());
	}
}