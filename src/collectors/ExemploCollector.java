package collectors;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import dominio.Funcionario;

/*
 * Um Collector converte Stream em Collection,chamando o m�todo collect() do Stream
 * Collector � a jun��o de v�rias interfaces funcionais como : Supplier, BiConsumer, Function, etc
 */
public class ExemploCollector {

	public static void main(String[] args) {
				
		List<Funcionario> funcionarios = List.of(
											new Funcionario(1, "Jo�o", 16),
											new Funcionario(2, "Angelita", 27),
											new Funcionario(3, "Antonio", 39),
											new Funcionario(4, "Aparecida", 55)
										);
		
		// fornecedor � uma factory da classe Funcionario  (f�brica de funcion�rios)
		Supplier<ArrayList<Funcionario>> fornecedor = ArrayList::new;  // method reference
		
		// acumulador serve para dicionar cada elemento na cole��o
		BiConsumer<ArrayList<Funcionario>, Funcionario> acumulador = ArrayList::add;
		
		// combinador serve para dicionar mais de um elemento ao mesmo tempo
		BiConsumer<ArrayList<Funcionario>, ArrayList<Funcionario>> combinador = ArrayList::addAll;
		
		// stream = pipeline
		List<Funcionario> maisDe30 = funcionarios.stream()
												 .filter(f -> f.getIdade() > 30)
												 .collect(fornecedor, acumulador, combinador);
		maisDe30.forEach(System.out::println);
		
		// ficou complicado, ent�o vamos simplificar
		System.out.println("\nCollector simplificado devolvendo List");
		funcionarios.stream()
					.filter(f -> f.getIdade() > 30)
					.collect(Collectors.toList())  // retorna um collector parecido com o de cima
					.forEach(System.out::println);
		
		// tamb�m podemos devolver um Set com collector
		System.out.println("\nCollector devolvendo Set");
		funcionarios.stream()
					.filter(f -> f.getIdade() > 30)
					.collect(Collectors.toSet())
					.forEach(System.out::println);
		
		System.out.println("\nObtendo uma implementa��o de Collection");
		funcionarios.stream()
					.filter(f -> f.getIdade() > 30)
					.collect(Collectors.toCollection(HashSet::new))
					.forEach(System.out::println);
		
		System.out.println("\nCollection personalizada");
		Funcionario[] array = funcionarios.stream()
										.filter(f -> f.getIdade() > 30)
										.toArray(Funcionario[]::new);
		
		for (Funcionario f : array)
			System.out.println(f);
					
					
					
					
		
	}
}
