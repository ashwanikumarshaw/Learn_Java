package oops.inheritance;

public class Teacher extends People{

	void teach() {
		System.out.println(name+" is Teaching!");
		}
	void name() {//override same method of people class
		super.name();//run parent class People name() 
		System.out.println("My name is "+name+" Teacher");
		}
}
