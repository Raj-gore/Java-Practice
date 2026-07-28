/* 

*****
* * *
* * *
*****
* * *
* * *
*****

*/
 
class Pattern12
{
    public static void main(String args[])
    {
        int n = 5;
        int m = 7;
        for(int i=1 ; i<=m ; i++)
        {
            for(int j=1 ; j<=n ; j++)
                if(j==1 || j==n ||i==1 || i==m ||i==n-1 ||j==n-2)
                    System.out.print( "*");
                else
                     System.out.print(" " );
                System.out.println( );
        }
    }
}
