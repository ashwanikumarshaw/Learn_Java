package oops.extera.accessModifiers.method;

public class Teacher {
	
	public void studentInfo() {
		Student s1=new Student();
		s1.info();//public method
		s1.favSub();//default method
		//s1.username();//private method not accessible 
		s1.login();//protected method
	}


}
