class Writing extends Thread
{
	public void bookWriting()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("Book Writing is Processing");
		}
	}
	public void run()
	{
		bookWriting();
	}
}

class Reading extends Thread
{
	public void bookReading()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("Book Reading is Processing");
		}
	}
	public void run()
	{
		bookReading();
	}
}

class Listening extends Thread
{
	public void musicListening()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("Book Listening is Processing");
		}
	}
	public void run()
	{
		musicListening();
	}
}


class ByUsingThreadClass
{
	public static void main(String args[])
	{
		Writing w = new Writing();
		Reading r = new Reading();
		Listening l = new Listening();
		w.start();
		r.start();
		l.start();
	}
}


