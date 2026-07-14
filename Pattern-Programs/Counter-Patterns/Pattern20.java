
class Pattern20
{
    public static void main(String Args[])
    {
        int n = 5;
        int count = (n*(n+1))/2 ;
        for(int i = 1; i <= n; i++)
        {
            int c = count;
            for(int j = n; j >= i; j--)
            {
                System.out.print(c + "\t");
                c -= j; 
            }   
        System.out.println( ); 
        count --;   
        }    
    }
}