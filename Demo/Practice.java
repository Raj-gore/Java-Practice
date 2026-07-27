// EDCBABCDE
// EDCB BCDE
// EDC   CDE 
// ED     DE 
// E       E

class Practice
{
	public static void main(String args[])
	{
		int n = 5;
		for(int i=1 ; i<=n ; i++)
		{
			if( i==1)
			{
				for(int j=n; j>=i ; j--)
					System.out.print((char)(j+64));
				for(int j=2 ; j<=n ; j++)
					System.out.print((char)(j+64));
			}
			else
			{
				for(int j=n ; j>=i ; j--)
					System.out.print((char)(j+64));
				for(int j=1 ; j<=(i*2)-3 ; j++)
					System.out.print(" ");
				for(int j=i ; j<=n ; j++)
					System.out.print((char)(j+64));

			}
			System.out.println( );
		}
	}
}
