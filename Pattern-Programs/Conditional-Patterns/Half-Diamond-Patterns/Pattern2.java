/*

1
22
333
4444
55555
4444
333
22
1

*/
class Pattern2
{
    public static void main(String args[])
    {
        int n =5;
        for(int i = 1; i <=(n*2)-1; i++)
        {
            if(i <= n)
                for(int j = i; j >= 1; j--)
                System.out.print(i);
            else
                for(int j = i; j <= (n*2)-1; j++)
                System.out.print(n*2-i);
            System.out.println( );
        }
    }
}