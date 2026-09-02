import java.util.Arrays;
class SortNumberUsingArray
{
	public static void main(String args[])
	{
		int n = 578231;
		int size = 0 , temp = n ;
		while(temp != 0)
		{
			temp /= 10;
			size++;
		}
		int arr[] = new int[size];
		temp = n ; size = 0;
		while(temp != 0)
		{
			arr[size++] = temp % 10;
			temp /= 10;
		}
		Arrays.sort(arr);
		n = 0; 
		for(int i = 0; i < arr.length ; i++)
		{
			n *= 10 ;
			n += arr[i];
		}
		System.out.println(n);
	}
}