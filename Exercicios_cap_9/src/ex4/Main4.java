package ex4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Main4 {

		
		public static void main(String[] args) throws IOException  {	
		//declara que o divisor inicia com o valor 2
		
		try (BufferedReader leitor = new BufferedReader(new FileReader("arquivo1.csv"))) {
			String linha;
				
			while ((linha = leitor.readLine()) != null) {
				String[] dados = linha.split(";");
				String nome = dados[0];
				double nota1 = Double.parseDouble(dados[1]);
				double nota2 = Double.parseDouble(dados[2]);
				double nota3 = Double.parseDouble(dados[3]);

				double media = (nota1 + nota2 + nota3) / 3;
				System.out.printf("%s - Média: %.2f%n ", nome, media);
		    }
        } catch (IOException e) {
            e.printStackTrace();
		}
			
			
	}

}


