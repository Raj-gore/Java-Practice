
// WAP to find greter number among of 3 .
public class NestedIfElse {
        public static void main(String args[])
        {
            int a = 50, b = 40, c = 102;
            if(a > b)
            {
                if(a > c)
                {
                    System.out.print("a is bigger");
                }
                else
                {
                    System.out.print("c is bigger");
                }
            }
            else
            {
                if(b > c)
                {
                    System.out.print("b is bigger");
                }
                else
                {
                    System.out.print("c is bigger");
                }
            }
        }
}
