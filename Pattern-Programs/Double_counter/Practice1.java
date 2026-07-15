// Ak   Cg   Fd   Jb   Oa
// Bl   Eh   Ie   Nc
// Dm   Hi   Mf
// Gn   Lj
// K0

class Practice1
{
    public static void main(String args[])
    {
        int n =5;
        int count1 =1 ;
        int count2 = (n*(n-1)/2)+1 ;
        for(int i = 1; i <= n; i++)
        {   
            int c1 =count1;
            int c2 =count2;
            for(int j = i,j1 = n; j <= n && j1 >= i; j++,j1--)
            {
                System.out.print((char)(c1+64));
                System.out.print((char)(c2+96));
                System.out.print("\t");
                c1 +=j+1;
                c2 -=j1-1;
            }
            System.out.println( );
            count1 += i;
            count2 ++;
        }    
    } 

}