import java.util.Arrays;
class SumOfEvenElements
{
	public static void main(String args[])
	{
		int a[] = {10,30,4,444,3,100};
		int sum = 0;
		for(int i = 0 ; i < a.length ; i++)
			if(a[i]%2 == 0)
				sum += a[i];
		System.out.println(sum);
	}
}