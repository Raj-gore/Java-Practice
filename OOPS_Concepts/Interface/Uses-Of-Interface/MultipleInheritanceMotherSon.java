//By using interface we can achieve multiple inheritance.
	
interface IndianMother
{
	default void food()
	{
		System.out.println("Chapati Ready");	
	}
}

interface BritishMother
{
	default void food()
	{
		System.out.println("Maggie Ready");
	}	
}

class Son implements IndianMother,BritishMother
{
	public void food()
	{
		IndianMother.super.food();
		BritishMother.super.food();
	}	
}
	
class MultipleInheritanceMotherSon
{
	public static void main(String args[])
	{	
		Son S = new Son();
		S.food();
	}
}
