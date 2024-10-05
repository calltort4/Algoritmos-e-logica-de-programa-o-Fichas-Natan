package ex6;
import java.util.Scanner;
public class Main6 {

	 // Método recursivo para imprimir elementos do array
    public static void imprimirRecursivo(int[] vetor, int posicao) {
        // Condição base: se o índice for igual ao tamanho do array, a recursão para
        if (posicao == vetor.length) {
            return;
        }

        // Imprime o elemento atual
        System.out.println(vetor[posicao]);

        // Chamada recursiva com o próximo índice
        imprimirRecursivo(vetor, posicao + 1);
    }

    public static void main(String[] args) {
       Scanner coletor = new Scanner(System.in);
    	
    	// declarando o tamanho do vetor
    	int x;
    	
    	//solicitando o tamanho do vetor 
    	System.out.println("Informe a quantidade de numero que você vai digitar: ");
    	x = coletor.nextInt();
    	coletor. nextLine();
    	
    	//crian do o vetor que ira conter os numeros
        int[] numerosArray = new int[x];
        
        //for para preencher o vetor com os numeros informados 
        for(int i = 0; i<numerosArray.length; i++) {
        	System.out.println("Informe os numeros agora: ");
        	numerosArray[i] = coletor.nextInt();
        }
        coletor.close();
        // Chamada do método recursivo, iniciando com o índice 0
        imprimirRecursivo(numerosArray, 0);
    }
}