
import java.util.Arrays;
class SelectionSort
{
	public static void main(String args[])
	{
		int a[] = {7,6,4,3,5,8,9,1,2};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}
	private static void selectionSort(int a[])
	{
		for(int i = 0; i < a.length-1 ; i++)
		{
			int index = i;
			for(int j = i+1 ; j < a.length ; j++)
				if(a[j] < a[index])
					index = j ;
			int temp = a[i];
			a[i] = a[index];
			a[index] = temp;
		}
			
	}
}