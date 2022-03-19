package conta;

public class Principal {

	public static void main(String[] args) {
		ContaCorrente contaJoao = new ContaCorrente(1000, 1234);
		ContaCorrente contaMaria = new ContaCorrente(2000, 456);
		contaJoao.depositar(100);
		contaJoao.depositar(100);
		contaJoao.depositar(100);
		
		contaJoao.setLimite(1500);
		System.out.println("Limite conta João: R$ " + contaJoao.getLimite() );
		
		System.out.println("Saldo atual: R$ "+ contaJoao.getSaldo());
		
		if (contaJoao.transferir(contaMaria, 100))
			System.out.println("Transferência OK");
		else
			System.out.println("Sem saldo para transfrência");
		
		if (contaJoao.sacar(380))
			System.out.println("Conseguiu sacar");
		else
			System.out.println("Não conseguiu sacar");
		
		System.out.println(contaJoao);
		
		
	

	}

}
