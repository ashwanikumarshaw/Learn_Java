package inputOutput;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		// import java.util.Scanner
		Scanner sc=new Scanner(System.in);
		/*
		 * System.in: This is the standard input stream
		 *  that is used to read characters from the keyboard 
		 *  or any other standard input device.
		 *  
		 */
		int num=sc.nextInt();
		System.out.println(num);
		char a=sc.next().charAt(0);   
		char b=sc.next().charAt(0);
		System.out.println(a);
		System.out.println(b);
		
		sc.close();//no warning

	}

}
