class SwapfirstAndLast
{
	public static void main (String args[])
	{
		String s = "India";
		StringBuilder sb = new StringBuilder();
		sb.append(s.charAt(s.length()-1));
		sb.append(s.substring(1,s.length()-1));
		sb.append(s.charAt(0));
		System.out.println(sb);

			//or
		String s1 = "India";
		StringBuilder sb1 = new StringBuilder(s1);
		sb1.insert(0,sb1.charAt(s1.length()-1));
		sb1.append(sb1.charAt(1));
		sb1.deleteCharAt(1);
		sb1.deleteCharAt(sb1.length()-2);
		System.out.println(sb1);

			//or
		String s2 = "India";
		StringBuilder sc = new StringBuilder(s2);
		char first = s2.charAt(0);
		char last = s2.charAt(s2.length()-1);
		sc.setCharAt(0,last);
		sc.setCharAt(sc.length()-1,first);
		System.out.println(sc);
				
	}
}