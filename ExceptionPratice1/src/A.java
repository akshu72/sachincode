
public class A {
public void m1()
{
	
System.out.println("m1-Start");
B b=new B();

try
{
b.m2();	
}
catch(ArithmeticException e)
{
	System.out.println("catch Block");
}

}
public static void main(String[] args) {
	System.out.println("main -Start");
	A a=new A();
	a.m1();
	System.out.println("main-End");
	System.out.println("Akshay dada ekch vada");
}
	
	public void sachin()
	{
		System.out.println("sachin cognizant");
	}
	public void akshay()
	{
		System.out.println("akshay -harbeger");
	}
}
