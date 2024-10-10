package ex4;
import java.util.*;
import java.io.*;
public class Main4 {

		
		public static void main(String[] args) throws IOException  {	
		//declara que o divisor inicia com o valor 2
		
		BufferedReader leitor = new BufferedReader(new FileReader("arquivo.csv"));
		String linha;
			
		while ((linha = leitor.readLine()) != null) {
			System.out.println(linha);
		}
			
			
	}

}


