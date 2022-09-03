package expressoes_regulares;

public class regex1 {

	public static void main(String[] args) {
		
		// aceita letras maiúsculas e minúscula em qualquer quantidade (0 ou muitos)
		// [A-Za-z] é a lista de caracteres aceitos
		// * é o quantificador 0 ou muitos
		String letras = "AbracaDabra";
		if (letras.matches("[A-Za-z]*"))
			System.out.println("letras válidas");
		else
			System.out.println("letras inválidas");
		
		// aceita apenas dígitos (pelo menos um ou muitos)
		// [0-9] é lista de dígitos aceitoas
		// + é o quantificador 1 ou muitos
		String digitos = "1927409377";
		if (digitos.matches("[0-9]+"))
			System.out.println("digitos válidos");
		else
			System.out.println("digitos inválidos");
		
		// aceita caracteres alfanuméricos (com 6 dígitos)
		String senha = "A7b3c8";
		if (senha.matches("[A-Za-z0-9]{6}"))
			System.out.println("senha válida");
		else
			System.out.println("Senha inválida");
		
		// OU |
		String animal1 = "gato";
		if (animal1.matches("gato|pato|rato"))    // gato, rato ou pato
			System.out.println("animal1 válido");
		else
			System.out.println("animal1 inválido");
		
		// lista + caracteres
		String animal2 = "gato";    // gato, rato ou pato
		if (animal2.matches("[grp]ato"))
			System.out.println("animal2 válido");
		else
			System.out.println("animal2 inválido");
		
		// [grp] = lista de caracteres aceitos na 1a posição
		// [a-z] = faixa de caracteres aceitos na 2a posição
		// {3} quantificador de [a-z] repetir para 3 posições
		String animal3 = "gato";   // g/p/r/xxx
		if (animal3.matches("[grp][a-z]{3}"))
			System.out.println("animal3 válido");
		else
			System.out.println("animal3 inválido");
		
		// ( )  grupo
		// ? opcional
		String mercado = "mercado";  //minimercado, supermercado, hipermercado ou mercado
		// "(su|hi)permercado" ou "((su|hi)per)?mercado" ou "(mini|(su|hi)per)?mercado"
		if (mercado.matches("(mini|super|hiper)?mercado"))
			System.out.println("mercado válido");
		else
			System.out.println("mercado inválido");
		
		// ( ) grupo com quantificador
		String ai = "aiaiaiai";
		if (ai.matches("(ai)+"))
			System.out.println("ai válido");
		else
			System.out.println("ai inválido");
		
		// validação de hora (00:00 até 29:59) 
		// solução em regex2.java
		String hora = "20:22";
		if (hora.matches("[012][0-9]:[0-5][0-9]"))
			System.out.println("hora válida");
		else
			System.out.println("hora inválida");
		
		// validação de data (00/00/0000 até 39/13/9999)
		// solução em regex2.java
		String data = "31/03/2014";
		if (data.matches("[0-3][0-9]/[01][0-3]/[0-9]{4}"))
			System.out.println("data válida");
		else
			System.out.println("data inválida");
		
		// o curinga . (ponto aceita qualquer coisa)
		// + aceita 1 ou mais digitos
		String valor = "2,5";                     
		if (valor.matches("[0-9]+.[0-9]+"))   
			System.out.println("valor válido");     // válidos = 2,5 2.5 2x5 2a5 123,456
		else
			System.out.println("valor inválido");   // inválidos = ,5 2, ,

		// OU |
		String resposta1 = "sim";    // sim ou nao
		if (resposta1.matches("sim|nao"))
			System.out.println("resposta1 válida");
		else
			System.out.println("resposta1 inválida");
		
		// OU |
		String resposta2 = "não";   // sim ou (nao ou não)
		if (resposta2.matches("sim|n[aã]o"))
			System.out.println("resposta2 válida");
		else
			System.out.println("resposta2 inválida");
		
		String palavra = "acalento";
		if (palavra.matches(".*lento"))
			System.out.println("palavra válida");   // válidos = lento, xxxlento
		else
			System.out.println("palavra inválida"); // ento, acaxxxx
		
		// buscando vicente, aceita "etneciv", "eTneciV", "cevietn", ...
		String rua1 = "Avenida Vicente Machado, 123";
		if (rua1.matches(".*[VICENTEvicente]{7}.*"))
			System.out.println("rua1 encontrada");
		else
			System.out.println("rua1 não encontrada");
		
		// buscando vicente, aceita apenas "VICENTE" ou "vicente" (não aceita "Vicente")
		String rua2 = "Avenida Vicente Machado, 123";
		if (rua2.matches(".*(VICENTE|vicente).*"))
			System.out.println("rua2 encontrada");
		else
			System.out.println("rua2 não encontrada");
		
		String acentos = "água, acentuação e espaço";
		if (acentos.matches("[a-zçãá ,]+"))
			System.out.println("acentos válidos");
		else
			System.out.println("acentos inválidos");
		
		// (?i) ignora maiúscula/minúscula (case insensitive)
		String livro = "Livro";
		if (livro.matches("(?i)([a-z]*)"))
			System.out.println("livro válido");
		else
			System.out.println("livro inválido");
	}

}
