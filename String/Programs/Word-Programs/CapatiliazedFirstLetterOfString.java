class CapatiliazedFirstLetterOfString
{
	public static void main(String args[])
	{
		String s1 = "hello i am java developer";
		String s2[] = s1.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s2.length; i++)
		{
			String temp = s2[i];
			sb.append(Character.toUpperCase(temp.charAt(0)));
			sb.append(temp.substring(1));
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
	}
}