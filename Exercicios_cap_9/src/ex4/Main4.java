package ex4;
import java.util.*;
public class Main4 {
		
		public static boolean primo(int numero, int divisor) {
		 // valida se o numero é menor que dois
		if (numero <2) {
			return false;
		//valida se o numero é dois, caso seja ele ja retorna que é verdade
		} if (numero == divisor) {
			return true;
		// valida se o numero divide pelo divisor 	
		} if (numero % divisor ==0) {
			return false;
		} 
		// caso  nenhuma condição seja atendida ele chama a função aumentando o valor do divisor ate que uma das condições seja atendida
			return primo(numero, divisor + 1);
			
		}
		// metodo main	
		
		public static void main(String[] args) {	
		//declara que o divisor inicia com o valor 2
		
			int divisor =2;	
		// cria o scanner para coletar o numero a ser verificado
		
		Scanner coletor = new Scanner(System.in);
		// printa a pergunta 
		
		System.out.println("Informe um numero");
		// salva o valor do numero
		
		int numero = coletor.nextInt();  
		
		// chama a função
		
		if(primo(numero, divisor)) {
			System.out.println("O numero "+numero+" é primo");
		}else {
			System.out.println("O numero "+numero+" não é primo");
		}
		coletor.close();
	}

}


