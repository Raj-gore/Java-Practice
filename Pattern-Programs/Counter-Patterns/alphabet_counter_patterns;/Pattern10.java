// E
// ID
// LHC
// NKGB
// OMJFA

class Pattern10
{
    public static void main(String args[])
    {
        int n = 5;
        int count = 5;
        for(int i = n; i >= 1; i--)
        {
            int c = count;
            for(int j = i ; j <= n ; j++)
            {
                System.out.print((char)(c +64));
                c -= j+1; 
            }   
        System.out.println( ); 
        count +=i-1;   
        }    
    }
}