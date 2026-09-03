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