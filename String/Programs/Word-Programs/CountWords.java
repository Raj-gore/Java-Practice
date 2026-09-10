class CountWords
{
	public static void main(String args[])
	{
		String s1 = "hello i am java developer";
		int count = 0 ;
		for(int i = 0; i < s1.length(); i++)
		if(s1.charAt(i) ==' ')
			count ++;
		count +=1;
		System.out.println(count);

			//OR
		
		String s2 = "hello i am java developer";
		int count1 = 0 ;	
		String s3[] = s2.split(" ");
		for(int i = 0; i < s3.length; i++)
		if(s3[i].length() != 0)
			count1++;
		System.out.println(count1);

			//OR
		String s4 = "hello i am java developer";
		String s5[] = s4.trim().split("\\s+");
		System.out.println(s5.length);

	}
}
