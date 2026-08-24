/*

WAP to find sum of 3 elements from array
input - {16,34,41,18,22,20,4,44,28,13,23,27}
key = 50

*/
import java.util.Arrays;
class FindSumOfThreeElements
{
	public static void main(String args[])
	{
		int a[] = {16,34,41,18,22,20,4,44,28,13,23,27};
		int key = 50;
		for(int i = 0 ; i < a.length-2 ; i++)
			for(int j = i+1 ; j < a.length-1 ; j++)
				for(int k = j+1 ; k < a.length ; k++)
				if(a[i] + a[j] + a[k] == key)
					System.out.println(a[i] + "\t" + a[j] + "\t" + a[k]);
	}
}
