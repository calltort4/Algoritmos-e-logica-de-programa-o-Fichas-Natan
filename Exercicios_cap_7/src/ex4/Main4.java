package ex4;
import java.util.*;
public class Main4 {

		public static boolean primo(int numero, int divisor) {
		 
		if (numero <2) {
			return false;
			
		} if (numero == divisor) {
			return true;
			
		} if (numero % divisor ==0) {
			return false;
			
		} 
			return primo(numero, divisor + 1);
			
		}
			
		public static void main(String[] args) {	
		
		int divisor =2;	
		Scanner coletor = new Scanner(System.in);
		System.out.println("Informe um numero");
		
		int numero = coletor.nextInt();
		
		if(primo(numero, divisor)) {
			System.out.println("O numero "+numero+" é primo");
		}else {
			System.out.println("O numero "+numero+" não é primo");
		}
		coletor.close();
	}

}


