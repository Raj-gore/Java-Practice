class Demo
{
	boolean checkArmStrong (int n)
	{
		int sum = 0, power = 0 , temp = n;
		while(temp != 0)
		{
			power ++;
			temp /= 10;
		}
		temp = n;
		while(temp != 0)
		{
			sum += Math.pow(temp % 10, power);
			temp /= 10;
		}
		return sum == n;
	}
}