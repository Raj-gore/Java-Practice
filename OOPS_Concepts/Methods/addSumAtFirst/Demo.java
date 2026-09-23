class Demo
{
	int addSumAtFirst(int n)
	{
		int temp = n, sum=0, power = 1;
		while(temp != 0)
		{
			sum += temp % 10;
			power *= 10;
			temp /= 10;
		}
		sum *= power;
		n += sum;
		return n;
	}
}