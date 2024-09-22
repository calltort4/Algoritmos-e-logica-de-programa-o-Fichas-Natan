package ex5;
import java.util.Scanner;
public class Main5 {

	public static void main(String[] args) {
		//declarando variavel 
		int ano;
		
		// criando o scanner
		Scanner coletor = new Scanner(System.in);
		
		//coletando o ano
		
		System.out.println("informe o ano");
		ano = coletor.nextInt();
		
		// fazendo a condição e imprimindo 
		
		if((ano%4==0 && ano%100!=0) || (ano%400==0)){
			System.out.printf("%d é bissesto", ano);
		} else {
			System.out.printf("%d não é bissesto", ano);
	
		}
		coletor.close();
	}

}
