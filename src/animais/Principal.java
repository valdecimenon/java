package animais;

public class Principal {

	public static void main(String[] args) {
		
		// cria um objeto animal
		Animal animal = new Animal();
		animal.nome = "Tot�";
		animal.especie = "Mam�fero";
		
		// a partir do objeto acesso os m�todos
		animal.dormir();
		animal.comer();
		animal.locomover();
		
		// cria um objeto do tipo Mamifero
		Mamifero mamifero = new Mamifero();
		mamifero.comer();
		mamifero.dormir();
		mamifero.locomover();
		mamifero.mamar();
		
		// cria um objeto do tipo Reptil
		Reptil reptil = new Reptil();
		reptil.rastejar();
		reptil.dormir();
		
		// cria um objeto do tipo Ave
		Ave ave = new Ave();
		ave.voar();
		ave.dormir();
		
		// cria um objeto do tipo Cao
		Cao cao = new Cao();
		cao.latir();
		cao.locomover();
		
		// cria um objeto do tipo Gato
		Gato gato = new Gato();
		

		
		// cria um objeto do tipo Gatito
		//Gatito gatito = new Gatito();
		//gatito.baguncar();

	}

}
