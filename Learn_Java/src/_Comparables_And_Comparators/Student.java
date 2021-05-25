package _Comparables_And_Comparators;

public class Student implements Comparable<Student>{
	int marks;
	String name;
	
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//This will sort on the basis of marks if equals then on the basis of name
	@Override
	public int compareTo(Student o) {

		if(this.marks>o.marks) return 1;//inc order if we put -1 then dec order 
		else if(this.marks<o.marks) return -1;
		return this.name.compareTo(o.name);
	}

}
