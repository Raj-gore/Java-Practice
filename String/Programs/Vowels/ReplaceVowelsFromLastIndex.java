//input - International
//output - 6nt5rn4t32n1l

class ReplaceVowelsFromLastIndex
{
	public static void main(String args[])
	{
		String s = "International";
		StringBuilder sb = new StringBuilder(s);
		String s1 = s.toUpperCase();
		int count = 0;
		for(int i = s1.length()-1; i >= 0 ; i--)
		{
			char c = s1.charAt(i);
			if(c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U')
			{
				sb.deleteCharAt(i);
				sb.insert(i,++count);
			}
		}
		System.out.println(sb);	
	}
}