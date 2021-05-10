package oops.inheritance;

public class Singer extends People{
	
	void sing() {
		System.out.println(name+" is Singing!");
		}
	
	void name() {//override same method of people class
		System.out.println("My name is "+name+" Singer");
		}
}
