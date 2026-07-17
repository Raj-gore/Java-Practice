//55555
//54444
//54333
//54322
//54321

class Pattern12
{
	public static void main(String args[])
	{
		int n = 5;
		for(int i = n ; i >= 1; i--)
		{
			for(int j = n; j > i; j--)
			{
			System.out.print(j);
			}
			for(int j = i; j>= 1; j-- )
			{
			System.out.print(i);
			}			
		System.out.println( );
		}
	}
}