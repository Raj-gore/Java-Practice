//By using scanner

import java.util.Scanner;
class InputUsingScanner
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Value = ");
		int a = sc.nextInt();

		System.out.print("Enter Value = ");
		int b = sc.nextInt();

		System.out.println(a + b);
	}
}

//By using scanner

import java.util.Scanner;
import java.util.Arrays;
class InputUsingScanner
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);

		System.out.print("Enter size of an array ; ");
		int a[] = new int[src.nextInt()];
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.print("Enter element of for a["+i+ "] ");
			int value = sc.nextInt();
			if(value == 0)
				break;
			a[i] = value;
		System.out.println(Arrays.toString(a));

		}
	}
}