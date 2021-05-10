package oops.inheritance.constructor;

public class Stud extends People{
	public Stud(String name) {
		super(name);
		System.out.println("In stud constructor");
	}
	void name() {
		super.name();
		System.out.println("My name is "+name+" Stud");
		}
}
