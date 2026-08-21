import java.util.Arrays;
class SecondMax
{
	public static void main(String args[])
	{
		int a[] = {20,4,37,38,38,96};
		int max = a[0];
		int smax = a[0];
		for(int i = 1 ; i < a.length ; i++)
			if(max < a[i])
			{	
				smax = max;
				max = a[i];
			}
			else if(smax < a[i] && a[i] != max)
				smax = a[i];
		System.out.println(max);
		System.out.println(smax);
	}
}