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
    /*
        * bagrund
        * positonering av boxar
        * länkad till innerView

    */
    @FXML
    GridPane _controllerGridTop;
    @FXML
    HBox _controllerHboxTop;
    @FXML
    ImageView _imageViewTop;
    @FXML
    GridPane _controllerGridLeft;
    @FXML
    VBox _controllerVboxLeft;
    @FXML
    Pane _controllerPeneLeft;
    @FXML
    Pane _controllerPeneLeft2;
    @FXML
    GridPane _controllerGridRight;
    @FXML
    VBox _controllerVboxRhigt;
    @FXML
    Pane _controllerPeneRhigt;
    @FXML
    Pane _controllerPeneRhigt2;
    @FXML
    GridPane _controllerGridBottom;

    @FXML
    GridPane _controllerGridCenter;
    @FXML


    public void initialize() throws IOException {
        _controllerGridTop.getStyleClass().add("controllerGridTop");
        _controllerHboxTop.getStyleClass().add("hboxTop");
        _controllerGridBottom.getStyleClass().add("gridBottom");
        _controllerGridLeft.getStyleClass().add("gridLeft");
        _controllerGridRight.getStyleClass().add("gridRiht");
        _controllerPeneRhigt.getStyleClass().add("peneRhigt");
        _controllerPeneRhigt2.getStyleClass().add("peneRhigt2");
        _controllerPeneLeft.getStyleClass().add("peneRLeft");
        _controllerPeneLeft2.getStyleClass().add("peneRLeft2");
        _controllerGridCenter.getStyleClass().add("gridCenter");

        _controllerVboxLeft.setMargin(_controllerPeneLeft,new Insets(1,1,50,1));
        _controllerVboxRhigt.setMargin(_controllerPeneRhigt,new Insets(1,1,50,1));
        _controllerVboxRhigt.setMargin(_controllerPeneRhigt2,new Insets(1,1,150,1));
        _controllerVboxLeft.setMargin(_controllerPeneLeft2,new Insets(1,1,150,1));
        _controllerHboxTop.setMargin(_imageViewTop,new Insets(1,1,1,35));
        chenge();
    }
    public void chenge() throws IOException {
        GridPane pene = FXMLLoader.load(getClass().getResource("innerView.fxml"));
        _controllerGridCenter.getChildren().setAll(pene);
    }


}
