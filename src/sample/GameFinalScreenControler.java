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
    @FXML
    GridPane _fanalGridPane;
    @FXML
    VBox _vboxCenterGameFinal;
    @FXML
    ImageView _imageViewCenterLog;
    @FXML
    Button _buttonCenterGameRestart;
    @FXML
    Button _buttonCenterStartPage;
    @FXML
    Button _buttonCneterExit;

    public void initialize() {
        _vboxCenterGameFinal.getStyleClass().add("vboxCenterGameSeting");
        _buttonCenterGameRestart.getStyleClass().add("buttonCenterGameStart");
        _buttonCenterStartPage.getStyleClass().add("buttonCenterGemeLevel");
        _buttonCneterExit.getStyleClass().add("buttonCneterExit");
        _fanalGridPane.getStyleClass().add("FanalBorderPane");
        _vboxCenterGameFinal.setMargin(_imageViewCenterLog, new Insets(30, 1, 10, 0));
        _vboxCenterGameFinal.setMargin(_buttonCenterGameRestart, new Insets(30, 1, 30, 0));
        _vboxCenterGameFinal.setMargin(_buttonCenterStartPage, new Insets(0, 1, 10, 0));
        _vboxCenterGameFinal.setMargin(_buttonCneterExit, new Insets(150, 1, 0, 0));
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
