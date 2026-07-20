//11111
//22221
//33321
//44321
//54321

class Pattern9
{
	public static void main(String args[])
	{
		int n = 5;
		for(int i = 1 ; i <= n; i++)
		{
			for(int j = i; j < n; j++)
			{
			System.out.print(i);
			}
			for(int j = i; j >= 1; j-- )
			{
			System.out.print(j);
			}			
		System.out.println( );
		}
	}
}