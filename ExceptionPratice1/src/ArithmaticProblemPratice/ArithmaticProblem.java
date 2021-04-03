package ArithmaticProblemPratice;

public class ArithmaticProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("main-Start");
         try{
        	 
        	 System.out.println("try-start");
        	 int a=10/0;
        	 System.out.println("try end");
        			 
         }catch(ArithmeticException e) {
        	 
        	 System.out.println("catch-start");
        	 
        	 
         }
         System.out.println("main-end");
	}

}
