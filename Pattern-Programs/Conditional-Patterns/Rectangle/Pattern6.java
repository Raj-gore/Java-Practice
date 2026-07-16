// 11111
// AAAAA
// 11111
// BBBBB
// 11111

public class Pattern6
{
    public static void main(String args[])
	{
		int n = 5;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
			if(i % 2 != 0)
				System.out.print(1);
			else
				System.out.print((char)(i/2 + 64));
			}
        System.out.println( );
		}
	}

}
   
