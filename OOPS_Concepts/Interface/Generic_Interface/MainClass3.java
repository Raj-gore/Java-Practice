interface Demo3<A,B>
{
	B m1(A a);
}


class MainClass3
{
	public static void main (String args[])
	{
		Demo3<String,Integer> d1 = (String s1)->s1.length(); 
		Demo3<String,Character> d2 = (String s1)->s1.charAt(0);

		System.out.println(d1.m1("India"));
		System.out.println(d2.m1("India"));
	}
}