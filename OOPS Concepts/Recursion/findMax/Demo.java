class Demo 
{
	int findMax(int n, int max)
	{
		if( n==0 )
			return max;
		if(n % 10 > max)
			max = n%10;
		return findMax(n/10,max);
	}
}