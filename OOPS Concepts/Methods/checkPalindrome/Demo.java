class Demo
{
	boolean checkPalindrome (int n)
	{
		int sum = 0 , temp =n ;
		while(temp != 0)
		{
			sum *= 10;
			sum += temp % 10;
			temp /= 10;
		}
		return sum == n;
	}
}