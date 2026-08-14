class Demo
{
	int reverseNumber(int n , int sum)
	{
		if( n==0 )
			return sum;
		sum *= 10;
		sum += n%10;
		return reverseNumber(n/10,sum);
	}
}