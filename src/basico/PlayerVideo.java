package basico;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PlayerVideo extends Application {

	public static void main(String[] args) {
		System.out.println("\nCarregando video da web...");
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		// carrega o video
		Media media = new Media("https://softgraf.com/cursojava/multimidia/remedio.mp4");
		// cria um player
		MediaPlayer player = new MediaPlayer(media);
		// cria um visualizador para o player
		MediaView view = new MediaView(player);
		
		
		StackPane painel = new StackPane();
		painel.getChildren().add(view);
		
		Scene cena = new Scene(painel, 1400, 800);
		stage.setTitle("Mostrando v�deo com JavaFX");
		stage.setScene(cena);
		stage.show();
		
		// exibe o v�deo
		player.play();
		
	}

}
