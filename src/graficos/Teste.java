package graficos;

public class Teste {

	public static void main(String[] args) {

		int temp = 11;

		if (temp < 0)
			System.out.println("Congelando...");

		else if (temp >= 0 && temp <= 20)
			System.out.println("Frio");

		else if (temp >= 21 && temp <= 25)
			System.out.println("Normal");

		else if (temp >= 26 && temp <= 35)
			System.out.println("Quente");

		else
			System.out.println("Muito Quente!");

	}

}
