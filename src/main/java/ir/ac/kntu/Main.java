package ir.ac.kntu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author mhrimaz
 */
public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Circle circle = new Circle(150,150,100,Color.RED);
        Button button = new Button("Hit the Soldier");
        button.setLayoutX(100);
        button.setLayoutY(300);


        Soldier soldier = new Soldier();

        button.setOnMouseClicked(event->{
            System.out.println("event = " + event);
            soldier.setHealth(soldier.getHealth()-10);
        });
        //TODO: Create your observer

        Pane root = new Pane(circle,button);
        Scene scene = new Scene(root,300,350);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
