package collectors;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

import dominio.Funcionario;

/*
 * classe java.util.Optional
 * foi criada para evitar verificações de extremos (de null por exemplo)
 * contém versões primitivasa: OptionalInt, OptionalLong, OptionalDouble
 */
public class ExemploOptional {

	public static void main(String[] args) {
		List<Funcionario> funcionarios = List.of(
											new Funcionario(1, "João", 16),
											new Funcionario(2, "Angelita", 27),
											new Funcionario(3, "Antonio", 39),
											new Funcionario(4, "Aparecida", 55)
										);
		
		// objetivo: calcula a média das idades
		OptionalDouble media = funcionarios.stream()
											.mapToInt(Funcionario::getIdade)
											.average();
		System.out.println(media.orElse(0.0));  // devolve a média ou 0.0
		
		// ou podemos lançar uma excessão se o valor for 0.0
		double valorMedia = funcionarios.stream()
										.mapToInt(Funcionario::getIdade)
										.average()
										.orElseThrow(IllegalStateException::new);
		System.out.println(valorMedia);
		
		// ou podemos verificar se existe um valor dentro de Option
		funcionarios.stream()
					.mapToInt(Funcionario::getIdade)
					.average()
					.ifPresent(System.out::println);  // só imprime se existir o valor
		
		// obtém o funcionário mais novo
		funcionarios.stream()
					.min(Comparator.comparing(Funcionario::getIdade))
					.ifPresent(f -> System.out.printf("\nIdade do funcionário mais novo: %d", f.getIdade()));
		
		// obtém o funcionário mais velho
		funcionarios.stream()
					.max(Comparator.comparing(Funcionario::getIdade))
					.ifPresent(f -> System.out.printf("\nIdade do funcionário mais velho: %d", f.getIdade()));
	}
}
