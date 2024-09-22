package ex5;
import java.util.Scanner;
public class Main5 {

	public static void main(String[] args) {
		
		int[][] matrizB = new int[3][3];
		int[][] matrizA = new int[3][3];
		Scanner coletor = new Scanner(System.in);
		
		//preenchendo a matrizA
		for( int i = 0; i<matrizA.length; i++) {
			for(int a = 0; a<matrizA[i].length; a++) {
				System.out.println("informe numeros inteiros da matriz A: ["+ i +";"+ a +"]");
				matrizA[i][a] =coletor.nextInt();
			}	
		}
		
		// mostrando a matriz A
		for( int i = 0; i<matrizA.length; i++) {
			for(int a = 0; a<matrizA[i].length; a++) {
				System.out.print(matrizA[i][a] + " ");
			} System.out.println();
		}
		
		//preenchendo a matriz B
		for( int i = 0; i<matrizB.length; i++) {
			for(int a = 0; a<matrizB[i].length; a++) {
				System.out.println("informe numeros inteiros da matriz B: ["+ i +";"+ a +"]");
				matrizB[i][a] = coletor.nextInt();
			}
		} 
		
		//mostrando a matriz B
		for(int i =0; i<matrizB.length; i++) {
			for(int a = 0; a<matrizB[i].length; a++){
				System.out.print(matrizB[i][a] + " ");
			}System.out.println();
		}
		
		// realizando a soma das matrizes A e B
		System.out.println();
		System.out.println();
	
	
	  //soma das matrizes A e B
 		int[][] matrizS = new int [3][3];
		for( int i =0; i<matrizA.length; i++) {
			for (int a = 0; a<matrizA[i].length; a++) {
				matrizS[i][a] = matrizA[i][a] + matrizB[i][a];
				//Mostrando a soma das matrizes
				System.out.print(matrizS[i][a]+ " ");
			} System.out.println();
		}	
		
 coletor.close();
		
		
		
}
}