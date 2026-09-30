interface Demo4
{
	int m1(int a, int b);
}

class MainClass4
{
	public static void main(String args[])
	{
		Demo4 d1 = (int a, int b)->a+b;

		Demo4 d2 = (int a, int b)->{
			int sum = 0;
			for(int i = a; i <= b; i++)
				sum +=i;
			return sum;
		};
		System.out.println(d1.m1(60,40));
		System.out.println(d2.m1(1,2));
	}
}