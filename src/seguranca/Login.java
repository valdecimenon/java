package seguranca;

final public class Login {

	
	public void logar(String email, String senha) {
		if (email.equalsIgnoreCase("joao@gmail.com") &&
				senha.equalsIgnoreCase("123")) 
			System.out.println("Logou");
		else
			System.out.println("Login inválido!");
		
	}
}
