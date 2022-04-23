package seguranca;

public class Teste {

	public static void main(String[] args) {
		Login login = new MeuLogin();
		
		if (login instanceof Login)
			login.logar("joao@gmail.com", "123");
		else
			System.out.println("falha de segurança");

	}

}
