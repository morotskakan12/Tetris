package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
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

    Pane _gameFildContent = new Pane();
    public void initialize() throws IOException {

        _gameFild.getStyleClass().add("gameFild");

        time();
        for(int i = 0; i <= 9; i++ ) {
            for (int e = 0; e <= 19; e++){
                _gameFild =  plyeBordBox(_gameFild, i , e);

            }
        }

    }
    public static GridPane plyeBordBox (GridPane _gameFild, int i, int e){
        Rectangle temp = new Rectangle();
        temp.setFill(Color.BLACK);
        temp.setStroke(Color.RED);
        temp.setStrokeWidth(0.5);
        temp.setHeight(24.5);
        temp.setWidth(24.5);
        _gameFild.add(temp,i,e);

        return _gameFild;
    }


    public void time() throws IOException {

        Timeline timeline1 = new Timeline(new KeyFrame(
                Duration.seconds(2),
                ae -> {
                    _gameFild = addBlock(_gameFild);
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

        timeline1.play();
        timeline.play();
    }
    public void chenge() throws IOException {
        GridPane pene = FXMLLoader.load(getClass().getResource("gameFinalScreen.fxml"));
        _contaner.getChildren().setAll(pene);
    }
    public GridPane addBlock(GridPane _gameFild){

        _gameFild.add(block(),0 ,0);

        return _gameFild;
    }

    public Rectangle block(){
        Rectangle temp = new Rectangle();
        temp.getStyleClass().add("tempBlock");
        temp.setStyle("-fx-background-color: #d3b7ff");
        return temp;
    }

}
