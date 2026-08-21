import java.util.Arrays;
class UsingLiteral
{
	public static void main(String args[])
	{
		int a[] = {10,20,30,40,50};
		int b[] = {10,20,30,40,50};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(a));
		System.out.println(a==b);

	}
}