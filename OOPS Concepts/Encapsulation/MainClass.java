class Student 
{
	private int id;
	private String name;
	private String city;
	private double percentage;

	//setter method
	public void setId(int id){this.id=id;}
	public void setName(String name){this.name=name;}
	public void setCity(String city){this.city=city;}
	public void setPercentage(double percentage){this.percentage=percentage;}
	
	//getter method
	public int getId(){return id;}
	public String getName(){return name;}
	public String getCity(){return city;}
	public double getpercentage(){return percentage;}
	
	Student(int id , String name, String city, double percentage)
	{
		this.id=id;
		this.name=name;
		this.city=city;
		this.percentage=percentage;
	}
	Student(){}
	
	public String toString()
	{
		return getClass().getName() + "[id=" +id+" , name=" +name+ ", city=" +city+ ", percentage=" +percentage+ "]";
		
	}
}

class MainClass
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.setId(10);
		s.setName("ABC");
		s.setCity("Pune");
		s.setPercentage(80.25);
		System.out.println("Id : " + s.getId());
		System.out.println("Name : " + s.getName());
		System.out.println("City : " +s .getCity());
		System.out.println("Percentage : " + s.getpercentage());
		Student s1 = new Student(20,"Harshal","Mumbai",95.50);
		System.out.println(s1);
	}
}