//Note :- we can provide multiple block with single try to provide appropriate solution as per occured exception 
	//in this approach super class should be at last


class catchExample
{
	public static void main (String args[])
	{
		System.out.println("Program Started");
		String s1[] = {"123","234","120","12A"};
		int value = 0;
		try{
		value = Integer.parseInt(s1[4].substring(1));
		}catch(ArithmeticException e){
			System.out.println("catch block 1 called");
		}catch(NumberFormatException e){
			System.out.println("catch block 2 called");
		}catch(NullPointerException e){
			System.out.println("catch block 3 called");
		}catch(RuntimeException e){
			System.out.println("catch block 4 called");
		}
		System.out.print("value = "+value);
		System.out.println("Program Ended");
	}
}