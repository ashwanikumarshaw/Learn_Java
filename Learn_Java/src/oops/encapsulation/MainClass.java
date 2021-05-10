package oops.encapsulation;

public class MainClass {

	public static void main(String[] args) {
		Student s1=new Student();
//		s1.age=56;
//		s1.name="ashu";
		s1.setAge(55);
		s1.setName("AShu");
		System.out.println(s1.getAge());
		System.out.println(s1.getName());

	}

}
