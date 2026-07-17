//54321
//54322
//54333
//54444
//55555

class Pattern8
{
	public static void main(String args[])
	{
		int n = 5;
		for(int i = 1 ; i <= n; i++)
		{
			for(int j = n; j >= 1; j--)
			{
			if(i < j)
				System.out.print(j);
			else
				System.out.print(i);
			}	
		System.out.println( );
		}
	}
}