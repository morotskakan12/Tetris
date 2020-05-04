package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.io.IOException;


public class PlyeBordControler {
    @FXML
    GridPane _contaner;
    @FXML
    GridPane _gameFild;
    CreateBlock cb = new CreateBlock();
    public void initialize() throws IOException {

        _gameFild.getStyleClass().add("gameFild");
        cb.setGameBord(_gameFild);
        time();


    }


    public void time() throws IOException {
       int  timeSeconds = 15;


        Timeline timeline1 = new Timeline();
        timeline1.setCycleCount(Timeline.INDEFINITE);
        timeline1.getKeyFrames().add(new KeyFrame(
                Duration.seconds(2),
                ae -> {
                    _gameFild = cb.getGemeBlock(_gameFild);

                }));


       Timeline timeline = new Timeline(new KeyFrame(
                Duration.seconds(20),
                ae -> {
                    try {
                        chenge();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }));


        timeline1.playFromStart();

        timeline.play();
    }
    public void chenge() throws IOException {
        GridPane pene = FXMLLoader.load(getClass().getResource("gameFinalScreen.fxml"));
        _contaner.getChildren().setAll(pene);
    }


}
