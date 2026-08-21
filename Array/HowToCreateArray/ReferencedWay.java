import java.util.Arrays;
class ReferencedWay
{
	public static void main(String args[])
	{
		int a[] = new int[5];
		int b[] = a;
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}