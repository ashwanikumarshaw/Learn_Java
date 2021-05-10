package inputOutput;
/*
 * println is a method of the PrintStream class. 
 * println() method displays the result & then throws 
 * the cursor to the next line. println() is used to 
 * print an argument that is passed to it
 */
public class PrintOutput {

	public static void main(String[] args) {

		int a=123;
		/*
		 * System: It is a final class defined in the java.lang package.
		 *  out: This is an instance of PrintStream type, which is a 
		 *  	   public and static member field of the System class.
		 */
		System.out.println("this is a "+a);//print and goto newline
		System.out.print("This is a "+a);// print and be on same line
		System.out.println(" But what about b");
		System.err.print("Error");
		/*
		 * System.err: This is the standard error stream 
		 * that is used to output all the error data that 
		 * a program might throw, on a computer screen or 
		 * any standard output device.
		 * 
		 */


	}

}
