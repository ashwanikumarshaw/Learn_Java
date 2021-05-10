package oops.abstraction.withInterface;

public interface Car {


	public  void running() ;
	void breaking() ;
	public static final int rust = 0;//attribute of interface is by default public static final 
	int engin=1000;//it is also public static final
//	int wheels;//it will throw an error as attribute is public static final so we need to declare it
	
//	public  void voice() { //by default its a abstract method which don't have body
//	    System.out.println("Zzz");
//	  }
	
	public default void sound() {//after java 1.7 we can add default methods which can have body too
	    System.out.println("Zzz");//can be called directly with method name if class is implementing the interface
	  }
	
	public static void sound1() {//after java 1.7 we can add static methods which can have body too
	    System.out.println("NOOOOOOOOO");//and can be called by interface name . method name 
	  }
}
