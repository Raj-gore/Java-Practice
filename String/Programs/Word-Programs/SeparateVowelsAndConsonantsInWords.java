class  SeparateVowelsAndConsonantsInWords

{
	public static void main(String args[])
	{
		String s1 = "hello i am java developer";
		String s2[] = s1.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s2.length; i++)
		{
			String temp = s2[i];
			String cons = temp.replaceAll("[AEIOUaeiou]","");
			String vow = temp.replaceAll("[^AEIOUaeiou]","");
			sb.append(cons);
			sb.append(vow);
			sb.append(" ");
		}
		System.out.println(sb);

	}
}