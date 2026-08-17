import java.util.Arrays;
class SumOfElements
{
	public static void main(String args[])
	{
		int a[] = {10,30,4,44,100};
		int sum = 0;
		for(int i = 0 ; i < a.length ; i++)
			sum += a[i];
		System.out.println(sum);
	}
}