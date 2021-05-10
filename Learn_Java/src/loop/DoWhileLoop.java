package loop;

public class DoWhileLoop {

	public static void main(String[] args) {
		int a=5;
		do {
			System.out.println("I can Run");
			a--;
		}
		while(a>0);
		
		int b=5;
		while(b>0) {
			System.out.println("Yes I know ");
			b--;
		}
		
		//do run first thou num is < 5
		int num = 0;
		do {
			System.out.println("Number is Greater Than 10");
		}while (num > 5);
		System.out.println("This Statement is Coming from Outside of while loop");

	}

}
