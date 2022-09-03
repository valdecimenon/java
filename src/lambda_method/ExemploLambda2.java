package lambda_method;

public class ExemploLambda2 {

	public static void main(String[] args) {
		// criando um objeto Runnable com classe an�nima
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for (int i=0; i<10; i++) {
					System.out.println("An�nima: " + i);
				}
			}
		};
		
		new Thread(r).start();
		
		// agora vamos reescrever o c�digo acima usando lambda
		System.out.println("\n\n\n");
		
		new Thread(() -> {
			for (int i=0; i<10; i++) {
				System.out.println("Lambda: " + i);
			}
		}).start();
		
	}
}
