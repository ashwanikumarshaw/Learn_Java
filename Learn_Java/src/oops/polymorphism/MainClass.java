package oops.polymorphism;
/*
 * Polymorphism in Java has two types: Compile time polymorphism (static binding)
 * and Runtime polymorphism (dynamic binding). 
 * Method overloading is an example of static polymorphism,
 * while method overriding is an example of dynamic polymorphism.
 */

public class MainClass {

	public static void main(String[] args) {


		Dog d=new Dog();
		Pet p=d;
		Animal a=d;
		d.walk();
		p.walk();//it will also print Dog is walking due to Run time polymorphism  (overriding)
		//a.walk();//through error at compile time as animal don't have walk property 
		a.getClass();
		
		System.out.println(d.name);//Robby
		System.out.println(p.name);//locus no override
		//as var can't be override it hides
		
		
		//::Compile time polymorphsim (overloading)
		greet();
		greet("good morning");
	}
	public static void greet() {
		System.out.println("Hi! ");
	}
	public static void greet(String s) {
		System.out.println(s);
	}

}
