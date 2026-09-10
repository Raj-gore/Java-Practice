class ReplaceVowelsWithIndex
{
	public static void main(String args[])
	{
		String s =  "International";
		String s1 = s.toUpperCase();
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++)
		{
			char c = s1.charAt(i);
			if(c=='A' ||c=='E' ||c=='I' || c=='O' ||c=='U')	
				sb.append(++count);
			else	
				sb.append(s.charAt(i));
		}
		System.out.println(sb);
	}
	
}