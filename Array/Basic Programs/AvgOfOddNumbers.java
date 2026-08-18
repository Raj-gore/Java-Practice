import java.util.Arrays;
class AvgOfOddNumbers
{
	public static void main(String args[])
	{
		int a[] = {10,13,3,7,5,35,6};
		int oddSum = 0;
		int oddCount = 0;
		for(int i = 0 ; i < a.length ; i++)
			if(a[i] % 2 != 0)
			{
				oddSum += a[i];
				oddCount ++;
			}
		double oddAvg = oddSum/(double) oddCount;
		System.out.println(oddAvg);
	}
}