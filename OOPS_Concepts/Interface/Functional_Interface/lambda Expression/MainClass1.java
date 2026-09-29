
@FunctionalInterface
interface Demo1
{
	void m1();
}


class MainClass1
{
	public static void main(String args[])
	{
		Demo1 d1 = () ->System.out.println("m1 method of Demo 1");
				
		Demo1 d2 =()->{
			for(int i = 1; i <= 10; i++)
			{
				for(int j = i; j >= 1; j--)
					System.out.print("*");
				System.out.println();
			}	
		};
		d1.m1();
		d2.m1();	
	}
}