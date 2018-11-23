import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Emily Nascimento
 */
public class HelloWorldJavaFX extends Application{
    public static void Main (String[] args){
        launch();
    }
    
    @Override
    public void start(Stage palco){
        //Personagem
      Label texto = new Label("Último dia de aula");
        //história
      StackPane historia = new StackPane();
      historia.getChildren().add(texto);
        //cena
      Scene cena = new Scene(historia, 300, 300);
        //colocando a cena no Palco
      palco.setScene (cena);
      palco.show();
      
      
    }
    
}
