class ShiftLastCharacterToFirst
{
	public static void main(String args[])
	{
		String s1 = "INDIA";
		String s2 = " ";
		s2 = s2 + s1.charAt(s1.length()-1);  
		for(int i = 0; i < s1.length()-1; i++)
			s2 = s2 + s1.charAt(i);
		System.out.println(s2);

			//or
		String s = "India";
		StringBuilder sa = new StringBuilder();
		sa.append(s.charAt(s.length()-1));
		for(int i = 0; i < s.length()-1; i++)
			sa.append(s.charAt(i));
		System.out.println(sa);

			//or

		String s3 = "India";
		StringBuilder sb = new StringBuilder();
		sb.append(s3.charAt(s3.length() - 1));
		sb.append(s3.substring(0, s3.length() - 1));
		System.out.println(sb);

			//or

		String s4 = "India";
		StringBuilder sc = new StringBuilder(s4);
		sc.insert(0,s4.charAt(s4.length()-1));
		sc.deleteCharAt(sc.length()-1);
		System.out.println(sc);
		
	}
		

}