interface Demo1<A , B>
{
	void m1(A a , B b);
}

class MainClass2
{
	public static void main(String args[])
	{
		Demo1<String, Integer> d1 = (String s1, Integer a) -> System.out.println(s1.substring(a));

		Demo1<String,String> d2 = (String s1, String s2) -> System.out.println(s1.equals(s2));

		d1.m1("International",4);
		d2.m1("School","School");
	}
}