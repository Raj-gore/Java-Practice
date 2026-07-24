/*

A       A
bb     bb
CCC   CCC
dddd dddd
EEEEEEEEE
dddd dddd
CCC   CCC
bb     bb
A       A

*/

class Pattern9
{
	public static void main(String args[])
	{
		int n = 5;
		for(int i=1 ; i<=5 ; i++)
		{
			if( i==n)
			{
				for(int j=n*2-1; j>=1 ; j--)
					System.out.print((char)(i+64));
			}
			else
			{
				for(int j=i ; j>=1 ; j--)
					System.out.print((char)(i+((i % 2 != 0) ? 64 : 96)));
				for(int j=1 ; j<=((n-i+1)*2)-3 ; j++)
					System.out.print(" ");
				for(int j=i ; j>=1; j--)
					System.out.print((char)(i+((i % 2 != 0) ? 64 : 96)));
			}
			System.out.println( );
		}
        for(int i=n-1 ; i>=1 ; i--)
		{
			if( i==n)
			{
				for(int j=n*2-1; j>=1 ; j--)
					System.out.print((char)(i+64));
			}
			else
			{
				for(int j=i ; j>=1 ; j--)
					System.out.print((char)(i+((i % 2 != 0) ? 64 : 96)));
				for(int j=1 ; j<=((n-i+1)*2)-3 ; j++)
					System.out.print(" ");
				for(int j=i ; j>=1; j--)
					System.out.print((char)(i+((i % 2 != 0) ? 64 : 96)));
			}
			System.out.println( );
		}

	}
}
