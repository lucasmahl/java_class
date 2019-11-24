package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// matriz bidimensional
		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Diagonal:" + mat[0][0] + " " + mat[1][1] + " " + mat[2][2]);

		int count = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.println("Negativos: " + count);

		System.out.println("Tamanho do array: " + mat.length);

		sc.close();

	}

}
