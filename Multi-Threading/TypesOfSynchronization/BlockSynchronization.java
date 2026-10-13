class Site
{
	private boolean booked = false;
	public void doReservation()
	{
		Thread t = Thread.currentThread();
		for(int i = 1 ; i <= 10 ; i++)
		{
			System.out.println(t.getName()+"\tReservation Processing");
		}	
		synchronized(this)
		{
			if(!booked)
			{
				for(int i = 1 ; i <= 10 ; i++)
					System.out.println(t.getName()+"Payment Processing");
			booked = true;
			System.out.println(t.getName()+"Your Ticket Booked Successfully");
			}
			else
				System.out.println("Sorry"+t.getName()+"Ticket Not Available");
		}
	}
}


class User implements Runnable
{
	private Site Site;
	private User(){}
	public User(Site Site)
	{
		this.Site=Site;
	}
	public void run()
	{
		 Site.doReservation();
	}
}


class BlockSynchronization
{
	public static void main(String args[])
	{
		Site s1 = new Site();
		User u1 = new User(s1);
		User u2 = new User(s1);
		User u3 = new User(s1);
		User u4 = new User(s1);
		Thread t1 = new Thread(u1);
		Thread t2 = new Thread(u2);
		Thread t3 = new Thread(u3);
		Thread t4 = new Thread(u4);
		t1.setName("Manish");
		t2.setName("Mahesh");
		t3.setName("Manoj");
		t4.setName("Mohan");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}






