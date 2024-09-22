package ex5;

public class Main5 {

	public static void main(String[] args) {
		//declarando as variaveis
		int numero1=0;
		int numero2=1;
		int numero3; 
		int contador=10;
		int i=1;
		
		
		//loop da Fibo
		while(i<=contador) {
		 numero3 =numero1+numero2;
		 System.out.println(" "+ numero3);
		 numero1=numero2;
		 numero2=numero3;
		 i++;
		}
		
		

	}

}
