
//by using interface ,we can remove tightly couple code

interface Sim
{
	void startSim();
}

class RelianceSim implements Sim
{
	public void startSim()
	{
		System.out.println("Welcome to Reliance Sim");
	}
}

class AirtelSim implements Sim
{
	public void startSim()
	{
		System.out.println("Welcome to Airtel Sim");
	}
}

class IdeaSim implements Sim
{
	public void startSim()
	{
		System.out.println("Welcome to Idea Sim");
	}
}

class RelianceMobile 
{
	Sim r = new AirtelSim();
	RelianceMobile()
	{
		startMobile();
		r.startSim();
	}
	public void startMobile()
	{
		System.out.println("Welcome to Reliance Mobile");	
	}
}


class LooselyCoupleSimDemo
{
	public static void main(String args[])
	{
		new RelianceMobile();
	}
}


