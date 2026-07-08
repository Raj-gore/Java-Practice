// A
// BB
// CCC
// DDDD
// EEEEE


class Pattern1
{
    public static void main(String[] args0 ) {
        int n =5;
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
              System.out.print((char)(i+64));
            }
        System.out.println();
        }

    }
}