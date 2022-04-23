package heranca;

public abstract class Felino extends Animal {

	public void correr() {
		System.out.println("Felino correr...");
	}
	
	
	@Override
	final public void dormir() {
		System.out.println("Felino dormindo...");
		
	}
	
}
