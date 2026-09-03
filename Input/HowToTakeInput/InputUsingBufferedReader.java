// By using BufferedReader 

import java.io.BufferedReader;
import java.io.InputStreamReader;
class InputUsingBufferedReader
{
	public static void main(String args[]) throws Exception
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Value = ");
		int a = Integer.parseInt(br.readLine());

		System.out.print("Enter Value = ");
		int b = Integer.parseInt(br.readLine());

		System.out.println(a + b);
	}
}