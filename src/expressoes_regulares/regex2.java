package expressoes_regulares;

/* expressoes regulares com metacaracteres tipo barra-letra (posix)
 * \\d = dígito
 * \\D = não dígito
 * \\w = letras
 * \\W = não letras
 * \\s = espaço
 * \\S = não espaço
 * 
*/
public class regex2 {
	
	public static void main(String[] args) {
	
		// valida somente números (+ = 1 ou muitos) 
		String numeros = "123456";
		if (numeros.matches("\\d+"))  // (* = 0 ou muitos)
			System.out.println("Números válidos");
		else
			System.out.println("Números inválidos");
		
		// aceita letras, números e espaço (primeira deve ser maiúscula)
		String endereco = "Rua Santana 820";
		if (endereco.matches("[A-Z][\\w\\s]+"))
			System.out.println("endereço válido");
		else
			System.out.println("endereço inválido");
						
		// valida estado (apenas 2 letras)
		String uf = "PR";
		if (uf.matches("\\w{2}"))
			System.out.println("UF válido");
		else
			System.out.println("UF inválido");
		
		// valida o primeiro nome, no formato:
		// [A-Z]    = primeira letra deve ser maiúscula (sem espaço)
		// [a-zA-Z] = segunda letra pode ser minúscula ou maiúscula.
		// *        = todos os demais caracteres (opcionais), seguem o padrão do anterior (0 ou muitos)
		// Inválidos: "joao", "Joao da Silva", "Joao23"
		String nome = "Joao da Silva"; 
		if (nome.matches("[A-Z][\\w\\s]{4,19}"))  // mínimo de 5 (1+4) e máximo de 20 caracteres
			System.out.println("nome válido");
		else
			System.out.println("nome inválido");
		
		
		// valida CEP
		// \\d = qualquer dígito (0..9)
		String cep = "84010-320";
		if (cep.matches("\\d{5}-\\d{3}"))
			System.out.println("cep válido");
		else
			System.out.println("cep inválido");
		
		// valida fone
		// [1-9] = qualquer número, menos zero.
		// \\d{3} = 3 dígitos numéricos
		String fone = "42-3028-0449";
		if (fone.matches("[1-9]\\d-[1-9]\\d{3}-\\d{4}"))
			System.out.println("fone válido");
		else
			System.out.println("fone inválido");
		
		// validação de hora (00:00 até 23:59) 
		// solução de regex1.java
		String hora = "20:22";
		if (hora.matches("([01][0-9]|2[0-3]):[0-5][0-9]"))
			System.out.println("hora válida");
		else
			System.out.println("hora inválida");
		
		// validação de data (01/01/1000 até 31/12/2999)
		// solução de regex1.java
		String data = "31/03/2014";
		if (data.matches("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[12][0-9]{3}"))
			System.out.println("data válida");
		else
			System.out.println("data inválida");
		
		// aceita somente consoantes e ignora maiúscula/minúsculas
		String consoantes = "bCdFghJkLmnPqrstvxywz";
		if (consoantes.matches("(?i)([a-z&&[^aeiou]]*)"))
			System.out.println("consoantes válidas");
		else
			System.out.println("consoantes inválidas");
		
	}
}
