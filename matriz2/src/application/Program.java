package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Números de linhas: ");
		int M = sc.nextInt();
		System.out.print("Números de colunas: ");
		int N = sc.nextInt();
		int[][] mat = new int[M][N];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat [i][j] = sc.nextInt();
			}
		}		
		
		System.out.print("Digite um número: ");
		int X = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == X) {
					System.out.println("Posição de X: (" + i + "," + j + ")");
					if (j - 1 >= 0) {
						System.out.println("Esquerda de X: " + mat[i][j-1]);
					}
					if (j + 1 < mat[i].length) {
						System.out.println("Direita de X: " + mat[i][j+1]);
					}
					if (i - 1 >= 0) {
						System.out.println("Acima de X: " + mat[i-1][j]);
					}
					if (i + 1 < mat.length) {
						System.out.println("Abaixo de X: " + mat[i+1][j]);
					}
				}				
			}
		}
		
		sc.close();

	}

}
