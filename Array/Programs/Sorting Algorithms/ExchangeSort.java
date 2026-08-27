import java.util.Arrays;
class ExchangeSort
{
	public static void main(String args[])
	{
		int a[] = {5,6,8,1,2,9,3,4,7};
		exchangeSort(a);
		System.out.println(Arrays.toString(a));
	}
	private static void exchangeSort(int a[])
	{
		for(int i = 0; i < a.length-1; i++)
			for(int j = i+1 ; j < a.length; j++)
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
	}
}