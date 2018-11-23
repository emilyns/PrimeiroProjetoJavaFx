
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Emily Nascimento
 */
public class HelloWorldJavaFX extends Application{
    public static void Main (String[] args){
        launch();
    }
    
    String musica = getClass().getResource("bestpart.mp3").toString();
    
    @Override
    public void start(Stage palco){
        //trilha sonora
        AudioClip clip = new AudioClip(musica);
        clip.play();
        
        //Personagem
      Rectangle ceu = new Rectangle(900, 450, Color.DARKORANGE);
      Rectangle mar = new Rectangle(900, 450, Color.LIGHTSKYBLUE);
      Circle sol = new Circle(90, Color.YELLOW);
      
        //posicionamento
        ceu.setTranslateY(-200);
        mar.setTranslateY(200);
        sol.setTranslateY(50);
        
        //movimento
        TranslateTransition move = new TranslateTransition(Duration.millis(4000), sol);
        move.setByY(-400);
        move.setCycleCount(Timeline.INDEFINITE);
        move.setAutoReverse(true);
        move.play();
        
        // transição de cor
        FadeTransition ft = new FadeTransition(Duration.millis(4000), ceu);
        ft.setFromValue(1.0);
        ft.setToValue(0.5);
        ft.setCycleCount(Timeline.INDEFINITE);
        ft.setAutoReverse(true);
        ft.play();
        
        //CSS
        mar.setStyle("-fx-fill: "
            + "linear-gradient(#7FFFD4, #00CED1),"
            + "linear-gradient(#008B8B, #1E90FF),"
            + "linear-gradient(#1E90FF, #00008B),"
            + "linear-gradient(#00CED1 0%, #20B2AA 50%, #0000CD 100%),"
            + "linear-gradient(from 0% 0% to 55% 50%, "
            + "rgba(255,255,255,0.9), rgba(255,255,255,0));");
        
        ceu.setStyle("-fx-fill: "
           
            + "linear-gradient(#FF4500, #FF8C00),"
            + "linear-gradient(#FFA500, #FFD700),"
            + "linear-gradient(#e68400, #ffd65b),"
            + "linear-gradient(#ffe657 100%, #f8c202 50%, #eea10b 0%),"
            + "linear-gradient(from 0% 0% to 55% 50%, "
            + "rgba(255,255,255,0.9), rgba(255,255,255,0));");


        
      

        
      
        //história
      StackPane historia = new StackPane();
      historia.getChildren().addAll(ceu, sol, mar);
        //cena
      Scene cena = new Scene(historia, 900, 900);
        //colocando a cena no Palco
      palco.setScene (cena);
      palco.setTitle("Patamares");
      palco.show();
      
      
    }
    
}
