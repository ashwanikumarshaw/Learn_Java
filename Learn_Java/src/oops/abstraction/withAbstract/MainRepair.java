package oops.abstraction.withAbstract;

public class MainRepair {

	public static void repair(Car car) {
		car.running();
		car.breaking();
		System.out.println("Tested");
	}
	
	public static void main(String[] args) {

		System.out.println("With Abstraction");
		System.out.println("*******************");
		System.out.println();
		
		Audi a=new Audi();
		Nano n=new Nano();
		//Car c=new Car();//can't create object of Car :: Cannot instantiate the type Car
		//both extends car 
		repair(a);
		System.out.println("*******************");
		repair(n);

	}
}
