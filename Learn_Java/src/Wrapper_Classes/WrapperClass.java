package Wrapper_Classes;

public class WrapperClass {
/*
 * Each of java's eight primitive data types has a class dedicated to it.
 * These are known as wrapper classes ( wrap primitive data type into obj of that class)
 *  
 *  boolean ->> Boolean 
 *  byte ->> Byte
 *  char ->> Character
 *  int ->> Integer ...
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=15;// Single Value Container 
		// Change into Obj
		@SuppressWarnings("deprecation")
		Integer iRef = new Integer(i); // Boxed ( Construction the Object )
		
		//@SuppressWarnings("unused")
		int j=iRef.intValue(); // Unboxing ( Extraction the value from Object )
		
		Integer kRef = i;// Autoboxing 
		
		int l= kRef; // Autounboxing
		// We can also Pass By Reference the primitives 
		
		System.out.println(iRef+l+j);
		

	}

}
