package expressoes_regulares;
/*
 * POSIX são grupos de caracteres com padronização internacional
 *   POSIX           JAVA          JAVA barra-letra     DESCRIÇÃO
 * [:alpha:]      \\p{Alpha}                            Alfabeto
 * [:alnum:]      \\p{Alnum}       \\w                  Alfanumérico
 * [:digit:]      \\p{Digit}       \\d                  Dígitos (números)
 * [:lower:]      \\p{Lower}                            Minúsculas
 * [:upper:]      \\p{Upper}                            Maiúsculas
 * [:space:]      \\p{Space}       \\s                  Caracters de espaço (\t\r\n\v\f)
 * [:punct:]      \\p{Punct}                            Pontuação e símbolos (.,;<=>!?@#$%&()-+/\\^~)
 */

// OBS.: Embora o padrão POSIX inclua acentuação em português, não está implementado no Java!! 
public class posix {

	public static void main(String[] args) {
		
		String cidade = "Ponta Grossa";
		if (cidade.matches("[\\p{Alpha}\\s]{3,20}"))
			System.out.println("cidade válida");
		else
			System.out.println("cidade inválida");
		
		String rua = "Rua Santana, 820";
		if (rua.matches("[\\p{Alnum},\\s]{3,20}"))
			System.out.println("rua válida");
		else
			System.out.println("rua inválida");
		
		String numero = "1234";
		if (numero.matches("\\p{Digit}{1,4}"))
			System.out.println("número válido");
		else
			System.out.println("número inválido");

	}

}
