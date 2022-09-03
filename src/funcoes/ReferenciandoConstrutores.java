package funcoes;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import dominio.Funcionario;

/*
 * Podemos implementar as interfaces Supplier, Function e BiFunction através do Method Reference,
 * simplemente referenciadno o método construtor = Funcionario::new
 */
public class ReferenciandoConstrutores {

	public static void main(String[] args) {
		
		// construtor sem argumentos (construtor padrão) = usando Supplier
		Supplier<Funcionario> supplier = Funcionario::new; // cria um objeto supplier
		Funcionario f1 = supplier.get();
		System.out.println(f1);
		// idem: Funcionario f1 = new Funcionario()
		
		// construtor com 01 argumento = usando Function
		Function<String, Funcionario> function = Funcionario::new; //cria um objeto function
		Funcionario f2 = function.apply("João da Silva");
		System.out.println(f2);
		// idem: Funcionario f2 = new Funcionario("João da Silva")
		
		// construtor com 02 argumentos = usando BiFunction
		BiFunction<String, Integer, Funcionario> biFunction = Funcionario::new; // cria objeto biFunction 
		Funcionario f3 = biFunction.apply("João da Silva", 55);
		System.out.println(f3);
		// idem: Funcionario f3 = new Funcionario("João da Silva", 55)
	}
}
