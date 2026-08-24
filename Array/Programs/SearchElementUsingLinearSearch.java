
/*

WAP to search for a given elements in an array using linear search algorithm

*/


import java.util.Arrays;
class SearchElementUsingLinearSearch
{
	public static void main(String args[])
	{
		int a[] = {1,3,34,4,54,6,7,9,0,2};
		int key = 0;
		int index = linearSearch(a,key);
		System.out.println(index);
	}
	public static int linearSearch(int a[],int key)	
	{
		for(int i = 0 ; i < a.length ; i++)
			if(a[i] == key)
				return i;
			return -1; 
	}
	
}