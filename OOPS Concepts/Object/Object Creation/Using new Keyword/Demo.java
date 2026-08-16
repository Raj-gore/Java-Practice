class Demo
{
	int a ,b;
	void display()
	{
		System.out.println("a = " +a+ " b = " +b);	
	}
	public boolean equals(Object o)
	{
		Demo d1 = (Demo)o;
		if(a==d1.a)	
			if(b==d1.b)
				return true ;
		return false;
	}	
}