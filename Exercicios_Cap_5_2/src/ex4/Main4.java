package ex4;

public class Main4 {

	public static void main(String[] args) {
		//declarando a variavel numero
		
		int numero= 50;
		
		//loop for para imprimir os numeros 
		for(int i=1; i<=numero; i++) {
			//codição para parar o loop caso o numero seja divisivel por 13
			if(i%13!=0) {
				System.out.println(i);
			} else {
				break;
			}
		}	
	}
}
