import java.util.Arrays;
class GreterElementThanAvgOfArray
{
	public static void main(String args[])
	{
		int a[] = {10,20,30,40,50};
		int sum = 0;
		for(int i = 0 ; i < a.length ; i++)
			sum +=a[i];
		double avg = sum/(double)a.length;
		for(int i = 0 ; i < a.length ; i++)
			if(avg < a[i])
				System.out.println(a[i]);
	}
}