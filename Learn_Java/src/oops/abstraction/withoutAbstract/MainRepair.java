package oops.abstraction.withoutAbstract;

public class MainRepair {

	public static void repair(Car car) {
		car.running();
		car.breaking();
		car.sound();
		System.out.println("Tested");
	}
	public static void main(String[] args) {
		System.out.println("WithOut Abstraction");
		System.out.println("*******************");
		System.out.println();

		Audi a=new Audi();
		Nano n=new Nano();
		//Car c=new Car();//can create object of Car
		//both extends car 
		repair(a);
		System.out.println();
		repair(n);

	}

}
