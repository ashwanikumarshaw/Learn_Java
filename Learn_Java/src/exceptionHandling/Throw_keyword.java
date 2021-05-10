/*
 * The throw statement allows you to create a custom error.
 *
 * The throw statement is used together with an exception type. 
 * There are many exception types available in Java: 
 * ArithmeticException, FileNotFoundException,
 * ArrayIndexOutOfBoundsException, SecurityException, etc
 * 
 */

package exceptionHandling;

/*
 * Throw an exception if age is below 18 
 * (print "Access denied"). If age is 18 or 
 * older, print "Access granted"
 * 
 */

public class Throw_keyword {

	 static void checkAge(int age) {
		    if (age < 18) {
		      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		    }
		    else {
		      System.out.println("Access granted - You are old enough!");
		    }
		  }

		  public static void main(String[] args) {
			
			checkAge(25);
		    checkAge(15); // Set age to 15 (which is below 18...)
		    checkAge(25);
		  }
}
