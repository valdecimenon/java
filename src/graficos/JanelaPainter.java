package graficos;

import javax.swing.JFrame;

public class JanelaPainter extends JFrame {

	public JanelaPainter() {
		super("Painter Psicod�lico usando modo gr�fico");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// substitui o painel atual pelo personalizado
		setContentPane(new PainelPainter());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JanelaPainter();

	}

}
