// How to pass Parameter into Functional interface.

interface Demo2
{
	void m1(int a);
}

class MainClass2
{
	public static void main(String args[])
	{
		Demo2 d1 = (int a) -> System.out.println(a);
		
		Demo2 d2 = (int a ) -> {
			for(int i = 1; i <= a; i++)
				System.out.println(i);
		};
		d1.m1(5);
		d2.m1(5);
	}
}