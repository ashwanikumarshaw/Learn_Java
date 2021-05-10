package oops.abstraction.withAbstract;

public class Nano extends Car {
	// Overriding non-abstract method is optional

	// You must Overriding abstract method

	@Override
	public void running() {
		System.out.println("Nano is Running");

	}

	@Override
	public void breaking() {
		System.out.println("Nano pulled Break");

	}

}
