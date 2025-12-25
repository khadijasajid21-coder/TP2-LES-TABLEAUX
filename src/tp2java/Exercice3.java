package tp2java;

import java.util.Scanner;

public class Exercice3 {

	public static int[][] spirale(int n) {
		int[][] mat = new int[n][n];

		int num = 1;
		int top = 0, bottom = n - 1;
		int left = 0, right = n - 1;

		while (top <= bottom && left <= right) {

			for (int i = left; i <= right; i++) {
				mat[top][i] = num++;
			}
			top++;

			for (int i = top; i <= bottom; i++) {
				mat[i][right] = num++;
			}
			right--;

			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					mat[bottom][i] = num++;
				}
				bottom--;
			}

			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					mat[i][left] = num++;
				}
				left++;
			}
		}

		return mat;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Donner un Nombre");
			int n = sc.nextInt();
			int[][] m = spirale(n);

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.printf("%3d", m[i][j]);
				}
				System.out.println();
			}
		}
	}
}