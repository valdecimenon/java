package heranca;

public class Tigre extends Felino {

	public void rugir() {
		System.out.println("Tigre rugindo... rooooa");
	}

	@Override
	public void dormir() {
		System.out.println("Tigre dormindo...");
	}
}
