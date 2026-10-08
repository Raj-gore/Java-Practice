class Site 
{
	public void login(int age) throws
		ClassNotFoundException,
		InstantiationException,
		IllegalAccessException
	{
		System.out.println("Welcome to this site ");
		if(age >= 70)
			homePage();
		else
			throw new ArithmeticException("Age should be atleast 70 or above");
	}
	public void homePage()
	{
		System.out.println("Welcome to your second home");
	}
}



class ThrowsKeyword
{
	public static void main(String args[])
	{
		System.out.println("Program started");
		Site s = new Site();
		try{
		s.login(89);
		}catch(ArithmeticException | ClassNotFoundException | InstantiationException | IllegalAccessException e){
			System.out.println(e);
		}
		System.out.println("Program started");
	}
}