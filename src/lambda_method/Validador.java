package lambda_method;

/*
 * Aqui criamos nossa pr�pria interface funcional
 * Podemos marcar uma interface funcional explicitamente, mais isso � opcional.
 * por�m se uma interface for anotada e adicionarmos mais de um m�todo,
 * ocorre um erro de compila��o.
 */
@FunctionalInterface
public interface Validador<T> {

	boolean validar(T t);
	
}
