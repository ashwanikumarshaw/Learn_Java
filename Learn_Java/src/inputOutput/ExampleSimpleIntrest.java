package inputOutput;

import java.util.Scanner;

public class ExampleSimpleIntrest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Simple Interst Calculater");
		//formula= (principal*rate*time)/100
		int principal=sc.nextInt();
		float rate=sc.nextFloat();
		byte time=sc.nextByte();
		
		double simpleInterst=(principal*rate*time)/100;
		System.out.println("Simple interst is : "+simpleInterst);
		
		sc.close();

	}

}
