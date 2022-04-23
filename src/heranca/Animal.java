package heranca;

// classe mãe
abstract public class Animal  {

	private String especie = "mamifero";
	private String tamanho;
	private boolean faminto;
	
	

	public String getEspecie() {	
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isFaminto() {
		return faminto;
	}

	public void setFaminto(boolean faminto) {
		this.faminto = faminto;
	}
	
	public void deslocar() {
		System.out.println("Animal deslocando se...");
	}
	
	public void comer() {
		System.out.println("Animal comendo...");
	}
	
	// assinatura do método
	abstract public void dormir();

}
