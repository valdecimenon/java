package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class LayoutVbox extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		VBox painelVertical = new VBox();
		painelVertical.setSpacing(20);
		painelVertical.setAlignment(Pos.CENTER);
		
		Rectangle retAzul = new Rectangle(100, 50);
		retAzul.setFill(Color.BLUE);
		
		Rectangle retVerde = new Rectangle(100, 50);
		retVerde.setFill(Color.GREEN);
		
		Rectangle retVermelho = new Rectangle(100, 50);
		retVermelho.setFill(Color.RED);
		
		painelVertical.getChildren().addAll(retAzul, retVerde, retVermelho);
		
		Scene cena = new Scene(painelVertical, 200, 250);
		stage.setTitle("Layout VBox");
		stage.setScene(cena);
		stage.show();
		
	}

}
