package expressoes_regulares;

public class regex1 {

	public static void main(String[] args) {
		
		// aceita letras mai�sculas e min�scula em qualquer quantidade (0 ou muitos)
		// [A-Za-z] � a lista de caracteres aceitos
		// * � o quantificador 0 ou muitos
		String letras = "AbracaDabra";
		if (letras.matches("[A-Za-z]*"))
			System.out.println("letras v�lidas");
		else
			System.out.println("letras inv�lidas");
		
		// aceita apenas d�gitos (pelo menos um ou muitos)
		// [0-9] � lista de d�gitos aceitoas
		// + � o quantificador 1 ou muitos
		String digitos = "1927409377";
		if (digitos.matches("[0-9]+"))
			System.out.println("digitos v�lidos");
		else
			System.out.println("digitos inv�lidos");
		
		// aceita caracteres alfanum�ricos (com 6 d�gitos)
		String senha = "A7b3c8";
		if (senha.matches("[A-Za-z0-9]{6}"))
			System.out.println("senha v�lida");
		else
			System.out.println("Senha inv�lida");
		
		// OU |
		String animal1 = "gato";
		if (animal1.matches("gato|pato|rato"))    // gato, rato ou pato
			System.out.println("animal1 v�lido");
		else
			System.out.println("animal1 inv�lido");
		
		// lista + caracteres
		String animal2 = "gato";    // gato, rato ou pato
		if (animal2.matches("[grp]ato"))
			System.out.println("animal2 v�lido");
		else
			System.out.println("animal2 inv�lido");
		
		// [grp] = lista de caracteres aceitos na 1a posi��o
		// [a-z] = faixa de caracteres aceitos na 2a posi��o
		// {3} quantificador de [a-z] repetir para 3 posi��es
		String animal3 = "gato";   // g/p/r/xxx
		if (animal3.matches("[grp][a-z]{3}"))
			System.out.println("animal3 v�lido");
		else
			System.out.println("animal3 inv�lido");
		
		// ( )  grupo
		// ? opcional
		String mercado = "mercado";  //minimercado, supermercado, hipermercado ou mercado
		// "(su|hi)permercado" ou "((su|hi)per)?mercado" ou "(mini|(su|hi)per)?mercado"
		if (mercado.matches("(mini|super|hiper)?mercado"))
			System.out.println("mercado v�lido");
		else
			System.out.println("mercado inv�lido");
		
		// ( ) grupo com quantificador
		String ai = "aiaiaiai";
		if (ai.matches("(ai)+"))
			System.out.println("ai v�lido");
		else
			System.out.println("ai inv�lido");
		
		// valida��o de hora (00:00 at� 29:59) 
		// solu��o em regex2.java
		String hora = "20:22";
		if (hora.matches("[012][0-9]:[0-5][0-9]"))
			System.out.println("hora v�lida");
		else
			System.out.println("hora inv�lida");
		
		// valida��o de data (00/00/0000 at� 39/13/9999)
		// solu��o em regex2.java
		String data = "31/03/2014";
		if (data.matches("[0-3][0-9]/[01][0-3]/[0-9]{4}"))
			System.out.println("data v�lida");
		else
			System.out.println("data inv�lida");
		
		// o curinga . (ponto aceita qualquer coisa)
		// + aceita 1 ou mais digitos
		String valor = "2,5";                     
		if (valor.matches("[0-9]+.[0-9]+"))   
			System.out.println("valor v�lido");     // v�lidos = 2,5 2.5 2x5 2a5 123,456
		else
			System.out.println("valor inv�lido");   // inv�lidos = ,5 2, ,

		// OU |
		String resposta1 = "sim";    // sim ou nao
		if (resposta1.matches("sim|nao"))
			System.out.println("resposta1 v�lida");
		else
			System.out.println("resposta1 inv�lida");
		
		// OU |
		String resposta2 = "n�o";   // sim ou (nao ou n�o)
		if (resposta2.matches("sim|n[a�]o"))
			System.out.println("resposta2 v�lida");
		else
			System.out.println("resposta2 inv�lida");
		
		String palavra = "acalento";
		if (palavra.matches(".*lento"))
			System.out.println("palavra v�lida");   // v�lidos = lento, xxxlento
		else
			System.out.println("palavra inv�lida"); // ento, acaxxxx
		
		// buscando vicente, aceita "etneciv", "eTneciV", "cevietn", ...
		String rua1 = "Avenida Vicente Machado, 123";
		if (rua1.matches(".*[VICENTEvicente]{7}.*"))
			System.out.println("rua1 encontrada");
		else
			System.out.println("rua1 n�o encontrada");
		
		// buscando vicente, aceita apenas "VICENTE" ou "vicente" (n�o aceita "Vicente")
		String rua2 = "Avenida Vicente Machado, 123";
		if (rua2.matches(".*(VICENTE|vicente).*"))
			System.out.println("rua2 encontrada");
		else
			System.out.println("rua2 n�o encontrada");
		
		String acentos = "�gua, acentua��o e espa�o";
		if (acentos.matches("[a-z��� ,]+"))
			System.out.println("acentos v�lidos");
		else
			System.out.println("acentos inv�lidos");
		
		// (?i) ignora mai�scula/min�scula (case insensitive)
		String livro = "Livro";
		if (livro.matches("(?i)([a-z]*)"))
			System.out.println("livro v�lido");
		else
			System.out.println("livro inv�lido");
	}

}
