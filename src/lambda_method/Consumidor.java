package lambda_method;

import java.util.function.Consumer;

import dominio.Funcionario;

/*
 * O que � uma interface funcional?
 * Qualquer interface que possua um �nico m�todo abstrato � chamado de interface funcional
 * Obs.: m�todos marcados com a palavra reservada default, s�o m�todos especiais e s�o
 * implementados unicamente dentro de interfaces, por isso n�o contam como m�todo abstrato.
 */

/*
 * Aqui temos a interface funcional Consumer que implementa o �nico m�todo abstrato: accept()
 */
public class Consumidor implements Consumer<Funcionario> {

	@Override
	public void accept(Funcionario p) {
		System.out.println(p);
	}

}
