class Demo
{
	int findMax(int n)
	{
		int max = 0;
		while(n != 0)
		{
			int last = n % 10;
			if (last > max)
				max=last;
			n /= 10;
		}
		return max;
	}
}