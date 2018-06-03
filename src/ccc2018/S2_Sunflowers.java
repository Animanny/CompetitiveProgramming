package ccc2018;
import java.net.DatagramPacket;
import java.util.ArrayList;
import java.util.Scanner;

public class S2_Sunflowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean state = false;
		int[][] data = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				data[i][j] = sc.nextInt();
			}
		}

		while (!state) {
			state = true;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n-1; j++) {
					if(data[i][j+1] > data[i][j]){
					} else {
						state = false;
						break;
					}
				}
			}
			
			for (int j = 0; j < n; j++) {
				for (int i = 0; i < n-1; i++) {
					if(data[i+1][j] > data[i][j]){
					} else {
						state = false;
						break;
					}
				}
			}
			
			if (state == false){
				rotateCC(data,n);
			}
		}
		
		printMatrix(data,n);

	}

	public static void rotateCC(int[][] matrix, int size) {
		transpose(matrix, size);
		reverseColumns(matrix, size);
	}

	public static void transpose(int[][] matrix, int size) {
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				int temp = matrix[j][i];
				matrix[j][i] = matrix[i][j];
				matrix[i][j] = temp;
			}
		}
	}

	public static void reverseColumns(int matrix[][], int size) {
		for (int i = 0; i < size; i++)
			for (int j = 0, k = size - 1; j < k; j++, k--) {
				int temp = matrix[j][i];
				matrix[j][i] = matrix[k][i];
				matrix[k][i] = temp;
			}
	}

	public static void printMatrix(int[][] matrix, int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
