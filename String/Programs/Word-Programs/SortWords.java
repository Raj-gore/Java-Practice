//Input - hello i am java developer
//output - am developer hello i java

import java.util.Arrays;	
class SortWords
{
	public static void main(String args[])
	{
		String s1 = " hello i am java developer";
		String s2[] = s1.split("\\s+");
		Arrays.sort(s2);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s2.length; i++)
		{
			sb.append(s2[i]);
			sb.append(" ");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
	}
}