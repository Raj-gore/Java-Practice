class TestClassNotFoundException
{	public static void main(String args[])
	{	
		try{
		Class.forName("Employee");

		}catch(ClassNotFoundException e){
			System.out.println(e);
		}
	}
}