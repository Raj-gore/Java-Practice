class Demo implements Cloneable
{
	int a,b;
	void display()
	{
		System.out.println("a = "+a+ " b = "+b);
	}
	protected Demo clone()
	{
		Demo d1 = null;
		try
		{
		d1 = (Demo)super.clone();
		}catch(CloneNotSupportedException e){
			System.out.println(e);
		}
		return d1;

	}
}