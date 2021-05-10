package oops.abstraction.withInterface;

public class Nano implements Car{

	@Override
	public void running() {
		System.out.println("Nano is running");
		
	}

	@Override
	public void breaking() {
		System.out.println("Nano  pulled Break");
		System.out.println("Engin Sound { sound() }");
		sound();//default method can be called  as class implements Car
	}
	

}
