package funcoes;

import java.util.function.BiFunction;

import dominio.Funcionario;

/*
 * BiFunction é uma interface funcional que permite chamar um construtor de 2 argumentos
 */
public class BiFuncaoFuncionario implements BiFunction<String, Integer, Funcionario>{

	// apply cria um objeto usando o construtor de 02 argumento
	@Override
	public Funcionario apply(String nome, Integer idade) {
		return new Funcionario(nome, idade);
	}

}
