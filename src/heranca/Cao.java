package heranca;

// classe filha
public class Cao extends Animal {

	public void latir() {
		System.out.println("C�o latindo...");
	}

	@Override
	public void dormir() {
		System.out.println("C�o dormindo...");
		
	}
}
