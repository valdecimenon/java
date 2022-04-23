package arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeituraGravacao {


	//m�todo est�tico � aquele que posso acessar sem criar um objeto
	public static void gravar(String arquivo) {

		try {
			// objeto para grava��o de texto
			FileWriter gravador = new FileWriter(arquivo);
			gravador.write("Primeira linha");
			gravador.write("\nBatatinha quando nasce...");
			gravador.write("\nBatatinha 1 2 3");
			gravador.write("\n�ltima linha");

			// fecha o arquivo
			gravador.close();
			System.out.println("Arquivo gravado com sucesso!");

		} catch (IOException e) {
			System.out.println("Erro durante grava��o do arquivo:\n " + arquivo);
			e.printStackTrace();
		}
	}
	
	static public void ler(String arquivo) {
		try {
			FileReader leitor = new FileReader(arquivo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha;
			while ((linha = buffer.readLine()) != null) {
				System.out.println(linha);
			}
			buffer.close();
			leitor.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo n�o encontrado para leitura:\n " + arquivo);
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("Erro durante a leitura do arquivo:\n " + arquivo);
			e.printStackTrace();
		}
	}
}
