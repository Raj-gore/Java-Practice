interface Marker
{
}

class  Demo1 implements Marker
{
	public String toString()
	{
		return getClass().getName()+ "toString() Mathod called";
	}
}

class  Demo2 implements Marker
{
	public String toString()
	{
		return getClass().getName()+ "toString() Mathod called";
	}
}

class ProcessTask
{
	public void startProcess(Object a)
	{
		if(a instanceof Marker)
			System.out.println(a);
		else
			throw new NullPointerException("object not supportive");
			
			
	}
}

class MarkerInterface 
{
	public static void main(String args[])
	{
		ProcessTask p = new ProcessTask();
		Demo2 d1 = new Demo2();
		p.startProcess(d1);
	}
}




