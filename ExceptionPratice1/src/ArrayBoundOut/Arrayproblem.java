package ArrayBoundOut;

public class Arrayproblem {

	public static void main(String[] args) {
		
		
		System.out.println("main-start");
		
		try {
			System.out.println("try-START");
		
		int a[]= {10,20,30,40};
      System.out.println(a[4]);
      
      
      System.out.println("TRY-END");
	}
		
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("catch-BLOCK");
		
	}
		System.out.println("main-end");
	}

}
