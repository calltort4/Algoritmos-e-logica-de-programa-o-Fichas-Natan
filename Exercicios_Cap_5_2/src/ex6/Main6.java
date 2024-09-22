package ex6;
import java.util.Scanner;
public class Main6 {

	public static void main(String[] args) {
		//criando o scanner
		Scanner coletor = new Scanner(System.in);
		// criando o vetor
		int [] meuVetor = new int[5];
		
		// preenchendo o vetor
		for(int i=0; i<meuVetor.length; i++) {
			System.out.println("Insira um numero interio: "+ i);
			meuVetor[i]= coletor.nextInt();
		}
		// inprimindo o vetor de forma invertida
		System.out.println("O Array invertido é:  \n====================");
		
		for(int i=4; i>=0; i--) {
			System.out.print( " "+meuVetor[i]);
		}
		
		coletor.close();
	}

}
