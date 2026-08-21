import java.util.Arrays;
class AnonymousWay
{
	public static void main(String args[])
	{

		int size = new int[] {10,20,30,40}.length;
		System.out.println(size);
		int value = new int[] {10,20,30}[1];
		System.out.println(value);
		System.out.println(Arrays.toString(new int[]{11,22,33}));

	}
}
