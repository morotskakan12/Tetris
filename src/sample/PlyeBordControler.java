package sample;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;



public class PlyeBordControler {
    @FXML
    BorderPane _contaner;


    @FXML
    GridPane _gameFild;

    Pane _gameFildContent = new Pane();
    public void initialize() {

        _gameFild.getStyleClass().add("gameFild");

            for(int i = 0; i <= 250; i = i + 25 ) {
                _gameFildContent = PlyeBordBox(_gameFildContent, i, 0);
            }
           for(int i = 0; i <500;i = i + 25)       {
                _gameFildContent = PlyeBordBox(_gameFildContent,0,i ) ;
            }
            _gameFild.getChildren().add(_gameFildContent);
    }
    public static Pane PlyeBordBox(Pane temp, int positonX,int positonY ){
        Rectangle rectangle = new Rectangle();
        rectangle.setFill(Color.rgb(80,80,80));

            if (positonY == 0) {
                rectangle.setHeight(500);
                rectangle.setWidth(1);
            }else {

                rectangle.setHeight(1);
                rectangle.setWidth(250);
            }
        rectangle.setX(positonX);
        rectangle.setY(positonY);
        temp.getChildren().add(rectangle);
        return temp;
    }

}
