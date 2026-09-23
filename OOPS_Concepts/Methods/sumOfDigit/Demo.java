
//Write a Method to find sum of digit of given numbers.
class Demo
{
	int sumOfDigit(int n)
	{
		int sum = 0;
		while(n != 0)
		{
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}	
	
}