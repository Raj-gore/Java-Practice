/*

AbCdEdCbA
bCdE EdCb
CdE   EdC
dE     Ed
E       E
dE     Ed
CdE   EdC
bCdE EdCB
AbCdEdCbA

*/

class Pattern5
{
	public static void main(String args[])
	{
		int n = 5;
		for(int i=1 ; i<=n ; i++)
		{
			if( i==1)
			{
				for(int j=i; j<=n ; j++)
					System.out.print((char)(j + ((j % 2 != 0) ? 64 : 96)));
				for(int j=n-1 ; j>=1 ; j--)
					System.out.print((char)(j + ((j % 2 != 0) ? 64 : 96)));
			}
			else
			{
				for(int j=i ; j<=n ; j++)
				System.out.print((char)(j + ((j % 2 != 0) ? 64 : 96)));
				for(int j=1 ; j<=(i*2)-3 ; j++)
					System.out.print(" ");
				for(int j=n ; j>=i ; j--)
					System.out.print((char)(j + ((j % 2 != 0) ? 64 : 96)));
		    }
        System.out.println();
        }
        for(int i=n-1 ; i>=1 ; i--)
		{
			if( i==1)
			{
				for(int j=i; j<=n ; j++)
					System.out.print((char)(j + ((j % 2 != 0) ? 64 : 96)));
				for(int j=n-1 ; j>=1 ; j--)
					System.out.print((char)(j + ((j % 2 != 0) ? 64 : 96)));
			}
			else
			{
				for(int j=i ; j<=n ; j++)
				System.out.print((char)(j + ((j % 2 != 0) ? 64 : 96)));
				for(int j=1 ; j<=(i*2)-3 ; j++)
					System.out.print(" ");
				for(int j=n ; j>=i ; j--)
					System.out.print((char)(j + ((j % 2 != 0) ? 64 : 96)));
		    }
        System.out.println();
        }

	}
}
        
	