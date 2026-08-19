
//WAP to dispaly avg of odd & sum element of an array.

import java.util.Arrays;
class AvgOfOddAndSumElement
{
	public static void main(String args[])
	{
		int a[] = {10,13,3,7,5,6};
		int oddSum = 0;
		int oddCount = 0;
		int evenSum = 0;
		for(int i = 0 ; i < a.length ; i++)
			if(a[i] % 2 != 0)
			{
				oddSum += a[i];
				oddCount ++;
			}
			else
				evenSum +=a[i];
		double oddAvg = oddSum/(double) oddCount;
		double avgEven = evenSum/(double) (a.length-oddCount);
		System.out.println(oddAvg);
		System.out.println(avgEven);

	}
}