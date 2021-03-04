package OpenJFX;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) {
		Path rutaFicheroFXML = Paths.get("/OpenJFX/vista", "altaClientes.fxml");
		Path rutaFicheroFXML2 = Paths.get("/OpenJFX/vista", "altaTitulo.fxml");
		Parent root = null;
		// We need to add a try catch to avoid Exceptions if the fxml document doesn't
		// exist.
		try {
			// FXMLLoader join our Front View FXML document (Main.fxml) and the Control Java
			// class (MainController.java)
			root = FXMLLoader.load(getClass().getResource(rutaFicheroFXML.toString()));
		} catch (IOException e) {
			System.out.print("EXCEPCION: No es capaz de encontrar Main.fxml");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java "
		// + javaVersion + "." );
		var scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
