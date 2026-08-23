
//Write a Java program to left rotate an array by 4 positions using the reversal algorithm.
//input -{10, 20, 30, 40, 50, 60, 70, 80, 90, 100}
//output -[70, 80, 90, 10, 20, 30, 40, 50, 60, 100]


import java.util.Arrays;

class MainClassshiftAtFirst
{
	public static void main(String args[])
	{
		int a[] = {10,20,30,40,50,60,70,80,90,100};
		shiftAtFirst(a,6,8);
		System.out.println(Arrays.toString(a));
	}
	private static void shiftAtFirst(int a[], int start, int end)
	{
		reverse(a,start,end);
		reverse(a,0,start-1);
		reverse(a,0,end);
	}
	private static void reverse(int a[], int start, int end)
	{
		while(start < end)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] =temp ; 
			start++;
			end--;
		}
	}
}