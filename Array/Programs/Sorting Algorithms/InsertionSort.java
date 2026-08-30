
import java.util.Arrays;
class InsertionSort
{
	public static void main(String args[])
	{
		int a[] = {50,30,20,10,40};
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}
	private static void insertionSort(int a[])
	{
		for(int i = 1; i < a.length ; i++)
		{
			int element =a[i];
			int j = i-1;
			while( j >= 0 && a[j] > element)
				a[j+1] = a[j--];
			a[j+1] = element;
		}
	}
}