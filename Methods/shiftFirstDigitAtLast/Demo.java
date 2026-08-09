class Demo
{
	int shiftFirstDigitAtLast (int n)
	{
		int first = n , power = 1;
		while(first > 9)
		{
			first /= 10;
			power *= 10;
		}
		n %= power;
		n *= 10;
		n += first;
		return n;
	}
}