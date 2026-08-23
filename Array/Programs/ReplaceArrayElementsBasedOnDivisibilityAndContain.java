/*
input-{12,14,15,10,11,18,22,24,29,13,8,6,5,26}
Consider black number which is divisible by 4
Consider white number which is Contains 4 
Consider grey number which is black & white
Replace black number with -1
Replace white number with -2
Replace grey number with -3
*/


import java.util.Arrays;
class ReplaceArrayElementsBasedOnDivisibilityAndContain
{
	public static void main(String args[])
	{

		int a[] = {12,14,15,10,11,18,22,24,29,13,8,6,5,26};
		for(int i = 0 ; i < a.length ; i++)
			if(contains(a[i]))
				if(a[i] % 4 == 0)
					a[i] = -3;
				else
					a[i] = -2;
			else
				if(a[i] % 4 == 0)
					a[i] = -1;
		System.out.println(Arrays.toString(a));	
	}
	public static boolean contains(int n)
	{
		while(n != 0)
		{
			if(n % 10 == 4)
				return true;
			n /= 10;
		}
		return false;
	}
}





