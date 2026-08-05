class Demo
{
 	int addSumAtLast(int n)
	{
		int sum = 0 , temp = n;
		while(temp != 0)
		{
		sum += temp % 10;
		temp /= 10;
		}
		n *= (sum < 10)? 10:100;
		n += sum;
		return n;
	}
}