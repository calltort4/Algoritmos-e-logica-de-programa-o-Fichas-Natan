package ex6;
import java.util.Scanner;
public class Main6 {

public static void main(String[] args) {
		
		//declaracao do scanner 
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		float n1, n2, result;
		int calculadora;
		boolean ativado;
		//entrada
		ativado = true;
		
		while(ativado==true) {
		System.out.println("------------------------------");
		System.out.println("Para adição digite [1]");
		System.out.println("Para subtração digite [2]");
		System.out.println("Para multiplicação digite [3]");
		System.out.println("Para divisão digite [4]");
		System.out.println("Para sair digite [5]");
		System.out.println("------------------------------");
		calculadora = leia.nextInt();
		
		//calculo
		switch (calculadora) {
				//soma
		      case 1:
		    	  System.out.println("informe o primeiro termo");
		    	  n1 = leia.nextFloat();
		    	  
		    	  System.out.println("informe o segundo termo");
		    	  n2 = leia.nextFloat();
		    	  
		    	  result = n1 + n2; 
		    	  
		    	  System.out.println("Resultado é:"+ result );
		break;
			  //subtração
		      case 2:
		    	  System.out.println("Informe o primeiro termo");
		    	  n1 = leia.nextFloat();
		    	  
		    	  System.out.println("Informe o segundo termo");
		    	  n2 = leia.nextFloat();
		    	  
		    	  result = n1 - n2;
		    	  
		    	  System.out.println("Resultado é:"+ result);
	    break;
	          //multiplicação
		      case 3: 
		    	  System.out.println("Informe o primeiro termo");
		    	  n1 = leia.nextFloat();
		    	  
		    	  System.out.println("Informe o segundo termo");
		    	  n2 = leia.nextFloat();
		    	  
		    	  result = n1 * n2;
		    	  
		    	  System.out.println("Resultado é:"+ result);
	    break;
	          //divisão
		      case 4:
		    	  System.out.println("Informe o primeiro termo");
		    	  n1 = leia.nextFloat();
		    	  
		    	  System.out.println("Informe o segundo termo");
		    	  n2 = leia.nextFloat();
		    	  
		    	  result = n1 % n2;
		    	  
		    	  System.out.println("Resultado é:"+ result);
	   break;
	   		//fecha a calculadora
		      case 5:
		    	  System.out.println("Você fechou a calculadora");
		    	  ativado=false;
		    	  
       break;
				}
		
			}
		}
	}
