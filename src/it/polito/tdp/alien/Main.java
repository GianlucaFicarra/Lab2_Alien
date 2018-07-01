package it.polito.tdp.alien;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

/*FUNZIONAMENTO:
   -Inserire una nuova parola e la relativa traduzione secondo il seguente pattern:
	<parola aliena> <traduzione> (separate da uno spazio)
	Cliccando sul bottone Translate la parola viene aggiunta al dizionario.

	-Cercare la traduzione di una parola esistente inserendo <parola aliena> e facendo click sul bottone
	Translate. La traduzione verrà visualizzata nell’area di testo sottostante.
*/

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Alien.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
