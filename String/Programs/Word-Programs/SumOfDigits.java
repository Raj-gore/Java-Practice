class SumOfDigits
{
	public static void main(String args[])
	{
		String s1 = "Welcome to 2027";
		int sum = 0;
		for(int i = 0; i < s1.length(); i++)
		{
			char c = s1.charAt(i);
			if(Character.isDigit(c))
				sum += Character.getNumericValue(c);
		}
		System.out.println(sum);
	}
}