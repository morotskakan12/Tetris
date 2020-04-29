package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;


import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import java.io.IOException;


public class Controller {

    @FXML
    GridPane _gridTop;
    @FXML
    HBox _hboxTop;
    @FXML
    ImageView _imageViewTop;
    @FXML
    GridPane _test;
    @FXML
    GridPane _gridLeft;
    @FXML
    VBox _vboxLeft;
    @FXML
    Pane _peneLeft;
    @FXML
    Pane _peneLeft2;
    @FXML
    GridPane _gridRight;
    @FXML
    VBox _vboxRhigt;
    @FXML
    Pane _peneRhigt;
    @FXML
    Pane _peneRhigt2;
    @FXML
    GridPane _gridBottom;

    @FXML
    GridPane _gridCenter;
    @FXML




    public void initialize() throws IOException {
        _gridTop.getStyleClass().add("gridTop");
        _hboxTop.getStyleClass().add("hboxTop");
        _gridBottom.getStyleClass().add("gridBottom");
        _gridLeft.getStyleClass().add("gridLeft");
        _gridRight.getStyleClass().add("gridRiht");
        _peneRhigt.getStyleClass().add("peneRhigt");
        _peneRhigt2.getStyleClass().add("peneRhigt2");
        _peneLeft2.getStyleClass().add("peneRLeft2");
        _peneLeft.getStyleClass().add("peneRLeft");
        _gridCenter.getStyleClass().add("gridCenter");

        

        _vboxLeft.setMargin(_peneLeft,new Insets(1,1,50,1));
        _vboxRhigt.setMargin(_peneRhigt,new Insets(1,1,50,1));
        _vboxRhigt.setMargin(_peneRhigt2,new Insets(1,1,150,1));
        _vboxLeft.setMargin(_peneLeft2,new Insets(1,1,150,1));
        _hboxTop.setMargin(_imageViewTop,new Insets(1,1,1,35));
        chenge();
    }
    public void chenge() throws IOException {
        GridPane pene = FXMLLoader.load(getClass().getResource("innerView.fxml"));
        _gridCenter.getChildren().setAll(pene);
    }


}
