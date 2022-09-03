package filtros;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import dominio.Funcionario;

public class FiltrandoFuncionarios {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(1, "Rafael", 16, 1200f);
		Funcionario f2 = new Funcionario(2, "Gabriel", 33, 4500f);
		Funcionario f3 = new Funcionario(3, "Josiel", 44, 7500f);
		Funcionario f4 = new Funcionario(4, "Miguel", 55, 9000f);
		Funcionario f5 = new Funcionario(5, "Angela", 22, 2500f);
		Funcionario f6 = new Funcionario(6, "Diana", 65, 15000f);
		Funcionario f7 = new Funcionario(7, "Sofia", 17, 1300f);
		
		// cria lista imutável
		List<Funcionario> funcionarios = List.of(f1, f2, f3, f4, f5, f6, f7);
		
		System.out.println("\nLimitando a quantidade");
		funcionarios.stream()							// stream permite concatenar métodos
					.limit(3)							
					.forEach(System.out::println);		// Consumer e Method Reference
		
		System.out.println("\nFiltrando por idade:");
		funcionarios.parallelStream()
					.filter(f -> f.getIdade() >= 18)
					.forEach(System.out::println);
		
		System.out.println("\nFiltrando por salário: acima de R$ 3000");
		funcionarios.parallelStream()
					.filter(f -> f.getSalario() >= 3000)
					.forEach(System.out::println);
		
		System.out.println("\nRemovendo todos os maiores de idade");
		List<Funcionario> soMenores = new ArrayList<>(funcionarios);
		soMenores.removeIf( f -> f.getIdade() >= 18);
		soMenores.forEach(System.out::println);
		
		// map() executa uma função para cada elemento da lista
		System.out.println("\nExemplo Map e Function");
		funcionarios.stream()
					.map(f -> f.getSalario() * 1.5f)
					.forEach(System.out::println);

		System.out.println("\nObtém somente as idades com map");
		funcionarios.stream()
				    .map(Funcionario::getIdade)
				    .forEach(System.out::println);
		
		
		System.out.println("\nObtém somente as idades com mapToInt");
		funcionarios.stream()
					.mapToInt(Funcionario::getIdade)
					.forEach(System.out::println);
		
		System.out.println("\nAcha a menor idade");
		int menorIdade = funcionarios.stream()
									 .mapToInt(Funcionario::getIdade)
									 .min()
									 .getAsInt();
		System.out.println("Menor idade: " + menorIdade);
		
		
		System.out.println("\nAcha a maior idade");
		int maiorIdade = funcionarios.stream()
				.mapToInt(Funcionario::getIdade)
				.max()
				.getAsInt();
		System.out.println("Maior idade: " + maiorIdade);
		
		System.out.println("\nMédia das idades");
		double mediaIdades = funcionarios.stream()
										 .mapToInt(Funcionario::getIdade)
										 .average()
										 .getAsDouble();
		System.out.println(mediaIdades);
		
		System.out.println("\nMédia dos salários");
		double mediaSalarios = funcionarios.stream()
											.mapToDouble(Funcionario::getSalario)
											.average()
											.getAsDouble();
		System.out.printf("R$ %.2f", mediaSalarios);
		
		System.out.println("\nOrdenando por idade:");
		funcionarios.stream()
					.sorted(Comparator.comparingInt(Funcionario::getIdade))
					.forEach(System.out::println);
		
		System.out.println("\nOrdenando por idade (reverso):");
		funcionarios.stream()
					.sorted(Comparator.comparingInt(Funcionario::getIdade).reversed())
					.forEach(System.out::println);
		
		System.out.println("\nMenor salário:");
		double menorSalario = funcionarios.stream()
										  .mapToDouble(Funcionario::getSalario)
										  .min()
										  .getAsDouble();
		System.out.printf("R$ %.2f\n", menorSalario);
		
		System.out.println("\nSoma dos salários");
		double somaSalarios = funcionarios.stream()
										  .mapToDouble(Funcionario::getSalario)
										  .sum();
		System.out.printf("R$ %.2f\n", somaSalarios);
		
		System.out.println("\nIdade entre 18 e 50 anos");
		funcionarios.stream()
					.filter(f -> f.getIdade() >= 18 && f.getIdade() <= 50)
					.forEach(System.out::println);
		
		System.out.println("\nSalarios entre 3000 e 9000 com idade entre 18 e 50 anos");
		funcionarios.stream()
					.filter(f -> f.getIdade() >= 18 && f.getIdade() <= 50)
					.filter(f -> f.getSalario() >= 3000 && f.getSalario() <= 9000)
					.forEach(System.out::println);
		
		System.out.println("\nFiltrando os nomes que iniciam com a letra A");
		funcionarios.stream()
				    .filter(f -> f.getNome().toUpperCase().startsWith("A"))
				    .forEach(System.out::println);
		
		System.out.println("\nFiltrando os nomes que terminam em el");
		funcionarios.stream()
					.filter(f -> f.getNome().toLowerCase().endsWith("el"))
					.forEach(System.out::println);
		
		
		System.out.println("\nfiltrando nomes com múltiplos predicados ");
		Predicate<Funcionario> iniciaComA = f-> f.getNome().startsWith("A");
		Predicate<Funcionario> iniciaComR = f-> f.getNome().startsWith("R");
		Predicate<Funcionario> iniciaComM = f-> f.getNome().startsWith("M");
		Predicate<Funcionario> naoContemF = f-> !f.getNome().contains("F");
		Predicate<Funcionario> predComplexo = iniciaComA.or(iniciaComR).or(iniciaComM).and(naoContemF);
		
		funcionarios.stream()
					.filter(predComplexo)
					.forEach(System.out::println);
		
		System.out.println("\nFiltrando salários com múltiplos predicados (or)");
		Predicate<Funcionario> salMenorQue = f -> f.getSalario() < 2000;
		Predicate<Funcionario> salMaiorQue = f -> f.getSalario() > 10000;
		
		funcionarios.stream()
					.filter(salMenorQue.or(salMaiorQue))
					.forEach(f -> System.out.println(f + "\tSalario: R$ " + f.getSalario()));
					
		
		System.out.println("\nFiltrando salários com múltiplos predicados (and)");
		Predicate<Funcionario> salEntre2000 = f -> f.getSalario() >= 2000;
		Predicate<Funcionario> salEntre10000 = f -> f.getSalario() <= 10000;
		
		funcionarios.stream()
					.filter(salEntre2000.and(salEntre10000))
					.forEach(f -> System.out.println(f + "\tSalario: R$ " + f.getSalario()));
		
		
		
	}

}
