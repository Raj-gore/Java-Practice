// 15
// 13  14
// 10  11  12
//  6   7   8  9  
//  1   2   3  4  5

class Pattern5
{
    public static void main(String Args[])
    {
        int n = 5;
        int count = (n * (n + 1)) / 2;
        for(int i = n; i >= 1; i--)
        {
            int c = count;
            for(int j =n ; j >=i ; j--)
            {
                System.out.print(c + "\t");
                c + = j - 1; 
            }   
        System.out.println( ); 
        count ++;   
        }    
    }
}