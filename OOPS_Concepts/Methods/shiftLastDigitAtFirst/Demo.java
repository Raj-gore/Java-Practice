class Demo
{
	int shiftLastDigitAtFirst (int n)
	{
		int last = n % 10;
		n /= 10;
		int temp = n;
		while(temp != 0)
		{
			last *= 10;
			temp /= 10;
		}
		n += last;
		return n;
	}
}	