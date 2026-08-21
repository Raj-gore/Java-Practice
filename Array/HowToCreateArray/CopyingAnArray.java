import java.util.Arrays;
class CopyingAnArray
{
	public static void main(String args[])
	{
		int a[] = {10,20,30,40};
		int b[] = Arrays.copyOf(a,3);
		int c[] = Arrays.copyOf(a,10);
		int d[] = Arrays.copyOfRange(a,1,4);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
	}
}