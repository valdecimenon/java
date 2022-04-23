package heranca;

// classe filha
public class Cao extends Animal {

	public void latir() {
		System.out.println("Cão latindo...");
	}

	@Override
	public void dormir() {
		System.out.println("Cão dormindo...");
		
	}
}
