package ex7;

import java.util.Scanner;

public class Main7 {

public static boolean primo(int numero) {
		
		for(int i = 2; i<numero; i++) {
			if(numero%i==0) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		Scanner coletor = new Scanner(System.in);
		
		System.out.println(" Informe o numero: ");
		int numero = coletor.nextInt();
		
		if (primo(numero)) {
			System.out.println(numero +" é primo");
		} else {
			System.out.println(numero +" não é primo");
		}
		
			
		coletor.close();
		
	}

}
	