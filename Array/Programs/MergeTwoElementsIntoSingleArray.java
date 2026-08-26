//WAP to merge 2 elements into a single array.

import java.util.Arrays;
class MergeTwoelementsIntoSingleArray
{
	public static void main(String args[])
	{
		int a[] = {1,3,5,7,9};
		int b[] = {2,4,6,8,10,11,12,13,14,15};	
		int c[] = mergeElemnts(a,b);
		System.out.println(Arrays.toString(c));
		
	}
	private static int[] mergeElemnts(int a[],int b[])
	{
		int c[] = new int[a.length + b.length];
		int i = 0,j = 0,k = 0;
		while(i < a.length && j <b.length)
		{
			c[k++] = a[i++];
			c[k++] = b[j++];
		}
		while(i < a.length)
			c[k++] = a[i++];
		while(j < b.length)
			c[k++] = b[j++];
		return c;
	}
}