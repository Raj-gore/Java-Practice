class TestNumberFormatException
{
	public static void main(String args[])
	{
		System.out.println("Program Started");
		String s1 = "a123";
		int value = 0;
		try{
		value = Integer.parseInt(s1);
		}catch(NumberFormatException e){
			System.out.println(e);
		}
		System.out.println(value);
		System.out.println("Program Ended");

	}
}