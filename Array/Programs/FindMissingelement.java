import java.util.Arrays;
class FindMissingElement
{
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,6,7,8};
		int n = a[a.length-1];
		n = n*(n+1)/2;
		for(int i = 0; i < a.length ; i++)
			n -= a[i];
		System.out.println(n);
	}
}