package oops.inheritance;


public class MultipleInheritance {
	/*
	 * The reason behind this is to prevent ambiguity. Consider a case where class B
	 * extends class A and Class C and both class A and C have the same method
	 * display(). Now java compiler cannot decide, which display method it should
	 * inherit. To prevent such situation, multiple inheritances is not allowed in
	 * java.
	 */

	public static void main(String[] args) {
		
		//To implement multiple interfaces example
		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();
	}
}

/*
 * Java does not support "multiple inheritance" (a class can only inherit from
 * one superclass). However, it can be achieved with interfaces, because the
 * class can implement multiple interfaces. Note: To implement multiple
 * interfaces, separate them with a comma (see example below).
 * 
 */

interface FirstInterface {
	public void myMethod(); // interface method
}

interface SecondInterface {
	public void myOtherMethod(); // interface method
}

// class to implement interface
class DemoClass implements FirstInterface, SecondInterface {
	
	public void myMethod() {
		System.out.println("Some text..");
	}

	public void myOtherMethod() {
		System.out.println("Some other text...");
	}
	
}
