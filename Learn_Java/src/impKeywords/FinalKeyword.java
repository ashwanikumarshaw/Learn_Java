package impKeywords;
/*
 * FINAL KEYWORD
 * 
 * 1. A final variable can't be changed
 * 2. A final method can't be overridden  
 * 3. A final class can't be extended
 * 
 */

class Example{
	
	// a final variable 
    // direct initialize 
    final int ROOL_NO = 12; 
      
    // a blank final variable 
    final int VAR_X; 
      
    // another blank final variable 
    final int  MIN; 
    
    // constructor for initializing MIN 
    // Note that if there are more than one 
    // constructor, you must initialize MIN 
    // in them also 
    public Example() //constructor 
    { 
        MIN = -1; 
    }  
    
    // a final static variable PI_VAL 
    // direct initialize 
    static final double PI_VAL = 3.141592653589793; 
      
    // a  blank final static  variable 
    static final double STATIC_FINAL_VAL; 
      
    // instance initializer block for  
    // initializing VAR_X 
    { 
        VAR_X = 25; 
    } 
      
    // static initializer block for  
    // initializing STATIC_FINAL_VAL 
    static{ 
        STATIC_FINAL_VAL = 2.3; 
    } 
    //final method can't be overridden 
    //try in FinalKeyword class
    public final void method() {
    	System.out.println("i am final method");
    }
    //non-final method
    public  void methodX() {
    	System.out.println("i am methodX"+PI_VAL);
    }
      
}

final class A{
	}
//class B extends A{
//	} 

public class FinalKeyword extends Example{
	// tried to override final method throws compile time error
//	 public final void method() {
//	    	System.out.println("i am final method in main");
//	    }
	//Duplicate error
//	public void method() {
//   	System.out.println("i am final method in main");
//    }
	
	//non final method can be overridden
	 public  void methodX() {
	    	System.out.println("i am methodX in main "+PI_VAL);
	    }
	 
	public static void main(String[] args) {
		FinalKeyword n=new FinalKeyword();
		
		n.method();//i am final method
		n.methodX();//i am methodX in main 3.141592653589793
		System.out.println(n.ROOL_NO);//12
		//Static final variable can be called directly without object
		System.out.println(Example.STATIC_FINAL_VAL);//2.3
		
		Example e=new Example();
		
		e.method();//i am final method
		e.methodX();//i am methodX3.141592653589793

	}

}
