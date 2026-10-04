
abstract class Animal
{
}

class Dog
{
    private Dog()
    {
    }
}

class InstantiationExceptionOrIllegalAccessException
{
	public static void main(String args[])
	{
        	try{
			Animal a = Animal.class.newInstance();
        	}catch(InstantiationException e){
			System.out.println("InstantiationException handled");
        	} catch(IllegalAccessException e){
		System.out.println("IllegalAccessException handled");
		}
		try{
			Dog d = Dog.class.newInstance();
		}catch(InstantiationException e){
			System.out.println("InstantiationException handled");
        	}catch(IllegalAccessException e){
			System.out.println("IllegalAccessException handled");
        	}
		System.out.println("Program continues...");
	}
}