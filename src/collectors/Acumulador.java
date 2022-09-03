package collectors;

import java.util.ArrayList;
import java.util.function.BiConsumer;

import dominio.Funcionario;
/*
 * ====> Adiciona apenas um objeto Funcionario � cole��o
 * 
 * BiConsumer � uma interface funcional que cont�m o m�todo accept(),
 * que ser� invocado para adiconar cada elemento � lista passada.
 */

public class Acumulador implements BiConsumer<ArrayList<Funcionario>, Funcionario> {

	@Override
	public void accept(ArrayList<Funcionario> lista, Funcionario f) {
		lista.add(f);
	}

}
