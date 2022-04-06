package br.com.generation.Vetores;

import java.util.Scanner;

	public class HE_03 {

		public static void main(String[] args) {
//		3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//			a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
//			das matrizes N1 e N2;
//			b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
//			posição das matrizes N1 e N2.
		
			Scanner entrada = new Scanner (System.in);
			
			int[][] N1 = new int[2][3];
			int[][] N2 = new int[2][3];
			int[][] M1 = new int [2][3];
			int[][] M2 = new int [2][3];

			System.out.println("Digite os valores da matriz N1 ");
			for (int l = 0;l<N1.length;l++) {
				for (int c = 0;c<N1[l].length;c++) {

					System.out.printf("Digite os valores na posição %d %d: " , l,c); /*posição na matriz*/
					N1[l][c] = entrada.nextInt();
					
				}
				System.out.println();
			}
			System.out.println("Digite os valores da matriz N2 ");
			for (int l = 0;l<N2.length;l++) {
				for (int c = 0;c<N2[l].length;c++) {
					
					System.out.printf("Digite os valores na posição %d %d: " , l,c); /*posição na matriz*/
					N2[l][c] = entrada.nextInt();
					
				}
				System.out.println();
			}
			entrada.close();
			System.out.print("Matriz M1: \n");
			
			for (int l = 0;l<M1.length;l++) {
				for (int c = 0;c<M1[l].length;c++) {
					M1[l][c] = N1[l][c] + N2[l][c];
				
					System.out.print( M1[l][c] + "|");
				}
			System.out.println();
			}
			
			System.out.print("\nMatriz M2: \n");
			for (int l = 0;l<M2.length;l++) {
				for (int c = 0;c<M2[l].length;c++) {
					M2[l][c] = N1[l][c] - N2[l][c];
					System.out.print(M2[l][c] + "|");
				}
			System.out.println();
			}
		
		}

	}
