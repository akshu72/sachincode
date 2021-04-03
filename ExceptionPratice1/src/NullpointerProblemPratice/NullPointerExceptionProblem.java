package NullpointerProblemPratice;

public class NullPointerExceptionProblem {

	public static void main(String[] args) {
		System.out.println("main-Start");
		
		
		try {
			System.out.println("Try-start");
			String s=null;
			System.out.println(s.length());
			System.out.println("try-end");
			
			
		}catch(NullPointerException e)
		{
			System.out.println("nullpointer Exception");
		}
           System.out.println("main-end");
	}

}
