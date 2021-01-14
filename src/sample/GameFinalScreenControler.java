package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class GameFinalScreenControler {

    /*
        * Slut sida
        * avsuta spel
        * starta om ett spel
        * navigering till start sida
        * länkad till plyeBord, innerView
     */

    @FXML
    GridPane _fanalGridPane;
    @FXML
    VBox _fanalVboxCenter;
    @FXML
    ImageView _imageViewCenterLog;
    @FXML
    Button _fanalButtonCenterGameRestart;
    @FXML
    Button _fanalButtonCenterStartPage;
    @FXML
    Button _fanalButtonCneterExit;

    public void initialize() {
        _fanalVboxCenter.getStyleClass().add("vboxCenterGameSeting");
        _fanalButtonCenterGameRestart.getStyleClass().add("buttonCenterGameStart");
        _fanalButtonCenterStartPage.getStyleClass().add("buttonCenterGemeLevel");
        _fanalButtonCneterExit.getStyleClass().add("buttonCneterExit");
        _fanalGridPane.getStyleClass().add("FanalBorderPane");
        _fanalVboxCenter.setMargin(_imageViewCenterLog, new Insets(30, 1, 10, 0));
        _fanalVboxCenter.setMargin(_fanalButtonCenterGameRestart, new Insets(30, 1, 30, 0));
        _fanalVboxCenter.setMargin(_fanalButtonCenterStartPage, new Insets(0, 1, 10, 0));
        _fanalVboxCenter.setMargin(_fanalButtonCneterExit, new Insets(150, 1, 0, 0));
    }
    public void onExitClick(ActionEvent actionEvent) {
        System.exit(0);
    }
    public void onButtonCenterGemeRetart(ActionEvent actionEvent) throws IOException {
        GridPane pene = FXMLLoader.load(getClass().getResource("plyeBord.fxml"));
        _fanalGridPane.getChildren().setAll(pene);

    }
    public void onButtonCenterStartPage(ActionEvent actionEvent) throws IOException {
        GridPane pene = FXMLLoader.load(getClass().getResource("innerView.fxml"));
        _fanalGridPane.getChildren().setAll(pene);
    }
}
