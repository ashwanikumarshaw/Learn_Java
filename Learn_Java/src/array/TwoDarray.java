package array;

import java.util.Scanner;

public class TwoDarray {
	
	static void printMatrix(int M[][], int rowSize, int colSize) {
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++)
				System.out.print(M[i][j] + " ");

			System.out.println();
		}
	}

	static void multiplyMatrix(int row1, int col1, int A[][], int row2, int col2, int B[][]) {
		int i, j, k;

		// Print the matrices A and B
		System.out.println("\nMatrix A:");
		printMatrix(A, row1, col1);
		System.out.println("\nMatrix B:");
		printMatrix(B, row2, col2);

		// Check if multiplication is Possible
		if (row2 != col1) {

			System.out.println("\nMultiplication Not Possible");
			return;
		}

		int C[][] = new int[row1][col2];

		// Multiply the two matrices
		for (i = 0; i < row1; i++) {
			for (j = 0; j < col2; j++) {
				for (k = 0; k < row2; k++)
					C[i][j] += A[i][k] * B[k][j];
			}
		}

		// Print the result
		System.out.println("\nResultant Matrix:");
		printMatrix(C, row1, col2);
	}

	public static void main(String[] args) {

		// x[row_index][column_index]

		//        col1   col2    col3   col4
		// row1 a[0][0] a[0][1] a[0][2] a[0][3]
		// row2
		// row3
		Scanner sc = new Scanner(System.in);
		int row = 3, col = 3, row2 = 3, col2 = 5;

		int[][] a = new int[row][col];
		int[][] b = new int[row2][col2];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		sc.close();
		multiplyMatrix(row, col, a, row2, col2, b);

	}

}
