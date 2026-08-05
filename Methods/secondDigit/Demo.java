class Demo
{
	//WAM to find Second digit of given number.

	int secondDigit(int n)
	{
		while(n>99)
			n/=10;
		return n % 10;
	}
}