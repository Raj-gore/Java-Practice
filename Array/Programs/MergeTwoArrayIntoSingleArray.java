//WAP to merge 2 array into a single array.

import java.util.Arrays;
class MergeTwoArrayIntoSingleArray
{
	public static void main(String args[])
	{
		int a[] = {10,20,30,40,50};
		int b[] = {4,60,70,38,10,26,88,74,94,100};
		int c[] = merge(a,b);
		System.out.println(Arrays.toString(c));
	}
	private static int[] merge(int a[], int b[])
	{
		int c[]	 = new int [a.length + b.length];
		for(int i = 0; i < a.length; i++)
			c[i] = a[i];
		for(int i = 0; i < b.length; i++)
			c[a.length+i] = b[i];
		return c;
	}
}