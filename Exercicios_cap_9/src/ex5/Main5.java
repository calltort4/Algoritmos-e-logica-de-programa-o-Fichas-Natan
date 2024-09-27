package ex5;
import java.util.*;
public class Main5 {

public static String inverteString(String texto) {
		
		// primeira condição onde avalia se o parâmetro  textp esta vazia. Caso esteja vai retornar o texto.
		if(texto.isEmpty()) {
			return texto;
		}else {
			/*inicia a recursividade, pegando o primeiro letra da palavra, removendo ela da palavra e mandando para a ultima posição invertendo
			 a ordem da palavra*/
			return inverteString(texto.substring(1)) + 
					texto.charAt(0);
		}
		
	}
	
	// metodo main
	public static void main(String[] args) {
		//coletor da palavra a ser invertida
		Scanner coletor = new Scanner(System.in);
		
		System.out.println("Informe uma palavra para ser invertida");
		String texto = coletor.next();
		//printa na tela
		System.out.println(inverteString(texto));
	}

}