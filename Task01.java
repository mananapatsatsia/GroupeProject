package groupeProject;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		/*Create an array on int values using a scanner and 
		 * calculate the sum of all stored elements in that array. 
		 */
		Scanner cs = new Scanner(System.in);
		int row_size, col_size;
		// Get size of matrix
		System.out.print("Enter the row Size Of the Matrix:");
		row_size = cs.nextInt();
		System.out.print("Enter the columns Size Of the Matrix:");
		col_size = cs.nextInt();
		int matrix[][] = new int[row_size][col_size];
		// Taking input of the matrix
		int i, j;
		System.out.println("Enter the Matrix Element:");
		for (i = 0; i < row_size; i++) {
			for (j = 0; j < col_size; j++) {
				matrix[i][j] = cs.nextInt();
			}
		}
		// Calculate sum of given matrix Elements
		int sum = 0;
		for (i = 0; i < row_size; i++) {
			for (j = 0; j < col_size; j++) {
				sum += matrix[i][j];
			}
		}
		// Display The Sum Of Given Matrix Elements
		System.out.print("Sum of the Given Matrix Elements is: " + sum);
		cs.close();

	}

}
