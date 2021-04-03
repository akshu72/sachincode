package ThrowPratice;

public class Test {

	
	public void m1(int age) throws CustomException
	{
		
		
		System.out.println("m1- Start");
		
		if(age<0)
		{
			
			CustomException e=new CustomException("Age-Problem");
			throw e;
		}
		System.out.println("m1-nd");
	}
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("main-Start");
		Test t=new Test();
		try
		{
			t.m1(-5);
		}catch (CustomException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
 System.out.println("main-end");
	}

}
