package oops.abstraction.withInterface;

public class Audi implements Car{

	@Override
	public void running() {
		System.out.println("Audi is Running");

	}

	@Override
	public void breaking() {
		System.out.println("Audi pulled Break");
		
		System.out.println("Engin Sound { Car.sound1() }");
//		sound1();//error

		Car.sound1();
		
//		Car obj=new Audi();
		//or
//		Audi ob=new Audi();
//		Car obj=ob;//here obj is object of Audi not car:: Up-casting
//		obj.running();
		
	}

}
