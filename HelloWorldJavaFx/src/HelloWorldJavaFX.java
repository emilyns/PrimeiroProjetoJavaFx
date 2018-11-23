import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
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
      Rectangle ceu = new Rectangle(900, 450);
      Rectangle mar = new Rectangle(900, 450);
      Circle sol = new Circle(90);
      
        //história
      StackPane historia = new StackPane();
      historia.getChildren().addAll(ceu, sol, mar);
        //cena
      Scene cena = new Scene(historia, 900, 900);
        //colocando a cena no Palco
      palco.setScene (cena);
      palco.show();
      
      
    }
    
}
