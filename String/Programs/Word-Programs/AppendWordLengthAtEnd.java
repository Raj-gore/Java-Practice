class AppendWordLengthAtEnd
{
	public static void main(String args[])
	{
		String s1 = "Hello i am java developer";
		String s2[] = s1.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s2.length; i++)
		{
			String temp = s2[i];
			sb.append(temp);
			sb.append(temp.length());
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb + " ");
	}
}