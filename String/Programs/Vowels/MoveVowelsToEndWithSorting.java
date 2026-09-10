//input - International
//output - ntrntnlaaeio
import java.util.Arrays;	
class MoveVowelsToEndWithSorting
{
	public static void main (String args[])
	{
		String s1 = "International";
		String cons = s1.replaceAll("[AEIOUaeiou]","");
		String Vow = s1.replaceAll("[^AEIOUaeiou]","");
		char c[] = Vow.toCharArray();
		Arrays.sort(c);
		cons += new String(c);
		System.out.println(cons);

	}

}