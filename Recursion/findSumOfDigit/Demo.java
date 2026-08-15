class Demo
{
	int findSumOfDigit(int n)
	{
		if(n<10)
			return n;
		return(n % 10)+findSumOfDigit(n/10);
	}
}