/*

Ea  Db  Cd  Bg  Ak  
Ic  He  Gh  Fi
Lf  Ki  Jm
Nj  Mn
Oo

*/

 class Pattern7
 {
    public static void main(String args[])
    {
        int n = 5;
        int count1 = 5;
        int count2 = 1;
        for(int i=n ; i>=1 ; i--)
        {
            int c1 = count1;
            int c2 = count2;
            for(int j=i,j1=1; j>=1 && j1<=n ; j--,j1++)
            {
                System.out.print((char)(c1+64));
                System.out.print((char)(c2+96));
                System.out.print("\t");
                c1 --;
                c2 += n-i+j1;
            }
            System.out.println();
            count1 +=i-1 ;
            count2 += n-i+2;
        }

    }
 }