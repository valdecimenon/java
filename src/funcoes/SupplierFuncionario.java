package funcoes;

// o pacote java.util.function contém interfaces funcionais
import java.util.function.Supplier;
import dominio.Funcionario;

/*
 * Conceito Factory
 * O que é um factory?
 * é um Design Pattern (padrão de projeto)
 * é uma fábrica de objetos, ou seja, uma classe com
 * um método que instancia e retorna determinado objeto.
 * 
 * Supplier cria um objeto através do construtor padrão do objeto (sem argumentos)
 * Supplier é uma interface funcional com um único método: get()
 */
public class SupplierFuncionario implements Supplier<Funcionario>{

	// get cria um objeto usando o construtor padrão (sem argumentos)
	@Override
	public Funcionario get() {
		return new Funcionario();
	}

}
