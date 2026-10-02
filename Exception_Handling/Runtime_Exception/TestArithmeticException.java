class TestArithmeticException
{
	public static void main(String argd[])
	{
		System.out.println("Program Started");
		int a = 10,b = 20 , c = 0;
		try{
		c=a/b;
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println(c);
		System.out.println("Program Ended");
	}
}