import java.util.Scanner;
import java.util.Arrays;

class TakeInputFromUser
{
    public static void main(String args[])
    {
        Scanner src = new Scanner(System.in);

        System.out.print("Enter size of an array: ");
        int a[] = new int[src.nextInt()];

        for(int i = 0; i < a.length; i++)
        {
            System.out.print("Enter element for a[" + i + "]: ");
            int value = src.nextInt();

            if(value == 0)
                break;

            a[i] = value;
        }

        System.out.println(Arrays.toString(a));
    }
}