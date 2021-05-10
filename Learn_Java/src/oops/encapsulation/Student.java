package oops.encapsulation;

public class Student {
		private int age;
		private String name;
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			if(age>25)
				System.out.println("age Must be smaller than 25");
			else
				this.age = age;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
				
}
