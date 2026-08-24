/*
WAP to search for a given elements in a sorted array using binary search algorithm
*/

import java.util.Arrays;
class SearchElementUsingBinarySearch
{
	public static void main(String args[])
	{
		int a[] = {2,3,5,7,9,11,35,78};
		int key = 2;
		int index = binarySearch(a,key);
		System.out.println(index);
	}
	private static int binarySearch(int a[],int key)
	{
	int start = 0 , end = a.length-1;
	while(start <= end)
	{
		int mid = start + (end-start)/2;
		if(a[mid]>key)
			end = mid-1;
		else if(a[mid]<key)
			start = start+1;
		else
			return mid;	
	}
	return -1;
	}
}