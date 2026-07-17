//55555
//44445
//33345
//22345
//12345

class Pattern13
{
	public static void main(String args[])
	{
		int n = 5;
		for(int i = n ; i >= 1; i--)
		{
			for(int j = i; j > 1; j--)
			{
			System.out.print(i);
			}
			for(int j = i; j <= n; j++ )
			{
			System.out.print(j);
			}			
		System.out.println( );
		}
	}
}