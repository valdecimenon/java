package exemplo_interface;

// uma interface � como uma classe 100% abstrata
// ou seja, todos os m�todos s�o implicitamente abstratos.
// Voc� pode interpretar uma interface como sendo um contrato
public interface ControleRemoto {

	// m�todos implicitamente p�blico e abstrato
	void mudarCanal(int canal);
	
	void aumentarVolume(int taxa);
	
	void diminuirVolume(int taxa);
	
	boolean ligar();
	
	boolean desligar();
}
