// WAP to shift first cahracter to last from String .

class  ShiftFirstCharacterToLast
{
	public static void main (String args[])
	{
		String s1 = "INDIA";
		String s2 = "" ;
		for(int i = 1 ; i < s1.length() ; i++)
		s2 += s1.charAt(i);
		s2 += s1.charAt(0);
		System.out.println(s2);

			//or

		String s = "INDIA";
		StringBuilder sb = new StringBuilder();
		for(int i = 1 ; i < s.length(); i++)
			sb.append(s.charAt(i));
		sb.append(s.charAt(0));
		System.out.println(sb);

			//or

		String s3 = "INDIA";
		StringBuilder sa = new StringBuilder();
		sa.append(s3.substring(1));
		sa.append(s3.charAt(0));
		System.out.println(sa);

			//or
		String s4 = "INDIA";
		StringBuilder sc = new StringBuilder(s4);
		sc.append(sc.charAt(0));
		sc.deleteCharAt(0);
		System.out.println(sc);	

		
		
	}
}