package oops.abstraction.withInterface;

public class MainRepair {

	public static void repair(Car car) {
		car.running();
		car.breaking();
		System.out.println("*******************");
		car.sound();
		System.out.println("Tested");
	}
	
	public static void main(String[] args) {

		System.out.println("With Interface");
		System.out.println("*******************");
		System.out.println();
		
		Audi a=new Audi();
		Nano n=new Nano();
		//Car c=new Car();//can't create object of Car :: Car is not a class
		//both implements car 
		repair(a);
		System.out.println("*******************");
		System.out.println("*******************");
		repair(n);
		//n.sound1();

	}

}
