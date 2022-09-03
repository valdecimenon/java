package expressoes_regulares;
/*
 * POSIX s�o grupos de caracteres com padroniza��o internacional
 *   POSIX           JAVA          JAVA barra-letra     DESCRI��O
 * [:alpha:]      \\p{Alpha}                            Alfabeto
 * [:alnum:]      \\p{Alnum}       \\w                  Alfanum�rico
 * [:digit:]      \\p{Digit}       \\d                  D�gitos (n�meros)
 * [:lower:]      \\p{Lower}                            Min�sculas
 * [:upper:]      \\p{Upper}                            Mai�sculas
 * [:space:]      \\p{Space}       \\s                  Caracters de espa�o (\t\r\n\v\f)
 * [:punct:]      \\p{Punct}                            Pontua��o e s�mbolos (.,;<=>!?@#$%&()-+/\\^~)
 */

// OBS.: Embora o padr�o POSIX inclua acentua��o em portugu�s, n�o est� implementado no Java!! 
public class posix {

	public static void main(String[] args) {
		
		String cidade = "Ponta Grossa";
		if (cidade.matches("[\\p{Alpha}\\s]{3,20}"))
			System.out.println("cidade v�lida");
		else
			System.out.println("cidade inv�lida");
		
		String rua = "Rua Santana, 820";
		if (rua.matches("[\\p{Alnum},\\s]{3,20}"))
			System.out.println("rua v�lida");
		else
			System.out.println("rua inv�lida");
		
		String numero = "1234";
		if (numero.matches("\\p{Digit}{1,4}"))
			System.out.println("n�mero v�lido");
		else
			System.out.println("n�mero inv�lido");

	}

}
