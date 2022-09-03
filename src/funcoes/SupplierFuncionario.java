package funcoes;

// o pacote java.util.function cont�m interfaces funcionais
import java.util.function.Supplier;
import dominio.Funcionario;

/*
 * Conceito Factory
 * O que � um factory?
 * � um Design Pattern (padr�o de projeto)
 * � uma f�brica de objetos, ou seja, uma classe com
 * um m�todo que instancia e retorna determinado objeto.
 * 
 * Supplier cria um objeto atrav�s do construtor padr�o do objeto (sem argumentos)
 * Supplier � uma interface funcional com um �nico m�todo: get()
 */
public class SupplierFuncionario implements Supplier<Funcionario>{

	// get cria um objeto usando o construtor padr�o (sem argumentos)
	@Override
	public Funcionario get() {
		return new Funcionario();
	}

}
