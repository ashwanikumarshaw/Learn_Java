package impKeywords;
/*
 * static keyword is mainly used for memory management. 
 * It can be used with variables, methods, blocks and nested classes. 
 * It is a keyword which is used to share the same variable or method 
 * of a given class. Basically, static is used for a constant variable 
 * or a method that is same for every instance of a class
 */
class Emp{
	Emp(){
		System.out.println("Constructor is created");
	}
	static {
		int i=6;
		System.out.println("I am Static block " +i);
	}
	
	int id;
	int salary;
	String name;
	String ceo;
	
	/*
	 *  Static Variables: When a variable is declared as static,
	 *  	then a single copy of the variable is created and shared 
	 * 	 	among all objects at a class level. Static variables are, 
	 *  	essentially, global variables. All instances of the class 
	 *  	share the same static variable.
	 */
	static String CEO;
	
	void info() {
		System.out.println("Id : "+id+" name : "+name+" salary : "
				+ salary+" CEO :"+ceo+"  STATIC CEO :: "+CEO);
	}
}

public class StaticKeyword {
/*
 * Static 
 */
	public static void main(String[] args) {
		//static var, class, block is called first and once 
		
		//We create Two objects ashu and aish 
		//And constructor will be called twice but static block will be created once and at first
		Emp ashu=new Emp();
		
		Emp aish=new Emp();
		
		/*
		 * OUTPUT
		 *  I am Static block 6
		 *	Constructor is created
		 *  Constructor is created
		 */
		
		ashu.id=50;
		ashu.name="Ashu";
		ashu.salary=4000;
		ashu.ceo="RAJA";
		
		aish.id=49;
		aish.name="Aish";
		aish.salary=3000;
		aish.ceo="RAJA";
		
		ashu.info();
		aish.info();
		/*
		 * OUTPUT
		 * 
		 * Id : 50 name : Ashu salary : 4000 CEO :RAJA
		 * Id : 49 name : Aish salary : 3000 CEO :RAJA
		 */
		//Both work in same company Now we want to change CEO 
		//and we change ashu.ceo as "MONA"
		
		ashu.ceo="MONA";
		ashu.info();
		aish.info();
		/*
		 * OUTPUT
		 * 
		 * Id : 50 name : Ashu salary : 4000 CEO :MONA
		 * Id : 49 name : Aish salary : 3000 CEO :RAJA
		 */
		//only ashu.ceo changed ;for n number emp it will be difficult to change
		//So  we will use static variable to store ceo name
		//ashu.CEO="Ahwani";//even an object is not needed for using static var
		Emp.CEO="Ahwani";
		ashu.info();
		aish.info();
		/*
		 * OUTPUT
		 * 
		 * Id : 50 name : Ashu salary : 4000 CEO :MONA  STATIC CEO :: Ahwani
		 * Id : 49 name : Aish salary : 3000 CEO :RAJA  STATIC CEO :: Ahwani
		 */
		
		
	}

}
