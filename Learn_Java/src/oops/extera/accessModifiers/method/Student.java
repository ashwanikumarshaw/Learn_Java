package oops.extera.accessModifiers.method;

public class Student {
		String sub="Maths";
		
		public void info() {
			String name="Ashu";
			int roll=6;
			System.out.println("Hello! I am "+name+" my roll is "+roll);
		}
		void favSub() {
			System.out.println("Java is my fav sub");
		}
		private int password() {
			return 7896;
		}
		private String username() {
			return "ASHU_1997";
		}
		protected void login() {
			//Student s1=new Student();
			info();
			favSub();
			System.out.println("my username is "+username()+" my password is "+password());
		}
}
