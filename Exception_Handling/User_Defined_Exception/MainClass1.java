class InvalidAgeException extends RuntimeException
{
	private String msg = "Invalid Age !!!";
	InvalidAgeException(){}
	InvalidAgeException(String msg){this.msg = msg;}
	public String toString()
	{
		return getClass().getName()+ ":"+msg;
	}
}

class Site
{
	public void login(int age)
	{
		System.out.println("Welcome to the Site");
		if(age>=70)
			homePage();
		else
			throw new InvalidAgeException("Age should be atleast 70 or above");
		System.out.println("Thank you for visit");
	}
	public void homePage()
	{
		System.out.println("Welcome to Second home");
	}
}

class Mainclass1
{
	public static void main (String args[])
	{
		System.out.println("Program Started");
		Site s = new Site();
		try{
		s.login(70);	
		}catch(InvalidAgeException e){
			System.out.println(e);
		}
		System.out.println("Program Ended");	
	}
}




