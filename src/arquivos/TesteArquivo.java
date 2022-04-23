package arquivos;

public class TesteArquivo {

	public static void main(String[] args) {
		
		String arquivo = "d:/Curso Java 2022/aula07/src/arquivos/texto.txt";
		
		LeituraGravacao.gravar(arquivo);
		
		LeituraGravacao.ler(arquivo);
				

	}

}
