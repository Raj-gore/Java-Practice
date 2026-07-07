//5
//44
//333
//2222
//11111

class Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = n; i >= 1; i--)
        {
            for(int j = 1; j <= n-i+1 ; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}