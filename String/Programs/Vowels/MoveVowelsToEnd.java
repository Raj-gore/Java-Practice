class MoveVowelsToEnd
{
	public static void main(String args[])
	{
		String s1 = "Education";
		String cons = s1.replaceAll("[AEIOUaeiou]","");
		String Vow = s1.replaceAll("[^AEIOUaeiou]","");
		cons += Vow;
		System.out.println(cons);
	}
}