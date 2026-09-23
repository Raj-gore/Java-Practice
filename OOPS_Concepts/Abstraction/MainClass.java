package OOPS_Concepts.Abstraction;


abstract class RBI 
{
	public final double r = 4;
	protected final double countSI(double p, int n)
	{
		return (p*r*n)/100;
	}
}

final class SBI extends RBI		
{
	double countSimpleInterest(double p , int n)
	{
		return countSI(p,n);
	}
}
class MainClass
{
	public static void main(String args[])
	{
		SBI s = new SBI();
		System.out.println(s.countSimpleInterest(1000,4));
		System.out.println(s.r);
	}		
}