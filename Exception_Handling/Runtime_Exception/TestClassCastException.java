class A
{

}

class B extends A
{

}

class TestClassCastException
{
	public static void main(String args[])
	{
		System.out.println("Program Started");
		try{
		B a = (B)new A();
		}catch(ClassCastException e){
			System.out.println(e);
		}
		System.out.println("Program Ended");

	}
}