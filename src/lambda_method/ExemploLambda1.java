package lambda_method;

import java.util.List;
import java.util.function.Consumer;

import dominio.Funcionario;

public class ExemploLambda1 {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(1, "Jo�o da Silva", 22);
		Funcionario f2 = new Funcionario(2, "Alberto Roberto", 33);
		Funcionario f3 = new Funcionario(3, "Mariana Maria", 44);
		List<Funcionario> pessoas = List.of(f1, f2, f3);
		
		// 1
		for (int i=0; i<pessoas.size(); i++) {
			System.out.println(pessoas.get(i));
		}
		
		// 2
		System.out.println("\nCom foreach convencional");
		for (Funcionario p : pessoas) {
			System.out.println(p);
		}
		
		// 3
		System.out.println("\nCom foreach funcional e classe concreta");
		Consumer<Funcionario> consumidor = new Consumidor();
		pessoas.forEach(consumidor);
		
		// 4 
		System.out.println("\nCom foreach funcional e classe an�nima");
		pessoas.forEach(new Consumer<Funcionario>() {

			@Override
			public void accept(Funcionario p) {
				System.out.println(p);
			}
		});
		
		// 5 
		/*
		 * O que � lambda no Java?
		 * Lambda � uma forma de representar uma classe an�nima 
		 * que possua um �nico m�todo (interface funcional)
		 */
		// Reescrevendo o c�digo acima com lambda ->
		Consumer<Funcionario> consumidor2 = (Funcionario p) -> {
			System.out.println(p);
		};
		
		System.out.println("\nCom foreach funcional e lambda");
		pessoas.forEach(consumidor2);
		
		// 6
		// simplificando o c�digo acima
		System.out.println("\nCom foreach funcional e lambda simplificado");
		pessoas.forEach(f -> System.out.println(f));

	}

}
