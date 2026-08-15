// WAM to return sum of factorial by using recursion .

class Demo
{
	int findFactorialOfN(int n)
	{
		if(n == 1)
			return n;
		return n * findFactorialOfN(n - 1);
	}
}