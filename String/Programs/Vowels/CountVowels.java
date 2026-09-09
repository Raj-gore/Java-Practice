class CountVowels
{
	public static void main(String args[])
	{

		String s1 = "Education";
		int count = 0 ;
		for(int i = 0 ; i < s1.length()-1; i++)
		if(s1.charAt(i)=='A' || s1.charAt(i)=='a' || s1.charAt(i)=='E' ||
s1.charAt(i)=='e' || s1.charAt(i)=='I' || s1.charAt(i)=='i' || s1.charAt(i)=='O' || s1.charAt(i)=='o' || s1.charAt(i)=='U' || s1.charAt(i)=='u')
			count++;
		System.out.println(count);

			//OR
	
		String s = "Education";
		int count1 = 0;
		for(int i = 0; i < s.length()-1; i++)
		{
		char c = s.charAt(i);
		if(c == 'A' || c== 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u')
			count1++;
		}
		System.out.println(count1);
	
			//OR

		String s2 = "Education";
		String s3 = s2.toUpperCase();
		int count2 = 0;
		for(int i = 0; i < s3.length()-1; i++)
		{
		char c1 = s3.charAt(i);
		if(c1=='A' ||c1=='E' ||c1=='I' ||c1=='O' ||c1=='U')
			count2++;
		}
		System.out.println(count2);

			//OR
		String s4 = "Education";
		String s5 = "AEIOUaeiou";
		int count3 = 0;
		for(int i = 0; i < s4.length()-1; i++)
		{
		char c2 = s4.charAt(i);
			if(s5.contains(s4.valueOf(c2)))
				count3++;
		}
		System.out.println(count3);

			//OR

		String s6 = "Education";
		String s7 = s6.replaceAll("[^AEIOUaeiou]","");
		System.out.println(s7.length());
		


	}
}