package exceptionHandling;

public class TryCatch {

	public static void main(String[] args) { 
		/*
		 * try statement allows you to define a 
		 * block of code to be tested for errors while it is being executed.
		 */
		try {
			int a=5;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		/*
		 * catch statement allows you to define a 
		 * block of code to be executed, if an error occurs in the try block.
		 */
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());//"/ by zero"
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		/*
		 * finally statement lets you execute code, 
		 * after try...catch, regardless of the result
		 */
		finally {
			System.out.println("Try catch executed"); 
		}

	}

}
