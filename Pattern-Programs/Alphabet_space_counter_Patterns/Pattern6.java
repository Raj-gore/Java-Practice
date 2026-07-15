//     E
//    DI
//   CHL
//  BGKN
// AFJMO

class Pattern6
{
    public static void main(String args[])
    {
        int n = 5;
        int count =5;
        for(int i = n; i >= 1; i--)
        {
            int c = count;
            for(int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for(int j = n; j >=i;j--)
            {
                System.out.print((char)(c+64));
                c+=j;
            }     
        System.out.println( ); 
        count --;   
        }    
    }
}
