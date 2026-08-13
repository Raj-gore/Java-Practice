// WAM to find sum of n by using recursion .

class Demo
{
	int findSumOfN(int n)
	{
		if(n == 1)
			return n;
		return n + findSumOfN(n - 1);
	}
}