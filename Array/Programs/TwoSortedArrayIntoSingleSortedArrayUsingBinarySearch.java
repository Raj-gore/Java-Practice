//WAP to 2 sorted Array into a array using binary search.

import java.util.Arrays;
class TwoSortedArrayIntoSingleSortedArrayUsingBinarySearch
{
	public static void main(String args[])
	{
		int a[] = {2,5,7,9,11};
		int b[] = {1,3,4,6,8,12,13,14,15,20};
		int c[] =  binarchSearch(a,b);
		System.out.println(Arrays.toString(c));
	}
	private static int[] binarchSearch(int a[],int b[])
	{
		int c[] = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while(i < a.length && j < b.length)
			c[k++] = (a[i]<b[j])?a[i++]:b[j++];
		while(i < a.length)
			c[k++] = a[i++]; 
		while(j < b.length)
			c[k++] = b[j++];	
		return c;
	}
}