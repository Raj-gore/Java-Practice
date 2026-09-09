import java.util.Arrays;
class SortEachCharacterOfString
{
	public static void main(String args[])
	{
		String s = "Computer";
		char c[] = s.toCharArray();
		Arrays.sort(c);
		s = new String(c);
		System.out.println(c);
	}
}