class FindMissingElementFromConsecutiveSequenceArray
{
	public static void main(String args[])
	{
		int a[] = {11,12,13,14,16,17,18};
		int n = a[a.length-1];
		n = n*(n+1)/2;
		int m = a[0];
		m -= 1;
		m = m*(m+1)/2;
		n -= m;
		for(int i = 0 ; i< a.length; i++)
			n -= a[i];
		System.out.println(n);
	}
}