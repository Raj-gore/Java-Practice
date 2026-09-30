interface Demo<A>
{
	void m1(A a);
}

class MainClass
{
	public static void main(String args[])
	{
		Demo<Integer> d1 = (Integer a) -> System.out.println(a*a);
		
		Demo<String> d2 = (String s1) -> System.out.println(s1.toUpperCase());
		
		d1.m1(10);
		d2.m1("abc");		
	}
}