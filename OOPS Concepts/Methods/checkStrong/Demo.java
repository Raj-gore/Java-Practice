class Demo
{
	boolean checkStrong (int n)
	{
		if(n==0)
			return false;
		else
		{
			int sum = 0 , temp = n;
			while(temp != 0)
			{
				int fact= 1;
				for(int i = 1; i <= temp %10; i++)
					fact *= i;
				sum += fact;
				temp /= 10;
			}
			return sum == n;
		}
	}
	
}