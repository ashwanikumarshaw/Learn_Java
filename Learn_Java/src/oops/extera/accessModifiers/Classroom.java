package oops.extera.accessModifiers;

import oops.extera.accessModifiers.method.Student;
import oops.extera.accessModifiers.method.Teacher;

public class Classroom {

	public static void main(String[] args) {
		Teacher teach =new Teacher();
		teach.studentInfo();
		System.out.println();


		Student s1=new Student();
		s1.info();//public method
		//s1.favSub();//default method not accessible as default method can't be used out side same package
		//s1.username();//private method not accessible as private method can't be used from different class
		//s1.login();//protected method not accessible as protected method can be used only from child class
	}

}
