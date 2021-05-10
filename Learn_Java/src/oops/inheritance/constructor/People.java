package oops.inheritance.constructor;

public class People {

	protected String name;
	
	public People(String name) {
		this.name=name;
		System.out.println("In ppeople constructor");
	}
	
	void name() {
		System.out.println("My name is "+name+" Person");
		}
	
	void eat() {
		System.out.println(name+" is Eating!");
		}
	void sleeP() {
		System.out.println(name+" is Sleeping!");
		}

}
