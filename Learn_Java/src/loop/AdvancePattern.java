package loop;

import java.util.Scanner;

public class AdvancePattern {

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
		
		int c=sc.nextInt();
		//pattern 1
System.out.println();
		for(int i=1;i<=c;i++) {
			for(int j=1;j<=c-i;j++) {
				System.out.print("  ");
					
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*   ");
					
			}
			
			System.out.println("");
		}
		//pattern 2
System.out.println();
		int k=1;
		for(int i=1;i<=c;i++) {
			for(int j=1;j<=c-i;j++) {
				System.out.print("  ");
					
			}
			for(int j=1;j<=i;j++) {
				System.out.print(k+"   ");
				k++;
					
			}
			
			System.out.println("");
		}
		// pattern 3
System.out.println();
		for (int i = 1; i <= c; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		for (int i = 1; i <= c; i++) {
			
			for (int j = 1; j <= c - i; j++) {
				System.out.print("*");

			}
			
			System.out.println("");
		}
		// pattern 4
System.out.println();
		System.out.println("*");
		for (int i = 2; i <=c-1; i++) {
			
			System.out.print("*");
			for (int j = 1; j <= i-2; j++) {
				System.out.print(" ");
			}
			
			System.out.println("*");
			
		}
		for (int i = 1; i <=c; i++) 
			System.out.print("*");	

	sc.close();
	}
	

}
