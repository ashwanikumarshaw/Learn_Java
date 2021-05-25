package _Comparables_And_Comparators;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {

		List<Student> students=new ArrayList<>();
		students.add(new Student(75, "Ashu"));
		students.add(new Student(45, "raju"));
		students.add(new Student(75, "kaju"));
		students.add(new Student(65, "taraju"));
		students.add(new Student(95, "Aish"));
		students.add(new Student(39, "saj"));
		
		System.out.println("Using Comparable");
		Collections.sort(students);// though error until Student class does't implements Comparable
		students.forEach(System.out::println);// Lambda 
		
		System.out.println("Using Comparator");
		// Using Comparator
		Collections.sort(students,new SortByNameThenMarks());// don't need Comparable now
		students.forEach(System.out::println);// Lambda 
		
		System.out.println("Using Comparator but lambda");
		
		//Using Comparator but lambda
		Collections.sort(students,(o1,o2)->{
			if(o1.name.equals(o2.name)){
				return o1.marks-o2.marks;
				}
				else 
					return o1.name.compareTo(o2.name);								
		});// don't need Comparable now
		
		students.forEach(System.out::println);// Lambda 
		
		//also
		//Collections.sort(students,(o1,o2)->o1.name.compareTo(o2.name));//sort by name
		//Collections.sort(students,Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
	}

}
class SortByNameThenMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.name.equals(o2.name)){
		return o1.marks-o2.marks;
		}
		else 
			return o1.name.compareTo(o2.name);
			
	}
	
}
