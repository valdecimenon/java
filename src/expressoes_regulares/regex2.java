package expressoes_regulares;

/* expressoes regulares com metacaracteres tipo barra-letra (posix)
 * \\d = d�gito
 * \\D = n�o d�gito
 * \\w = letras
 * \\W = n�o letras
 * \\s = espa�o
 * \\S = n�o espa�o
 * 
*/
public class regex2 {
	
	public static void main(String[] args) {
	
		// valida somente n�meros (+ = 1 ou muitos) 
		String numeros = "123456";
		if (numeros.matches("\\d+"))  // (* = 0 ou muitos)
			System.out.println("N�meros v�lidos");
		else
			System.out.println("N�meros inv�lidos");
		
		// aceita letras, n�meros e espa�o (primeira deve ser mai�scula)
		String endereco = "Rua Santana 820";
		if (endereco.matches("[A-Z][\\w\\s]+"))
			System.out.println("endere�o v�lido");
		else
			System.out.println("endere�o inv�lido");
						
		// valida estado (apenas 2 letras)
		String uf = "PR";
		if (uf.matches("\\w{2}"))
			System.out.println("UF v�lido");
		else
			System.out.println("UF inv�lido");
		
		// valida o primeiro nome, no formato:
		// [A-Z]    = primeira letra deve ser mai�scula (sem espa�o)
		// [a-zA-Z] = segunda letra pode ser min�scula ou mai�scula.
		// *        = todos os demais caracteres (opcionais), seguem o padr�o do anterior (0 ou muitos)
		// Inv�lidos: "joao", "Joao da Silva", "Joao23"
		String nome = "Joao da Silva"; 
		if (nome.matches("[A-Z][\\w\\s]{4,19}"))  // m�nimo de 5 (1+4) e m�ximo de 20 caracteres
			System.out.println("nome v�lido");
		else
			System.out.println("nome inv�lido");
		
		
		// valida CEP
		// \\d = qualquer d�gito (0..9)
		String cep = "84010-320";
		if (cep.matches("\\d{5}-\\d{3}"))
			System.out.println("cep v�lido");
		else
			System.out.println("cep inv�lido");
		
		// valida fone
		// [1-9] = qualquer n�mero, menos zero.
		// \\d{3} = 3 d�gitos num�ricos
		String fone = "42-3028-0449";
		if (fone.matches("[1-9]\\d-[1-9]\\d{3}-\\d{4}"))
			System.out.println("fone v�lido");
		else
			System.out.println("fone inv�lido");
		
		// valida��o de hora (00:00 at� 23:59) 
		// solu��o de regex1.java
		String hora = "20:22";
		if (hora.matches("([01][0-9]|2[0-3]):[0-5][0-9]"))
			System.out.println("hora v�lida");
		else
			System.out.println("hora inv�lida");
		
		// valida��o de data (01/01/1000 at� 31/12/2999)
		// solu��o de regex1.java
		String data = "31/03/2014";
		if (data.matches("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[12][0-9]{3}"))
			System.out.println("data v�lida");
		else
			System.out.println("data inv�lida");
		
		// aceita somente consoantes e ignora mai�scula/min�sculas
		String consoantes = "bCdFghJkLmnPqrstvxywz";
		if (consoantes.matches("(?i)([a-z&&[^aeiou]]*)"))
			System.out.println("consoantes v�lidas");
		else
			System.out.println("consoantes inv�lidas");
		
	}
}
