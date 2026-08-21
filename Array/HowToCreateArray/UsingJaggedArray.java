import java.util.Arrays;
class UsingJaggedArray
{
	public static void main(String args[])
	{
		int a[][] = {{10,20},{10},{10,20,30},{10,20,30,40}};
		for(int i = 0 ; i<a.length ; i++)
		{
			System.out.println(Arrays.toString(a[i]));
		}	

	}

}