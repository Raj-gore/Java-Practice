import java.util.Arrays;
class BubbleSort
{
	public static void main(String args[])
	{
		int a[] = {20,25,13,12,24,37,38};
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
	private static void bubbleSort(int a[])
	{
		for(int i = 0; i < a.length-1; i++)
			for(int j = 0; j < a.length-1-i; j++)
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
	}
}