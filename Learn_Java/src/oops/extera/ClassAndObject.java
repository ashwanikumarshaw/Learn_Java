package oops.extera;

class animal{//no error
	boolean a=true;
	int x;
	String name;
	String java="java is fun animal";
	void legs(int l) {
		int leg=l;
		System.out.println(name+"Java have "+leg+" Legs");
	}
	void about() {
		System.out.println(java);
		legs(x);
	}
	
}

//public class cat{ through's error	ONLY ONE PUBLIC CLASS
//}

public class ClassAndObject{// in a java file their will be only one public class and main method

	public static void main(String[] args) {

		animal catJava= new animal();// creating object of class animal
		animal dogJava= new animal();
	
		catJava.about();
		catJava.legs(5);
		catJava.name="CAT ";
		catJava.x=4;
		dogJava.name="DOG ";
		dogJava.java="is an animat which have ";
		dogJava.x=8;
		
		System.out.println();
		catJava.about();//diff memo
		System.out.println();
		
		dogJava.about();//diff memo
		System.out.println(catJava.a);

	}

}
