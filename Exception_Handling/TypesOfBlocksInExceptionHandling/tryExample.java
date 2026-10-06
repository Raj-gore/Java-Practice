

class tryExample
{
	public static void main(String args[])
	{
	try
	{
		int data = 50 / 0; // Risky code that may throw an ArithmeticException
	}catch(ArithmeticException e){
		System.out.println(e);
	}
	}

}