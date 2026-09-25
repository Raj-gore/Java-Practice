interface Car
{
	int maxSpeed = 120;
	void color();
	void type();
	void cc();
}

class HondaCar implements Car
{
	int minSpeed = 40;
	public void color()
	{
		System.out.println("HondaCar available in all color");
	}
	public void type()
	{
		System.out.println("HondaCar available in all segment");
	}
	public void cc()
	{
		System.out.println("HondaCar available in 1000cc to 2000");
		System.out.println("minSpeed = "+minSpeed+ " maxSpeed = "+maxSpeed);
	}
	
}

class BMWCar implements Car
{
	int minSpeed = 60;
	public void color()
	{
		System.out.println("BMWCar available in blue , orange color");
	}
	public void type()
	{
		System.out.println("BMWCar available in sadon and SUV");
	}
	public void cc()
	{
		System.out.println("BMWCar available in 2000cc to 4000");
		System.out.println("minSpeed = "+minSpeed+ " maxSpeed = "+maxSpeed);
	}
	
}

class FerrariCar implements Car
{
	int minSpeed = 80;
	public void color()
	{
		System.out.println("FerrariCar available in red , Skyblue color");
	}
	public void type()
	{
		System.out.println("FerrariCar available in  Sport mode ");
	}
	public void cc()
	{
		System.out.println("FerrariCar available in 3000cc to 7000");
		System.out.println("minSpeed = "+minSpeed+ " maxSpeed = "+maxSpeed);
	}
	
}
	
class CarBluePrint
{
	public static void main(String args[])
	{
		Car c = new FerrariCar();
		c.color();
		c.type();
		c.cc();
	}
}

