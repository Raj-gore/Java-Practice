//WAP to search given element in a sorted array using binary search algorithm.

import java.util.Arrays;
class SearchElementUsingBinarySearch
{
	public static void main(String args[])
	{
		int a[] ={8,10,11,17,21,26,35,45,50,65,80};
		int key = 17;
		int index = binarySearch(a,key,0,a.length-1);
		System.out.println(index);
		
	}
	private static int binarySearch(int a[],int key,int start,int end)
	{
		if(start < end)
		{
			int mid = start +(end - start)/2;
			if(a[mid]>key)
				return binarySearch(a,key,start,mid-1);
			else if(a[mid]<key)
				return binarySearch(a,key,mid+1,end);
			else
				return mid;
		}
		return -1;
	}
}