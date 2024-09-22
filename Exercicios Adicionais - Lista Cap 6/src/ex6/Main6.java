package ex6;
import java.util.Scanner;
public class Main6 {

	public static void main(String[] args) {
		int[][] matrizX = new int[3][3];
		int soma;
		Scanner coletor = new Scanner(System.in);
		System.out.println("Iniciando formação de matriz");
		
		//formação da matriz
		
		for (int i = 0; i<matrizX.length; i++) {
			for (int j = 0; j<matrizX[i].length; j++) {
				System.out.println("Informe um numero inteiro para a formação da matriz: ");
				matrizX[i][j]= coletor.nextInt();
			}
		}
		
		//mostando a matriz formada
		
		for(int i=0; i<matrizX.length; i++) {
			for(int j=0; j<matrizX[i].length; j++) {
				System.out.print(matrizX[i][j] + " ");
		   }
		  System.out.println();
		}
		// Espaço para não ficar tudo imendado e deixar o print feio 
		 System.out.println();
		//Somando a diagonal principal
		
		soma = matrizX[0][0] + matrizX[1][1] + matrizX[2][2];
		System.out.println("A soma dos elementos da diagonal prinicipal é: "+ soma);
		
		coletor.close();
	}

}
