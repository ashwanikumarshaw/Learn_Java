package oops.abstraction.withAbstract;

public class Audi extends Car {

	// Overriding non-abstract method is optional

	// You must Overriding abstract method

	@Override
	public void running() {
		System.out.println("Audi is Running");

	}

	@Override
	public void breaking() {
		System.out.println("Audi pulled Break");

	}

}
