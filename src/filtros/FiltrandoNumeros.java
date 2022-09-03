package filtros;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class FiltrandoNumeros {

	public static void main(String[] args) {
		// cria lista imut�vel
		List<Integer> numeros = List.of(1,2,3,4,5,6,7);
		
		// 1
		System.out.println("\nFiltrando n�meros pares");
		numeros.stream()
				.filter(n -> n % 2 == 0)                   // Predicate (retorno l�gico)
				.forEach(System.out::println);			   // Consumer com Method Reference
		
		// 2
		System.out.println("\nSomando todos os n�meros com reduce");
		numeros.stream()
				.reduce((n1, n2) -> n1 + n2)				// BinaryOperator
				.ifPresent(System.out::println);			// Consumer com Method Reference
		
		// 3
		System.out.println("\nSomando somente os n�meros pares com filter reduce");
		numeros.stream()
			   .filter(n -> n % 2 == 0)
			   .reduce((n1, n2) -> n1 + n2)
			   .ifPresent(System.out::println);
		
		// 4 
		System.out.println("\nGerando n�mero aleat�rios");
		Stream.generate(() -> new Random().nextInt(100))
			  .limit(5)
			  .forEach(System.out::println);

	}

}
