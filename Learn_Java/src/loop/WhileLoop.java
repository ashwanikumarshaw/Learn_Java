package loop;

public class WhileLoop {

	public static void main(String[] args) {
		int a=5;
		while(a>0) {
			int b=a;
			while(b>0) {
				System.out.print(" * ");
				b--;
			}
			a--;
			System.out.println("");
		}

	}

}
