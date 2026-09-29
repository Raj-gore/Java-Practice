// by using Annonymous/implicit implementation

interface Demo1
{
	void m1();
	void m2();
}
	
class AnonymousDemo
{
	public static void main(String args[])
	{
		Demo1 d1 = new Demo1(){
		public void m1() {System.out.println("m1 method of Demo1");}
		public void m2() {System.out.println("m2 method of Demo1");}
		};
		Demo1 d2 = new Demo1(){
		public void m1() {System.out.println("m1 method of Demo2");}
		public void m2() {System.out.println("m2 method of Demo2");}
		};
		d1.m1();
		d1.m2();

		d2.m1();
		d2.m2();
	}
}

