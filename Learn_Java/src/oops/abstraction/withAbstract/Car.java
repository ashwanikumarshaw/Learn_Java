package oops.abstraction.withAbstract;

public abstract class Car {
	/*
	 * Abstract class: is a restricted class that cannot be 
	 *   used to create objects (to access it, it must be inherited from another class).

	 * Abstract method: can only be used in an abstract class, and 
	 *    it does not have a body. The body is provided by the subclass (inherited from).
	 */
	public abstract void running() ;
	public abstract void breaking() ;
	
	//Abstract class can have regular method
	public void sound() {
	    System.out.println("Zzz");
	  }

}
