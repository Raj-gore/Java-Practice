import java.util.Arrays;
class UsingObjectArray
{
	public static void main(String args[])
	{
		Object a[] = {10,'a',"ABC",true,3.5,new UsingObjectArray()};
		System.out.println(Arrays.toString(a));
	}
}