package method;

public class MethodOverloading {

	int maxof(int a, int b) {
		return a > b ? a : b;
	}

	int maxof(int a, int b, int c) {
		return a > b ? a > c ? a : c : b > c ? b : c;
	}
	int maxof(char a,char b) {
		return b;
		
	}

	public static void main(String[] args) {
		MethodOverloading ob1 = new MethodOverloading();
		System.out.println(ob1.maxof(5, 8));
		System.out.println(ob1.maxof(11, 8, 9));
		System.out.println(ob1.maxof('h', 'y'));
		

	}

}
