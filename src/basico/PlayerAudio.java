package basico;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PlayerAudio extends Application {

	public static void main(String[] args) {
		System.out.println("\nCarregando audio da web...");
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		// carrega o clip de �udio
		AudioClip audio = new AudioClip("https://softgraf.com/cursojava/multimidia/musica.wav");
		
		StackPane painel = new StackPane();
		painel.getChildren().add(new Text("Tocando M�sica..."));
		
		Scene cena = new Scene(painel, 300, 100);
		stage.setTitle("Tocando �udio com JavaFX");
		stage.setScene(cena);
		stage.show();
		
		// toca o �udio
		audio.play();
		
	}

}
