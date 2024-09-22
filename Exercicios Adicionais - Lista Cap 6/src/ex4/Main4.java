package ex4;
import java.util.Scanner;
public class Main4 {

	public static void main(String[] args) {
		//criando o vetor
		int [] numeros = new int[5];
		//criando o scanner
		Scanner coletor = new Scanner(System.in);
		
		//criando o loop para preencher o vetor
		for (int i=0; i<numeros.length; i++) {
			System.out.println(" Inforem um numero interio " + "["+i+"]");
			numeros[i] = coletor.nextInt();
		}
		//imprimindo o vetor
		for(int i =4; i>=0; i--) {
			System.out.println(numeros[i]);
			
		  }	
		 coletor.close();
		}		
			
	}


