package oops.inheritance;

public class HeadBoy extends Teacher {
	
	void noteName() {
		super.teach();//run parent Teacher name()
		System.out.println(name+" is my teacher!");
		}

}
