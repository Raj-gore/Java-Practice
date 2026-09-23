class Calculator
{
	void add()
	{
		int a = 5;
		int b = 10;
		System.out.println("Addition = "+(a+b));
	}
}

class ScientificCalculator extends Calculator
{
	void square()
	{
		int a = 5;
		System.out.println("Square = "+(a*a));
	}
}

class SingleInheritance
{
	public static void main(String args[])
	{
		ScientificCalculator sc =  new ScientificCalculator();
	
		sc.add();
		sc.square();
	}
}