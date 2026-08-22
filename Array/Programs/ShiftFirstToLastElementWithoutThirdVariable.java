import java.util.Arrays;
class ShiftFirstToLastElementWithoutThirdVariable
{
	public static void main(String args[])
	{
		int a[] = {10,20,30,40,50};
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			a[i] = a[i] + a[i+1];
			a[i +1] =a[i] - a[i+1];
			a[i] = a[i] - a[i+1];
		}	
		System.out.println(Arrays.toString(a));
	}
}