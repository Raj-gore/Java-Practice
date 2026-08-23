
//Write a Java program to left rotate an array by 4 positions using the reversal algorithm.
//input -{10, 20, 30, 40, 50, 60, 70, 80, 90, 100}
//output -[50, 60, 70, 80, 90, 100, 10, 20, 30, 40]


import java.util.Arrays;

class MainClassshiftAtLast
{
	public static void main(String args[])
	{
		int a[] = {10,20,30,40,50,60,70,80,90,100};
		shiftAtLast(a,0,3);
		System.out.println(Arrays.toString(a));
	}
	private static void shiftAtLast(int a[], int start, int end)
	{
		reverse(a,start,end);
		reverse(a,end+1,a.length-1);
		reverse(a,start,a.length-1);
	}
	private static void reverse(int a[], int start, int end)
	{
		while(start < end)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
}