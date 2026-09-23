class Demo
{
	double avgOfDigit (int n)
	{
		int sum = 0, count = 0;
		while(n != 0)
		{
			sum += n%10;
			n /= 10;
			count++;
		}
		return sum /(double)count;
	}
}