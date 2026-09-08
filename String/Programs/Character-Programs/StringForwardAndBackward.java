class StringForwardAndBackward
{
	public static void  main(String args[])
	{
		String s = "Raj";
		System.out.println("Forward Manner : ");
		for(int i = 0 ; i < s.length() ; i++)
		System.out.println(s.charAt(i));

		System.out.println("Backward Manner : ");
		for(int i = s.length()-1 ; i >= 0 ; i-- )
		System.out.println(s.charAt(i));

	
	}
}