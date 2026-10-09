class Writing implements Runnable
{
	public void bookWriting()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("book Writing is Processing");
		}
	}
	public void run()
	{
		bookWriting();
	}
}

	
class Reading implements Runnable
{
	public void bookReading()
	{	
		for(int i=1; i<=10; i++)
		{
			System.out.println("book Reading is Processing");
		}
	}
	public void run()
	{
		bookReading();
	}
}

class Listening implements Runnable
{
	public void musicListening()
	{ 
		for(int i=1; i<=10; i++)
		{
			System.out.println("music listening is Processing");	
		}
	}
	public void run()
	{
		musicListening();
	}
}
	

class ByUsingRunnableInterface
{
	public static void main(String args[])
	{
		Writing w = new Writing();
		Reading r = new Reading();
		Listening l = new Listening();
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(l);
		t1.start();
		t2.start();
		t3.start();
	
	}
}